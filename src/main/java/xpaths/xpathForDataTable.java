package xpaths;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathForDataTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		// Launch url
		driver.get("https://datatables.net/examples/basic_init/table_sorting.html");
		Thread.sleep(2000);
		// Click on name to sort the name list
		driver.findElement(By.xpath("//th[text()='Name']")).click();

		List<String> AngelicaInfo = getUserInfo("Angelica Ramos");
		System.out.println(AngelicaInfo);

	}

	public static List<String> getUserInfo(String Username) {
		String actUser=driver.findElement(By.xpath("//td[text()='"+Username+"']")).getText();
		
		List<WebElement> userInfo = driver
				.findElements(By.xpath("//td[text()='" + Username + "']/following-sibling::td"));
		List<String> userInfovaluesinRow = new ArrayList<String>();
		userInfovaluesinRow.add(actUser);
		for (WebElement e : userInfo) {
			String text = e.getText();
			userInfovaluesinRow.add(text);
		}
		return userInfovaluesinRow;
	}



}