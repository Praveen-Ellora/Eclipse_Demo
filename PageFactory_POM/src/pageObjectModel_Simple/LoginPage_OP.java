package pageObjectModel_Simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_OP {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://curie-doctor.firebaseapp.com/#/app/login");	
    
    LoginClass_PO.username(driver).sendKeys("thangam@gmail.com");
    LoginClass_PO.password(driver).sendKeys("thangam");
    LoginClass_PO.Login_Button(driver).click();

}
	
}
