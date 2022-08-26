package javaScriptExecuter;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToWebElement {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();  
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.xpath("//*[text()='Admin']")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript(null, args)
	
}
}
