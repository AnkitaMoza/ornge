package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://mbasic.facebook.com/");
			driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//*[@name='sign_up']")).click();
		WebElement year = driver.findElement(By.id("year"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		
		Select selyear = new Select(year);
		//selyear.selectByValue("1996");  //selectByValue();
		selyear.selectByVisibleText("1996");
		
		Select selmonth = new Select(month);
		//selmonth.selectByValue("1");
		//selmonth.selectByIndex(1);
		selmonth.selectByVisibleText("Jan"); //slectByVisibleText()
		
		Select selday = new Select(day);
		//selday.selectByValue("10");
		selday.selectByVisibleText("10");
		//selday.selectByIndex(9);
		Thread.sleep(3000);
		driver.quit();
		}

}