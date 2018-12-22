package utilities;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	WebDriver driver;
	WebDriverWait webDriverWait;
	
	public Utilities(WebDriver driver) {
		this.driver = driver;
		
	}
	public void fillInTextInfo(By path, String SomeString) {
		webDriverWait=new WebDriverWait(driver, 3,100);
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(path)).sendKeys(SomeString);
	}
	
	public void click(By path) {
		webDriverWait=new WebDriverWait(driver, 3,100);
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(path)).click();
	}
	public void LoginInfo(Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}

}
