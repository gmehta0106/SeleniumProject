package seleniumFrameworkPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestClass {

	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver =	brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String url = brUtil.getPageURL();
		System.out.println(url);
		String Title = brUtil.getPageTitle();
		System.out.println(Title);
		
		
		
	By FirstName=	By.id("input-firstname");
	By LastName = By.id("input-lastname");
	By Email= By.id("input-email");
	By TelePh= By.id("input-telephone");
	By Pwd= By.id("input-password");
	By CPwd= By.id("input-confirm");
	By checkBox=By.name("agree");
	By continueButn = By.xpath("//input[@class='btn btn-primary']");
	
	
	ElementUtil eleUtil = new ElementUtil(driver);
	eleUtil.doSendkeys(FirstName, "Gitanjali");
	eleUtil.doSendkeys(LastName, "Mehta");
	eleUtil.doSendkeys(Email, "gmehta0106@gmail.com");
	eleUtil.doSendkeys(TelePh, "454520243");
	eleUtil.doSendkeys(Pwd, "12345");
	eleUtil.doSendkeys(CPwd, "12345");
	eleUtil.doClick(checkBox);
	eleUtil.doClick(continueButn);
	
	brUtil.quitDriver();
	}

}
