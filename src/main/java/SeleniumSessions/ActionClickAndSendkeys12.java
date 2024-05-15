package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendkeys12 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailEle = By.id("input-email");
		By pwdEle = By.id("input-password");
		By lgnBtn = By.xpath("//input[@value='Login']");

//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(emailEle), "abc@gmail.com").build().perform();
//		act.sendKeys(driver.findElement(pwdEle), "abc@123").build().perform();
//		act.click(driver.findElement(lgnBtn)).build().perform();
		
		doActionsSendKeys(emailEle,"abc@gmail.com");
		doActionsSendKeys(emailEle,"def@123");
		doActionsClick(lgnBtn);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
