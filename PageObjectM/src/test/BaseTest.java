package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import base.LoginPage;
import base.PimPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public WebDriver driver;
protected LoginPage lp;
protected PimPage pim;

@BeforeClass	
public void LaunchUrl() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
@BeforeClass
public void objectmethod() {
	lp = new LoginPage(driver);
	pim = new PimPage(driver);
}

@AfterClass
public void LogOut() {
	driver.quit();
}
}
