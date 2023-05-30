package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_8FindtotalLinksAndHrefValues {
/*
 * Find all the links on the page and fetch the href values
 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/table_sorting.html");
		
		List<WebElement> LinkList = driver.findElements(By.xpath("//a[@href]"));
		int totalLinks = LinkList.size();
		System.out.println(totalLinks);
				
		//for each loop
		int count= 0;
		for(WebElement e: LinkList) {
			String text = e.getAttribute("href");
			if(text.length()>0) {
				System.out.println(count +"="+text);
			}count++;
		}
		}
		
		
	
	

	}

