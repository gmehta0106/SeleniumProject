package javaScriptAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationPopup {

	public static void main(String[] args) {
		
		String un = "admin";
		String pwd="admin";
		WebDriver driver= new ChromeDriver();
		driver.get("https://"+un+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");//id and pwd is admin 
		//if u have @ in your user name and in pwd then u will not be allowed to login 
		driver.quit();
		
		
		

	}

}
