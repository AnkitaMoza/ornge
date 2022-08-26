package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling1 {

public static void  main(String []args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//*[text()='Username']//parent::div//following-sibling::div//input")));

	driver.findElement(By.xpath("//*[text()='Username']//parent::div//following-sibling::div//input"))
			.sendKeys("Admin");

	driver.findElement(By.xpath("//*[text()='Password']//parent::div//following-sibling::div//input"))
			.sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();

	/*
	 * Actions act = new Actions(driver);
	 * act.moveToElement(driver.findElement(By.xpath("//*[text()='Admin']"))).click(
	 * ).build().perform(); // WebDriverWait w1 = new WebDriverWait(driver,
	 * Duration.ofSeconds(5));
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//div[text()='jhaey']//parent::div//preceding-sibling::div//label")
	 * )); JavascriptExecutor scroll = (JavascriptExecutor)driver; WebElement ele =
	 * driver.findElement(By.xpath(
	 * "//div[text()='jhaey']//parent::div//preceding-sibling::div//label"));
	 * act.click(ele).perform(); Thread.sleep(2000);
	 * scroll.executeScript("window.scrollBy(0,500)"); WebElement nina
	 * =driver.findElement(By.xpath("//*[text()='Nina.Patel']//parent::div"));
	 * scroll.executeScript("arguments[0].scrollIntoView()",nina);
	 * //Thread.sleep(500); //act.moveToElement(driver.findElement(By.xpath(
	 * "//*[text()='Kiyara.Hu']//parent::div"))).perform(); Thread.sleep(1000);
	 * //act.click(ele).perform();
	 */
	
}
}
