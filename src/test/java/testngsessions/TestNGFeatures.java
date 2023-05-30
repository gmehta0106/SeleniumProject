package testngsessions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
//1
	@BeforeSuite
	public void DBConnections() {
		System.out.println("BS--DB connection");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT-- create user");
	}
	//3
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC-- openBrowser");
	}
	//before each test cases it will run
	//4 //7
	@BeforeMethod
	public void loginApp() {
		System.out.println("BM-- loginApp");
	}
	//test cases running on the bases of alphabets
	@Test
	public void searchTest() {
		System.out.println("Test--searchTest");
	}
	
	@Test
	public void Test() {
		System.out.println("Test--searchTest");
	}
	
}
