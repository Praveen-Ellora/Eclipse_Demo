package pageObjectModel_Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass_PO {
	
	//driver.findElement(By.id("username")).sendKeys("thangam@gmail.com");	
	//driver.findElement(By.id("password")).sendKeys("thangam");
	//driver.findElement(By.id("signin")).click();	
	
private static WebElement element=null;


public static WebElement username(WebDriver driver){
	
	element=driver.findElement(By.id("username"));
	
	return element;
}
		
public static WebElement password(WebDriver driver){
	
	element=driver.findElement(By.id("password"));
	
	return element;
}


public static WebElement Login_Button(WebDriver driver){
	
	element=driver.findElement(By.id("signin"));
	
	return element;
	
	
}
		
	}


