package xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathAxes {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//parent to child:
		//1. direct --> parent/child
		//https://app.hubspot.com/login
		//below examples of xpath axes  
		//1.1email id
		//1.1 div[@class='private-form__input-wrapper']/input[@id='username']
								//or
		//1.1 div[@class='private-form__input-wrapper']/child::input[@id='username']
								//or
		//1.1 form[@id='hs-login']/child::div-- direct div counts 8 
								//or
		//1.1 form[@id='hs-login']/div-- 8 div counts
		

		//2. indirect + direct--> parent//child
		//2.1form[@id='hs-login']//div --20 div counts
		
		//3. child to parent: Backward traversing 
		//3.1 Direct parent with parent keyword-- //input[@id='username']/parent::div
							//OR
		//3.1 Direct parent - //input[@id='username']/..
							//or
		//3.1 Direct parent ...keep going to the HTML tag//input[@id='username']/../../../../../../../../../..
		
		//3.2 Siblings
		//use case - web table 
		//Before sibling - Preceding sibling
		//url-https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//input[@id='input-email']/preceding-sibling::label--output getText of label of email id 
		//input[@id='input-password']/preceding-sibling::label --output getText of label of password
		
		//After sibling  - Following sibling
		//https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//input[@id='input-password']/following-sibling::a - output - get text of forgotten password
		//https://www.amazon.ca..footers
		//div[text()='Get to Know Us']/following-sibling::ul//a
		//div[text()='Let Us Help You']/following-sibling::ul//a
		//(//div[text()='Let Us Help You']/following-sibling::ul//a)[8]--output - reach to help link
		
		//3.2 Grand parent //input[@id='username']/ancestor::div
		
		
		getColumnValues("Get to Know Us");
		getColumnValues("Make Money with Us");
	}
	public static void getColumnValues(String columnName) {
		System.out.println("---Print the values of --- " + columnName);
		
		List<WebElement> columnValues = driver.findElements(By.xpath("//div[text()='"+columnName+"']/following-sibling::ul//a"));
		for(WebElement e:columnValues) {
			String text = e.getText();
			System.out.println(text);
		}
		
	}

}
