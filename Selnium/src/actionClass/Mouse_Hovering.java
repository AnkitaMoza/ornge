package actionClass;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hovering {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement performance =driver.findElement(By.xpath("//*[text()='Performance']"));
		Actions act =new Actions(driver);
		act.moveToElement(performance).perform();
		Thread.sleep(1000);
		WebElement review=driver.findElement(By.xpath("//*[text()='Manage Reviews']"));
		act.moveToElement(review).perform();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(By.xpath("//*[text()='My Reviews']"))).perform();
	}
}
