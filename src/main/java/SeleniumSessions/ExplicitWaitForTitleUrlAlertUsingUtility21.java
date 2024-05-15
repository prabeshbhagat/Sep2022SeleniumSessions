package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForTitleUrlAlertUsingUtility21 {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();


		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.linkText("Register")).click();
		String title = waitForTitleContains("Register", 5);
		System.out.println(title);

	}

	public static String waitForTitleContains(String titleFractionValue, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		if (wait.until(ExpectedConditions.titleContains("Register"))) {
			return driver.getTitle();
		} else {
			System.out.println("Expected title is not visble...");
			return null;
		}
	}

	// An expectation for checking the title of a page.
	public static String waitForTitleIs(String titleVal, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		if (wait.until(ExpectedConditions.titleIs(titleVal))) {
			return driver.getTitle();
		} else {
			System.out.println("Expected title is not visble...");
			return null;
		}
	}

	public static String waitForURLContains(String urlFractionValue, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		if (wait.until(ExpectedConditions.urlContains(urlFractionValue))) {
			return driver.getCurrentUrl();
		} else {
			System.out.println("Expected URL is not visble...");
			return null;
		}
	}

	public static String waitForURLIS(String urlValue, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
			return driver.getCurrentUrl();
		} else {
			System.out.println("Expected URL is not visble...");
			return null;
		}
	}

}
