package NewWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindow {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String winId1 = driver.getWindowHandle();
	System.out.println(winId1);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(500);
	driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
	
}
}
