package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntervalTimeOverride22 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		
		driver.get("https://classic.freecrm.com/index.html");
		
		By locator=By.linkText("Forgot Password?1");
		
		
		//overriding the polling time or interval time
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(1));
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(locator));
		ele.click();
	}

}