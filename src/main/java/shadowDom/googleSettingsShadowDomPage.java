package shadowDom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSettingsShadowDomPage {

	public static void main(String[] args) {
	WebDriver	driver = new ChromeDriver();
	driver.get("chrome://settings/");
	
	String search_jsPath = "document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
	
	

	}

}
