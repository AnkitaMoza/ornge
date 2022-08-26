package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameUsingName {

	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
		Thread.sleep(2000);
	
		//Step:Shift focus of selenium from main webpage to iframe
		//Method3:using index
		driver.switchTo().frame("iframeResult");
		System.out.println("in i frame");
		
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//input[@id='lname']")).clear();
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("hello");
		
		//Step:Shift focus of selenium from iframe to main webpage
		driver.switchTo().parentFrame();
		System.out.println("parent frame");
		//Method4:using direct xpath
		WebElement e=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(e);
		//driver.switchTo().frame(e);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
}

