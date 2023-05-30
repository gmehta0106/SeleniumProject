package Amazon_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		
		browserUtil br = new browserUtil();
		WebDriver driver=	br.initDriver("chrome");
		br.launchBrowser("https://www.amazon.com");
		String text = br.getTitle();
		System.out.println("Title: " +text);
		
		String urlText = br.getCurrentURL();
		System.out.println("Current URL: " +urlText );
		
		br.maxWindow();
		Thread.sleep(2000);
		
		By search= By.id("twotabsearchtextbox");
		
		elementUtil eleUtil = new elementUtil(driver);
		eleUtil.doSendkeys(search, "mackbook");
		
		//br.miniWindow();
		Thread.sleep(2000);
		
		br.quit();
		
	}

}
