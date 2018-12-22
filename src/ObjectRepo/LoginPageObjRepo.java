package ObjectRepo;

import org.openqa.selenium.By;

public class LoginPageObjRepo {

	protected  By username= By.xpath("//input[@name='uid']");
	protected By password=By.xpath("//input[@name='password']");
	protected By passNext=By.xpath("//input[@value='LOGIN']");
	protected By logOut=By.xpath("//a[contains(text(),'Log out')]");
	
}
