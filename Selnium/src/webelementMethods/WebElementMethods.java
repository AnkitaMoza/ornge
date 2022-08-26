package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		  "//*[text()='Username']//parent::div//following-sibling::div//input")));
	
		 
		 driver.findElement(By.xpath("//*[text()='Username']//parent::div//following-sibling::div//input")).sendKeys("Admin");
	
		 driver.findElement(By.xpath("//*[text()='Password']//parent::div//following-sibling::div//input")).sendKeys("admin123");
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		  
		  Actions act =new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//*[text()='Admin']"))).perform();
		  Thread.sleep(500);
		  act.moveToElement(driver.findElement(By.xpath("//*[text()='PIM']"))).perform();
		  Thread.sleep(500);
		  act.moveToElement(driver.findElement(By.xpath("//*[text()='Leave']"))).perform();
		  Thread.sleep(500);
		  act.moveToElement(driver.findElement(By.xpath("//*[text()='Time']"))).perform();
		  
		  
		 
		
		
		
		
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[@role='banner']//label//input[@type='search']")));
		 * driver.findElement(By.xpath(
		 * "//div[@role='banner']//label//input[@type='search']")).click();
		 * driver.findElement(By.xpath(
		 * "//div[@role='banner']//label//input[@type='search']")).
		 * sendKeys("tarique siddiqui");
		 * driver.findElement(By.xpath("(//li)[1]")).click();
		 */
	}
}
