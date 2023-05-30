package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_25BrowserWindowHandelTogether {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent window
		Thread.sleep(2000);
		
		String parentWindowId=driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		// scenario parent to child 1 close back and so on..
		//iterator>>while loop>> capture the window id>> switch to window>> get current url>>print url>> wait>> close

		Set<String> handels= driver.getWindowHandles();
		Iterator<String> it = handels.iterator();
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(2000);
			
			if(!windowId.equals(parentWindowId))
			driver.close();
		}
			driver.switchTo().window(parentWindowId);
			System.out.println("Parent window Id: " + driver.getCurrentUrl());

		}
	

	}


