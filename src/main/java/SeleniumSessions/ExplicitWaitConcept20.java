package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept20 {

	static WebDriver driver;

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27");
		// case 1:
		By macLoc=By.linkText("iMac");
//		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement macEle=wait.until(ExpectedConditions.presenceOfElementLocated(macLoc));
		macEle.click();
	}
}

		// Explicitly Wait
		// Its is not a global wait
		// can be applied for specific element
		//can be used for non web elements like urls,title,alerts

		// WebDriverWait (c)--extends---->fluent wait(c)--implement-->wait(I) until()

//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//
//		// case 1:
//		By macLoc=By.linkText("iMac");
////		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement macEle=wait.until(ExpectedConditions.presenceOfElementLocated(macLoc));
//		macEle.click();
	
//	}
		// case 2: using utility for exp wait

//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		By lgnBtn = By.xpath("//input[@value='Login']");
//		
//		waitForElementPresence(email,10).sendKeys("abc@gmail.com");
//		getElement(pwd).sendKeys("hfafa");
//		getElement(lgnBtn).click();
//	}

//	public static WebElement waitForElementPresence(By locator,int timeout) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//	}
	
	
	//An expectation for checking that an element is present on the DOM of a page and visible.
	//Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
//	public static WebElement waitForElementVisible(By locator,int timeout) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//	}
//	 
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}

//}
