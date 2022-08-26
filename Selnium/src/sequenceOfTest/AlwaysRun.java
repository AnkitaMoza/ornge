package sequenceOfTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlwaysRun {

	@Test(priority=4)
	public void login() {
		
		SoftAssert sof = new SoftAssert();
		sof.assertEquals(false, true);
		sof.assertAll();
		System.out.println("method login");
	}
	@Test(priority = 2)
	public void home() {
		System.out.println("method home");
	}
	@Test(priority=1,dependsOnMethods = "login",alwaysRun = true)
	public void feed() {
		System.out.println("method feed");
	}
	
	
	
	
}
