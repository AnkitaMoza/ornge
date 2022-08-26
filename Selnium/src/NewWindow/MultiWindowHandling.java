package NewWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String winId1 = driver.getWindowHandle();
		System.out.println("window 1 id =" + winId1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> allWinId = driver.getWindowHandles();
		  
		for (String eachWinId : allWinId) {			
			driver.switchTo().window(eachWinId);
			  String currentpageTitle = driver.getTitle();
			  System.out.println("title of the page ="+ currentpageTitle); //this line will
			  //show you the titles of the windows that are open	that you can compare with.
			  
			if ((currentpageTitle.contains("Sign Up | LinkedIn"))) {
				 System.out.println("title of the page ="+ currentpageTitle);
					  Thread.sleep(1000);
					
					  driver.findElement(By.xpath("//*[@name='email-or-phone']")).sendKeys("i.mayurdt@gmail.com");
					  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Software Test Engineer");
					  Thread.sleep(3000);
				  } 
			
			if(currentpageTitle.contains("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")) {
				 Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
				  driver.findElement(By.xpath("//*[@name='FullName']")).sendKeys("Mayur Takalikar");
				  driver.findElement(By.xpath("//*[@name='JobTitle']")).sendKeys("Software Test Engineer");
				  Thread.sleep(3000);
			}
				 }
		driver.switchTo().window(winId1);
		driver.findElement(By.id("txtUsername")).sendKeys("mayur");
		}
	}

