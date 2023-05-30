package javaScriptAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadPopup {

	public static void main(String[] args) {
		//never use AutoId --is only for widows machine --it wont work on remote machine/mac/linux/docker/cloud
		//Robot class--> only for windows 
		//Sikuli lib: image based only (almost deprecated)
		
		
		//to file upload - use sendKeys --> file path
		//type =file: attribute should be there when inspect the button else talk to dev to add in side the code
		WebDriver driver= new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("");

	}

}
