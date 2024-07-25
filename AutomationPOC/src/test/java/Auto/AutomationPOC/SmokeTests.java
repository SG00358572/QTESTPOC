package Auto.AutomationPOC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests {

	@Test
	public void Test1() {
		
		System.out.println("Test 1 Passed");
		Assert.assertEquals(true, true);
	}
	@Test
	public void Test2() {
		
		System.out.println("Test 2 Passed");
		Assert.assertEquals(true, true);
	}
	@Test
	public void Test3() {
		
		System.out.println("Test 3 Failed");
		Assert.assertEquals(true, false);
	}
	
}
