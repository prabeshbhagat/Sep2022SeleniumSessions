package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept6 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//40.58
		
System.out.println(System.currentTimeMillis());
//		BrowserUtil bU = new BrowserUtil();
//		WebDriver driver = bU.launchBrowser("chrome");

//		bU.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		ElementUtil5 eUtil = new ElementUtil5(driver);

		// 1.ID attribute:unique attribute

		// 2.Name :can be duplicate
//		By eMail = By.name("email");
//		// eUtil.getElement(eMail);
//		eUtil.doSendkeys(eMail, "test123@gmail.com");
//		
		
		//3.Class:can be duplicate
//		By cName=By.className("form-control");
//		eUtil.doSendkeys(cName, "selenium");
		
		//4th.xpath its not an attribute, address of the Webelement in HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("pwd");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		By emailID=By.xpath("//*[@id=\"input-email\"]");
		By pwd=By.xpath("//*[@id=\"input-password\"]");
		By subBtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
//		LocatorConcept6.doSendkeys(emailID, "test12@gmail.com");
//		LocatorConcept6.doSendkeys(pwd, "ghsgssss");
//		LocatorConcept6.doClick(subBtn);
		
		
//		eUtil.doSendkeys(emailID, "test12@gmail.com");
//		eUtil.doSendkeys(pwd, "ghsgssss");
//		eUtil.doClick(subBtn);
		
		//5th:CSS selector its not an attribute
		
		By emails=By.cssSelector("#input-email");
		By pwds=By.cssSelector("#input-password");
		By sbtn=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
		
		eUtil.doSendkeys(emails, "test123@gmail.com");
		eUtil.doSendkeys(pwds, "ghsgssss");
		eUtil.doClick(sbtn);
		
		

	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	


}
