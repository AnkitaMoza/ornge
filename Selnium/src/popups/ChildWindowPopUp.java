package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.groww.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		Thread.sleep(2000);
		//Step1: get address of main page
		String parentId=driver.getWindowHandle();
		//Step2: get address of child windows
		Set<String> childId = driver.getWindowHandles();
		//condition one
		int SetSize =  childId.size();
				if (SetSize==1) {
					System.out.println("win id is same");
					driver.findElement(By.xpath("//*[@*='login_email1']")).sendKeys("mayur@123.com");
					System.out.println("sendkeys successfull");
					Thread.sleep(3000);
				}
		// condition two
				else {
					for(String winId : childId) {
						if(!(winId.equals(parentId)))
						driver.switchTo().window(winId);
						System.out.println("win id is different, driver switched to child window");
						driver.findElement(By.xpath("//*[@*='login_email1']")).sendKeys("mayur@123.com");
						driver.close();
					}
				}
				
	//	System.out.println("driver switched to arent window ");
		driver.close();
	}

	}

