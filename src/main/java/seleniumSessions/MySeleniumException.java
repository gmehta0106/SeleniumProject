package seleniumSessions;

public class MySeleniumException extends RuntimeException {
	//own custom exception that is help us to understand the exception reason instead of Selenium "Invalid Exception" that is thrown by selenium

	public MySeleniumException(String mesg) {
		super(mesg);
	}
}
