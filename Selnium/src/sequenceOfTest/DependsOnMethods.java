package sequenceOfTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsOnMethods {

	@Test(priority=1)
	public void login() {
		System.out.println("method login");
		SoftAssert sof = new SoftAssert();
		sof.assertEquals(false, true);
		sof.assertAll();
		
		
	}
	@Test(priority = 2)
	public void home() {
		System.out.println("method home");
	}
	@Test(priority=3,dependsOnMethods = "login")
	public void feed() {
		System.out.println("method feed");
	}
	
	
}
