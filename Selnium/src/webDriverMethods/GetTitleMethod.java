package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GetTitleMethod {

	//Testcase1: verify that user is navigated to current web page
	@Test
	public void getTitleMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amezon.com");
		String title =(driver.getTitle()); //getTitle will return a string
		System.out.println(title);
	
		if (title.equalsIgnoreCase("Amazon.com. Spend less. Smile more."))
			System.out.println("Testcase is passed");
		else
			System.out.println("testcase is failed");
		driver.close();
}
}
