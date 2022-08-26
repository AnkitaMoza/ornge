package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {

	@FindBy(xpath="//*[text()='Username']//parent::div//parent::div//input")
	WebElement username;
	
	@FindBy(xpath="//*[text()='Password']//parent::div//parent::div//input")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	@FindBy(xpath="//*[text()=' Login ']//parent::div//following-sibling::div//p") 
	WebElement forgotPassword;
	@FindBy(linkText="http://www.orangehrm.com") 
	WebElement companyPage;
	@FindBy(xpath="//*[@class='oxd-userdropdown-tab']//i") 
	WebElement logoutdrop;
	@FindBy(xpath="//*[text='Logout']") 
	WebElement logout;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
}
	
public boolean username() {
	return username.isDisplayed();
	
}

public boolean password() {

	return password.isDisplayed();
}
public boolean btnlogin() {
	return btnLogin.isDisplayed();
}

public void login() {
	username.sendKeys("Admin");
	password.sendKeys("admin123");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	btnLogin.click();
	
}

public void logout() {
	logoutdrop.click();
	logout.click();
	}

}
