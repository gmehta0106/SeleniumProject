package javaScriptAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptAlerts {
/*
 * JS Alerts-Alert popup
 * -confirm popup
 * -Prompt popup
 *  
 *  Exception - NoAlertPresentException 
 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// launch url
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// find element
		/*
		 * JS Alert popup
		 */
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		// switch to alert by creating obj of Alert interface
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		// validation
//		if (text.contains("I am a JS Alert")) {
//			System.out.println("Text msg is coming as expected ");
//		} else
//			System.out.println("Text msg is not coming as excepted");
//
//		//Click ok on alert
//		alert.accept();
//		driver.quit();

		/*
		 * JS confirm popup
		 */
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		if(text.equals("--I am a JS Confirm")) {
//			System.out.println("Text mes as per expectation- PASS");
//		}else {
//			System.out.println("Text mesg is not as expected--Fail");
//		}Thread.sleep(2000);
//		//alert.accept();
//		alert.dismiss();
//		Thread.sleep(4000);
//		driver.quit();

		/*
		 * JS Prompt popup
		 */
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		if (text.equals("I am a JS prompt")) {
			System.out.println("PASS");
		}else {
			System.out.println("Fail");
		}
		
		alert.sendKeys("JS prompt");
		alert.accept();
		driver.quit();

	}

}
