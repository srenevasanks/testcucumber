package TESTng.TESTng;

import org.testng.annotations.Test;

public class PhoneProducts {

	public int add(int a,int b) {
		
		int c;
		c= a+b;
		return c;
		
	}
	
	@Test(invocationCount = 6,  enabled = false)
	public void samsung() {

	}
}
