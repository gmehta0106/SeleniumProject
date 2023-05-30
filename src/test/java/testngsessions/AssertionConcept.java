package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {

	@Test
	public void searchTest() {
		String name = "macbook";
		Assert.assertEquals(name, "mackbook");
	}
	
	@Test
	public void sumTest() {
		int a=10;
		int b=20;
		int sum=a+b;
		Assert.assertEquals(sum, 30);
	}
	
	
	
	
	
	
}
