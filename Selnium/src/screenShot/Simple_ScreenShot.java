package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Simple_ScreenShot {
	
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://grow.in");
	driver.manage().window().maximize();
	
	TakesScreenshot scrnShot = (TakesScreenshot) driver;
	File source = scrnShot.getScreenshotAs(OutputType.FILE);
	File destination = new File("E:\\SLELNIUM SS\\ss2.png");
	FileHandler.copy(source, destination);
	Thread.sleep(1000);
	

	driver.close();
	
	
	
	
	
	
	
}
	
}
