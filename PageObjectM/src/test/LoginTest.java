package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test(priority = 1)
	public void verifyUsernameTxtBox() {
		lp.username();
		Assert.assertTrue(lp.username());
	}
	
	@Test(priority = 2)
	public void verifyPasswordTxtBox() {
		lp.username();
		Assert.assertTrue(lp.password());
	}
	@Test(priority = 3)
	public void VerifyLoginFunctionality() {
		lp.login();
		Assert.assertEquals(pim.pimTitle(), "PIM");
		
	}
	
}
