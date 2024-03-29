package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PimPage extends BaseTest {
	
	@FindBy(xpath="//h6[text()='PIM']") 
	WebElement txtPage;
	
public PimPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	
public void login() {
	lp.login();
}

public String pimTitle() {
	
	return txtPage.getText();
}
}
