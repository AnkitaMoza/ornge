package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Thread.sleep(1000);
		
		Alert a=driver.switchTo().alert();
		
		a.sendKeys("mayur");
		
		a.accept();

		//print output of action performed on alert box
		WebElement output=driver.findElement(By.xpath("//div[@id='output']"));
		System.out.println(output.getText());
	}

}
