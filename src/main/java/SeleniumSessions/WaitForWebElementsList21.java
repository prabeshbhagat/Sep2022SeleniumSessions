package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWebElementsList21 {
	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);

		driver.get("https://www.freshworks.com/");
		By footer = By.cssSelector("ul.eQNriT a");

		int footerSize = waitForElementsVisible(footer, 10).size();
		System.out.println(footerSize);
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		List<WebElement> ele=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerEleList));
//		System.out.println(ele.size());

	}

	/**
	 * An expectation for checking that all elements present on the web page 
	 * that match the locatorare visible. Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

}
