package extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waa {

@Test
public void m1() {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println(d.getTitle());
}
}
