package javaScriptAlerts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_24BrowserWindowHandelConcept {

	public static void main(String[] args) throws InterruptedException {

//new window /tab
		// click on element --> new tab/window --browser window pop up

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		Set<String> handels = driver.getWindowHandles();
		Iterator<String> it = handels.iterator();
		
		String parentWindowId=it.next();
		String childWindowId= it.next();
		
		System.out.println("Parent window Id" +parentWindowId);
		System.out.println("Child window id" +childWindowId);
		
		//switching work
		driver.switchTo().window(childWindowId);
		System.out.println("childwindow url"+ driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: " +driver.getCurrentUrl() );
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
