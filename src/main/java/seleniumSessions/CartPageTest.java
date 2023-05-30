package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageTest {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtilPractice brUtil = new BrowserUtilPractice();
		WebDriver driver =brUtil.initDriver("chrome");//browserUtilPractice responsibility to init the driver so we are storing initDriver into WebDriver
													//and then we can use this driver anywhere in this class 
		brUtil.LaunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String Title = brUtil.getTitle();
		System.out.println(Title);
		System.out.println(brUtil.getPageURL());

		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By Email = By.id("input-email");
		By TelePh = By.id("input-telephone");
		By Pwd = By.id("input-password");
		By ConfirmPwd = By.id("input-confirm");
		By CheckBox = By.name("agree");
		By ContButton = By.xpath("//input[@class='btn btn-primary']");
		By header = By.tagName("h1");
		By linkT= By.linkText("My Account");
	
	
		
		

		Se_5ElementUtil eleUtil = new Se_5ElementUtil(driver);
		eleUtil.doSendKeys(FirstName, "Bill10");
		eleUtil.doSendKeys(LastName, "Mehta");
		eleUtil.doSendKeys(Email, "bill10@gmail.com");
		eleUtil.doSendKeys(TelePh, "12514545");
		eleUtil.doSendKeys(Pwd, "bil@123");
		eleUtil.doSendKeys(ConfirmPwd, "bil@123");
		
		eleUtil.doClick(CheckBox);
		
		eleUtil.doClick(ContButton);
		
		String text = eleUtil.doGetElementText(header);
		System.out.println(text);
		
		String Link = eleUtil.doGetElementText(linkT);
		System.out.println(Link);
		
		boolean eleDisplay=eleUtil.checkElementIsDisplayed(linkT);
		System.out.println(eleDisplay);
		eleUtil.doClick(linkT);
		
		

		
		
		
		
		
//		By linkText = By.linkText("Login");
//		String text1 = doGetElementText(linkText);
//		System.out.println("I am login linked text " + text);
	
		
		//eleUtil.doGetElementText(linkText);

		//Thread.sleep(5000);
		//brUtil.quitBrowser();

	}

	

}
