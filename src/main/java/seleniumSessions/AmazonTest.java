package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtilPractice brUtil = new BrowserUtilPractice();
		brUtil.initDriver("chrome");// just pass the browser name

		/**
		 * Launch and Test the url scenario
		 */
		brUtil.LaunchUrl("https://www.flipkart.com");
		

		String actualUrl = brUtil.getPageURL();
		System.out.println("Page URL " + actualUrl);
		Verify.containValues(actualUrl, "flipkart");
		

		/**
		 * Actaul page title
		 */
		String actualTitle = brUtil.getTitle();
		System.out.println("page title " + actualTitle);
		Verify.equalValues(actualTitle, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

		brUtil.QuitBrowser();
	}

}
