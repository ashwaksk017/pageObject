package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import PageObjectClasses.LoginPage;
import au.com.bytecode.opencsv.CSVReader;

public class BaseClass {
	WebDriver driver;
	String browser;
	int endRow;
	int startRow;
	String csvFile;
	PropertiesManager propertiesManager = PropertiesManager.PROPERTIES;

	public BaseClass(String browser) {
		this.browser = browser;
	}

	public BaseClass(String browser, int endRow, int startRow, String csvFile) {
		this.browser = browser;
		this.endRow = endRow;
		this.startRow = startRow;
		this.csvFile = csvFile;
	}

	public LoginPage navigateToApplication() {

		switch (browser) {

		case "chrome":
			driver = new ChromeDriver();

			break;

		default:
			break;

		}
		// IMPLICT WAIT
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		//driver.navigate().to("http://demo.guru99.com/V4/index.php");
		driver.navigate().to(propertiesManager.getProperty("env_url"));
		return new LoginPage(driver);

	}

	public void CloseBrowser() {

		driver.close();

	}

	@DataProvider(name = "csvData")
	public Object[][] provideCSVData() {
		Object[][] testNgData = null;
		try {
			CSVReader reader = new CSVReader(new FileReader(csvFile));
			String[] headers = reader.readNext();
			String[] inputLine = null;
			try {
				int counter = 1;
				int testNgDataIndex = 0;
				testNgData = new Object[endRow - startRow + 1][1];
				while ((inputLine = reader.readNext()) != null) {
					if (startRow <= counter && endRow >= counter) {
						Map<String, String> csvMap = new HashMap<String, String>();
						for (int index = 0; index < inputLine.length; index++) {
							csvMap.put(headers[index], inputLine[index]);
						}
						testNgData[testNgDataIndex++][0] = csvMap;
					}
					counter++;
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return testNgData;
	}

}
