package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept20 {

	static WebDriver driver;

	public static void main(String[] args) {

		// Explicitly Wait
		//// Its is not a gobal wait
		// can be applied for specfic element

		// WebDriverWAit(c)--extends---->fluent wait(c)--implement-->wait(I) until()
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(opt);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// case 1:
//		By macLoc=By.linkText("iMac");
//		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement macEle=wait.until(ExpectedConditions.presenceOfElementLocated(macLoc));
//		macEle.click();

		// case 2: using utility for exp wait

		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By lgnBtn = By.xpath("//input[@value='Login']");
		
		waitForElementPresence(email,10).sendKeys("abc@gmail.com");
		getElement(pwd).sendKeys("hfafa");
		getElement(lgnBtn).click();
	}

	public static WebElement waitForElementPresence(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
