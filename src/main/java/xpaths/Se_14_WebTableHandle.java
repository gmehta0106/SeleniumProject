package xpaths;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_14_WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		selectUser("Joe.Root");
		selectUser("John.Smith"); 
		List<String> GarryInfo= getUserInfo("Garry.White");
		System.out.println(GarryInfo);
	}
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	
	public static List<String> getUserInfo(String userName) {
		List<WebElement> userInfo=driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userInfovaluesinRow = new ArrayList<String>();
		for(WebElement e: userInfo) {
			String text=e.getText();
			userInfovaluesinRow.add(text);
		}
		return userInfovaluesinRow;
	}
	
}
