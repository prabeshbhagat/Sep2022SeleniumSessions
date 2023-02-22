package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendkeysAssignment12 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fname=By.id("input-firstname");
		By lname=By.id("input-lastname");
		By email=By.id("input-email");
		By tele=By.id("input-telephone");
		By pwd=By.id("input-password");
		By cPwd=By.id("input-confirm");
		By ppCBox=By.xpath("//input[@name='agree']");
		By continueBtn=By.xpath("//input[@value='Continue']");
		
		
		doActionsSendKeys(fname,"fname1");
		doActionsSendKeys(lname,"lname1");
		doActionsSendKeys(email,"testhub@gmail.com");
		doActionsSendKeys(tele,"9676767676");
		doActionsSendKeys(pwd,"123@Pwd");
		doActionsSendKeys(cPwd,"123@Pwd");
		doActionsClick(ppCBox);
		doActionsClick(continueBtn);
		
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
 