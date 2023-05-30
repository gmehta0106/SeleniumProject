package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;// to write static import we can call directly with 

public class relativeLocatorsConcept {
//use only for right and left ele in the webTables 
	public static void main(String[] args) {
		// relativeLocator -//above
		//left--ele--right
		//below
		//near 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele=driver.findElement(By.linkText("Burlington, Canada"));
		
		//right of ele-->
	String rightScore=	driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(rightScore);
	
	//left of ele-->
	String leftScore=	driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(leftScore);
	
	//below of ele-->
	String belowScore=	driver.findElement(with(By.tagName("p")).below(ele)).getText();
	System.out.println(belowScore);
	
	//select the radio button which is left of yes or left of no in https://naveenautomationlabs.com/opencart/index.php?route=account/register
	
	

	}

}
