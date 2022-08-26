package sequenceOfTest;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 6)
	public void write() {
		System.out.println("write is runnning");
	
	}
	
	@Test(invocationCount = 4)
	public void read() {

		System.out.println("read is running");
		
	}
}
