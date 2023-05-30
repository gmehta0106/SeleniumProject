package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Se_4SessionID {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		// session id 123
		driver.get("https://www.amazon.com");
		// sid 3136fe843e8920b802176d970082c563
		String Title = driver.getTitle();
		// 3136fe843e8920b802176d970082c563
		System.out.println("Title: " + Title);
		System.out.println(driver.getCurrentUrl());
		// driver.quit();
		driver.close();
		// SID =3136fe843e8920b802176d970082c563
		// String Title1 =driver.getTitle();
		// Exception in thread "main" org.openqa.selenium.NoSuchSessionException:
		// Session ID is null. Using WebDriver after calling quit()?

		driver = new ChromeDriver(co);
//		//session id 452
		driver.get("https://www.amazon.com");
		String Title2 = driver.getTitle();
		// SID= invalid //3136fe843e8920b802176d970082c563
		// NoSuchSessionException: invalid session id
		System.out.println("Title: " + Title);
	}

}
