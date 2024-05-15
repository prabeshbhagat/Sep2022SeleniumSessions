package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept5 {
	static WebDriver driver;

	public static void main(String[] args) {

		// create a webElement + perform some
		// action(click,sendkeys,iSDisplayed,getText)
		
		//1st approach
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.id("input-email")).sendKeys("test123@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Password123");
	
		
		//2nd approach
//		WebElement emailId=driver.findElement(By.id("input-email"));
//		WebElement pwd=driver.findElement(By.id("input-password"));
//		emailId.sendKeys("test123@gmail.com");
//		pwd.sendKeys("Password123");
		
		
		//3rd approach--By locator approach
//		By emailID=By.id("input-email");
//		By psswd=By.id("input-password");
//		
//		WebElement email_ele=driver.findElement(emailID);
//		WebElement pwd_ele=driver.findElement(psswd);
//		
//		email_ele.sendKeys("test1234@gmail.com");
//		pwd_ele.sendKeys("password");
		
		
//		//4th approach -By locator + generic function
//		By emailID=By.id("input-email");
//		By psswd=By.id("input-password");
//		getElement(emailID).sendKeys("4th@gmail.com");
//		getElement(emailID).sendKeys("4passowrd");
		
		//5th approach -By locator + generic  function
		//generic function getElement and action methods(send keys):
//		By emailID=By.id("input-email");
//		By psswd=By.id("input-password");
//		doSendkeys(emailID,"test@test.com");
//		doSendkeys(psswd,"test1234");
		
		
		
//		
		//6th approach: BY locator +generic Function getElemnet and
		//action methods in Util class
		
		By emailID=By.id("input-email");
		By psswd=By.id("input-password");
		ElementUtil5 eUtil=new ElementUtil5(driver);
		eUtil.doSendkeys(emailID, "eutil@gmail.com");
		eUtil.doSendkeys(psswd, "eutil123");
		
		//7th approach is login Page test
		//create a separate generic util class and a test class with main method 
		//
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	

}
