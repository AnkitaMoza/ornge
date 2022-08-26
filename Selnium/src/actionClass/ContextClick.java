package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
	WebElement rClick =driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
	Actions act =new Actions(driver);
	act.contextClick(rClick).perform();
	Thread.sleep(1000);
	act.contextClick(driver.findElement(By.xpath("//*[text()='Quit']"))).perform();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	
}
}