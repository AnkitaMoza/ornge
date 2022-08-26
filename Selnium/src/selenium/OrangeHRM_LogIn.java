package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LogIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver aa=new ChromeDriver();
	    aa.get("https://opensource-demo.orangehrmlive.com/");
	    aa.manage().window().maximize();
	    WebElement chekcheading =aa.findElement(By.cssSelector("#logInPanelHeading"));
	    String heading = chekcheading.getText();
	    System.out.println(heading);
		aa.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		aa.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		aa.findElement(By.cssSelector(".button")).click();
	}
}
