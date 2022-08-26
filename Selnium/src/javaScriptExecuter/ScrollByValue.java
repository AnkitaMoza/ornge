package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
		 driver.findElement(By.xpath("//*[text()='Admin']")).click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,600)");		 
		 
		 
		 
	}
		 
}
