package testngsessions;

import org.testng.annotations.Test;

public class TestWithPriority {
	
	@Test(priority=-1)
	public void searchTest() {
		System.out.println("Test--search test");
	}
	@Test(priority=5)
	public void addToCartTest() {
		System.out.println("Test--addToCart test");
	}
	@Test(priority=3)
	public void paymentTest() {
		System.out.println("Test--payment test");
	}
	@Test(priority=2)
	public void aTest() {
		System.out.println("Test--a test");
	}
	@Test(priority=0)
	public void bTest() {
		System.out.println("Test--b test");
	}
}
