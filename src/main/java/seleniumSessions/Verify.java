package seleniumSessions;

public class Verify {
	
	/**
	 * Verify url
	 * @param actualVaule
	 * @param expectedValue
	 * @return
	 */
	public static boolean equalValues(String actResult, String expResult) {
		if(actResult.equals(expResult)) {
			System.out.println(actResult + "Equal to" + expResult);
			return true;
		}else 
		{
			System.out.println(actResult + "Not Equal to " + expResult);
			return false;
		}
		
		}
	
	

	public static boolean containValues(String actResult, String expResult) {
		if(actResult.contains(expResult)) {
			System.out.println(actResult + " Contains "+expResult);
			return true;
		}else{
			System.out.println(actResult + " does not contain "+expResult);
			
		}return false;
	}
	

}
