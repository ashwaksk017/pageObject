package PageObjectClasses;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ObjectRepo.LoginPageObjRepo;
import utilities.Utilities;

public class LoginPage extends LoginPageObjRepo {
	WebDriver driver;
	WebDriverWait webDriverWait;
	
	//webDriverWait = new WebDriverWait(driver, 3,100);
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//

	public HomePage Login(Map<String, String> map) {

		Utilities util= new Utilities(driver);
		util.LoginInfo(map);
		util.fillInTextInfo(username,"mngr167177");
		util.fillInTextInfo(password,"Ugyhugu");
		util.click(passNext);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		util.click(logOut);
		util.closeBrowser();
		
		return new HomePage(driver);
	}

}
