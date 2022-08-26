package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS1 {
	static 	WebDriver driver;

	public  void scrnShot(WebDriver driver,String filename) throws IOException {
		
		TakesScreenshot mayur = (TakesScreenshot)driver;
		File source = mayur.getScreenshotAs(OutputType.FILE); 		
		String path = "E:\\selenium ss\\";		
		File destination = new File(path+filename+".png");		
		FileHandler.copy(source, destination);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://grow.in");
		driver.manage().window().maximize();
		
		
		SS1 ss =new SS1();
		
		ss.scrnShot(driver,"aaaa");
		
		Thread.sleep(1000);
		driver.quit();
		
	}
		
		
	
}
