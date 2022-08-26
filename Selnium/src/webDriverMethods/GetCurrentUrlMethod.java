package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCurrentUrlMethod {

	//Testcase1: verify that user is navigated to expected url 
	@Test
	public void getCurrentUrlMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amezon.com");
		String title =(driver.getCurrentUrl()); //getCurrentUrl will return a string
		System.out.println(title);
	
		if (title.equalsIgnoreCase("https://www.amazon.com/"))
			System.out.println("Testcase is passed");
		else
			System.out.println("testcase is failed");
		driver.close();	
	}
}
