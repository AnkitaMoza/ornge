package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS_with_method {

	static 	WebDriver driver;
public void scrnShot() throws IOException {
	
	TakesScreenshot mayur = (TakesScreenshot)driver;
	File source = mayur.getScreenshotAs(OutputType.FILE);
	File destination = new File("E:\\SLELNIUM SS\\dtjy.png");
	FileHandler.copy(source, destination);
}
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://grow.in");
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	SS_with_method ss =new SS_with_method();	
	ss.scrnShot();
	driver.quit();
}	
}
