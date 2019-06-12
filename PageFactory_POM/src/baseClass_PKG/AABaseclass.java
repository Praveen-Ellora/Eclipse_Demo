package baseClass_PKG;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AABaseclass {

	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {	
				
		System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    System.out.println("Praveen Raja Naasama poga poran....");
	
	}
}
