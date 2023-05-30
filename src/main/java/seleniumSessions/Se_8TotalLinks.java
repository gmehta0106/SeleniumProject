package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_8TotalLinks {
	//find out all the links on the page
		//count of links
		//link --> htnml tag -- <a>
		//FEs -- multiple elements
		//print the text of each link?
		//skip the blank text
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/table_sorting.html");
		
		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
		int totalLinks = LinkList.size();
		System.out.println(totalLinks);
		
//		for(int i=0; i<totalLinks; i++) {
//		String	linkText = LinkList.get(i).getText();
//		System.out.println(i + "=" +linkText);
//		if(linkText.length()>0) {
//			System.out.println(i + "=" + linkText);
//		}
		//Thread.sleep(2000);
		
		//for each loop
		int count= 0;
		for(WebElement e: LinkList) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(count +"="+text);
			}count++;
		}
		}
		
		
	
	}


