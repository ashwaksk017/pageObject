package testClasses;

import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjectClasses.HomePage;
import PageObjectClasses.LoginPage;
import utilities.BaseClass;

public class CreateNewAccount extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;
	
	@Parameters({"browser","endRow","startRow","csvFile"})
	public CreateNewAccount(String browser,int endRow,int startRow, String csvFile ) {
		super(browser,endRow,startRow,csvFile);
	}

	
	@Test(dataProvider="csvData")
	public void createNewAccountFromHomePage(Map<String, String> map) {
		loginPage=navigateToApplication();		
		homePage=loginPage.Login(map);
		homePage.clickOncreateNewAccountLink();
		/*CloseBrowser();*/
		
	}

	

}
