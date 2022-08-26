package selenium;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBsign_In {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("signup-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Mayur");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".bc input")).sendKeys("Takalikar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("7558488477");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Male']//preceding-sibling::input")).click();
		Thread.sleep(1000);

		List<WebElement> daylist = driver.findElements(By.cssSelector("#day option"));

		for (WebElement day : daylist)
			if (day.getText().equals("10"))
				day.click();

		List<WebElement> monthlist = driver.findElements(By.cssSelector("#month option"));
		for (WebElement month : monthlist)
			if (month.getText().equalsIgnoreCase("jan"))
				month.click();

		List<WebElement> yearlist = driver.findElements(By.cssSelector("#year option"));
		for (WebElement year : yearlist)
			if (year.getText().equals("1996"))
				year.click();

		driver.findElement(By.id("password_step_input")).sendKeys("mayur@123");

	}

}
