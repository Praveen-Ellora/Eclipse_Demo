package pOM_Mukesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	

public static WebDriver StartBrowser(String Browsername, String URL){
	
	if(Browsername.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
			
	}
	
	
	return driver;
	
	
}
	


}
