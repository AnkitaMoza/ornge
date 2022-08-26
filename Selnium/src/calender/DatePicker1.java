package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	public static void main (String [] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='imgdp']")).click();
		driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
		/*
		 * driver.findElement(By.xpath("//*[text()='Prev']")).click();
		 * WebElement m_y = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")); 
		 * String monthYear = m_y.getText(); 
		 * System.out.println(monthYear);
		 */
		  int a = 0; while(a < 1) 
		  { 
			  driver.findElement(By.cssSelector(".ui-datepicker-prev.ui-corner-all")).click();
			  WebElement m_y = driver.findElement(By.cssSelector(".ui-datepicker-title")); 
			  String monthYear = m_y.getText();  
			  if( monthYear.equals("January 1996")) {
			  driver.findElement(By.xpath("//*[text()='10']")).click();
			  break;
			   }
		  } 
	}
}
