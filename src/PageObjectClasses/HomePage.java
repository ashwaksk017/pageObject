package PageObjectClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepo.HomePageRepo;

public class HomePage extends HomePageRepo{
	WebDriver driver;
	//WebDriverWait webDriverWait;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOncreateNewAccountLink() {
		//reference http://www.seleniumeasy.com/selenium-tutorials/synchronization-in-selenium-webdriver
		/*Wait<WebDriver> wait = new FluentWait<>(driver)
					//Wait for the condition
			       .withTimeout(10, TimeUnit.SECONDS) 
			         // which to check for the condition with interval of 5 seconds. 
			       .pollingEvery(5, TimeUnit.SECONDS) 
			       //Which will ignore the NoSuchElementException
			       .ignoring(NoSuchElementException.class)
			       //will ignore illegal state Exception
			       .ignoring(IllegalStateException.class)
			       //send out string messages
			       .withMessage("will wait 5 secs");
		wait.until(ExpectedConditions.presenceOfElementLocated(createNewAccountLink)).click();*/
		driver.close();
		//driver.findElement(createNewAccountLink).click();
	}

}
