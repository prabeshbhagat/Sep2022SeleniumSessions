package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcepWithUtilityt22 {

	static WebDriver driver;

	public static void main(String[] args) {

		// WebDriverWait--->FluentWait-->Wait

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);

		driver.get("https://classic.freecrm.com/index.html");

		By forgotPwd = By.linkText("Forgot Password?");
		waitForElementTobeVisibleWithFluentWait(forgotPwd, 10, 2).click();

	}

	 public static WebElement waitForElementTobeVisibleWithFluentWait(By locator, int timeOut, int intervaltime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervaltime)).ignoring(ElementNotInteractableException.class)
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.withMessage("Element Not found on the page...");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
