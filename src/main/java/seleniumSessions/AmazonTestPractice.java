package seleniumSessions;

public class AmazonTestPractice {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtilPractice BrUtil = new BrowserUtilPractice();
		BrUtil.initDriver("chrome");

		BrUtil.LaunchUrl("https://www.google.com");
		// Thread.sleep(5000);
		String actualTitle = BrUtil.getTitle();
		System.out.println(actualTitle);

		if (actualTitle.contains("Google")) {
			System.out.println("Pass--Title");
		} else {
			System.out.println("Fail--Title");
		}
		
		
		String actURL = BrUtil.getPageURL();
		System.out.println(actURL);
		if(actURL.contains("google")) {
			System.out.println("Pass---URL");
		}else {
			System.out.println("Fail--URL");
		}
		
		
		BrUtil.QuitBrowser();

	}

}
