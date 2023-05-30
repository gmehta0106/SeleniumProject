package JavaScriptExecutorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Se_24SendkeysWithPause {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		//emailId.sendKeys("naveen@gmail.com");
		
		String emailValue = "naveen@gmail.com";
		Actions act = new Actions(driver);//out side of the for loop
		char c[]=emailValue.toCharArray();//Separate all the character and store it in the char array
		for(char e:c) {//e will go to each and particular char array
			act.sendKeys(emailId, String.valueOf(e)).pause(500).build().perform();//e is a char and want to convert into string so use String.valueOf(e)and pass the e
		}
		Thread.sleep(3000);
		driver.quit();
		

	}

}
