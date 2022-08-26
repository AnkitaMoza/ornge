package webDriverMethods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.graphbuilder.curve.Point;

public class ManageWindowsMethods {

	//Testcase1: verify that user is able to / getSize / setSizze /getPosition /setPoition
											//maximize /minimize the window
	@Test
	public void manageWindowsMethods() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amezon.com");
		
		Dimension d= driver.manage().window().getSize();
		System.out.println(d);
		Thread.sleep(2000);
		Dimension  newDimension = new Dimension(900, 700);
		driver.manage().window().setSize(newDimension);
		Thread.sleep(2000);
		org.openqa.selenium.Point p = driver.manage().window().getPosition();
		System.out.println(p);
		org.openqa.selenium.Point newPosition = new org.openqa.selenium.Point(300,0);
		driver.manage().window().setPosition(newPosition);
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		 
		driver.quit();
	
		
	}
}
