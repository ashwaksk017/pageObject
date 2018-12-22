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
		
		driver.close();
		//driver.findElement(createNewAccountLink).click();
	}

}
