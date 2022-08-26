package popups;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HiddenDivisionPopUp {

			public static void main(String[] args) throws InterruptedException 
			{
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");//popup will appear which can be simply closed
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("abcder");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("bjhb");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();

	}
		
	}
