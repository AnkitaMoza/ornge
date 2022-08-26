package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker2")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[contains(text(),'▲')]")).click();
		WebElement year = driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select selyear =new Select(year);
		selyear.selectByVisibleText("1996");
		Thread.sleep(500);
		WebElement month =driver.findElement(By.xpath("//select[@title='Change the month']")); 
		Select selmonth =new Select(month); selmonth.selectByVisibleText("January");	
		Thread.sleep(500);
		WebElement day = driver.findElement(By.xpath("//a[text()='10']"));
		Thread.sleep(1000);
		day.click();
	}	
}
