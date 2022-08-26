package sequenceOfTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class CheckingEnabled {

	@Test(priority=1,groups ="mayur")
	public void login() {
		System.out.println("method login");
	}
	@Test(priority=2)
	public void home() {
		System.out.println("method home");
	}
	@Test(priority=3,groups ="mayur")
	public void feed() {
		System.out.println("method feed");
	}
	
}

