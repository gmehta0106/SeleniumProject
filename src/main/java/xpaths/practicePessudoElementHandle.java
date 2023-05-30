package xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicePessudoElementHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/table_sorting.html");
		
		
		String Salary = driver.findElement(By.xpath("(//td[text()='Ashton Cox']/following-sibling::td)[last()]")).getText();
		System.out.println(Salary);//$86,000
		
		Salary = Salary.replaceAll("[,$]","");//86000
		int sal=Integer.parseInt(Salary);
		if(sal>100000) {
			System.out.println("Ashton Cox salary is greaterthan 100k " + Salary);
				}else {
					System.out.println("Ashton Cox salary is lessthan 100k, which is:  " +Salary);
				}
		
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);

	}
}
	
	//driver.findElement(By.xpath("//div[@id='example_length']/label/select/option")).click();
			//driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[1]")).click();//why its not clicking


