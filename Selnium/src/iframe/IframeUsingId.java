package iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeUsingId {

		public static void main(String[] args) throws InterruptedException 
		{	
		WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
			Thread.sleep(1000);
			
			//Step1:Shift focus of selenium from main webpage to iframe
			//Method1:id attribute value
			//driver.switchTo().frame("iframeResult");
			
			//Method2:name attribute value
			//driver.switchTo().frame("iframeResult");
			
			//Method3:using index
			//driver.switchTo().frame(1);
			
			//Method4:using direct xpath
			//WebElement e=driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
			//driver.switchTo().frame(e);
			
			//Step1:Shift focus of selenium from main webpage to iframe
			//Method1:id attribute value
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//input[@id='fname']")).clear();
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("hello");
			
			driver.findElement(By.xpath("//input[@id='lname']")).clear();
			driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("hello");
			
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
		}
	}