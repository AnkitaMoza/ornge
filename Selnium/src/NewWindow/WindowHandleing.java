package NewWindow;

import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String winId1 = driver.getWindowHandle();
		System.out.println("window 1 id =" + winId1);
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		//driver.findElement(By.xpath("//*[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> allWinId = driver.getWindowHandles();
		  
		for (String eachWinId : allWinId) {			
			  String CurrentpageTitle = driver.getTitle();
			  System.out.println("title of the page ="+ CurrentpageTitle); //this line will
			  //show you the titles of the windows that are open		 		
			if (!(eachWinId.equals(winId1))) {
					  driver.switchTo().window(eachWinId);
					  System.out.println("new window");
					  Thread.sleep(1000);
					  driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
					//  driver.findElement(By.xpath("//*[nam))-alert-box-button-middle accept-cookie-container']"
					  driver.findElement(By.xpath("//*[@name='FullName']")).sendKeys("Mayur Takalikar");
					  driver.findElement(By.xpath("//*[@name='JobTitle']")).sendKeys("Software Test Engineer");
					  Thread.sleep(3000);
				  } 
				 }
		driver.switchTo().window(winId1);
		driver.findElement(By.id("txtUsername")).sendKeys("mayur");
		
	}
}
