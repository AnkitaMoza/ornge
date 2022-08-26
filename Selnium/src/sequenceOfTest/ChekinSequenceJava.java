package sequenceOfTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.neilalexander.jnacl.crypto.verify_16;

public class ChekinSequenceJava {

	@Test(priority=1)
	public void test1() {
		System.out.println("test 1 is is running");
	}
	@Test(priority=2)
	public void atest() {
		System.out.println("test 2 is running");
	}
	@Test(priority = 3)
	public void report() {
	//	Reporter.log("checking Reporter", false);
	Reporter.log("Report is runnin",true);

	}
	@Test(priority = 4)
	public void aaaa() {
		System.out.println("aaaa is running");
	}
	@Test(priority=-3)
	public void atest3() {
		System.out.println("test 3 is running");
	}
}
