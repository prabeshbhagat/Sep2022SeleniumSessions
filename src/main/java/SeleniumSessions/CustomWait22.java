package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomWait22 {

	// instead of Null pointer exception we are throwing our own custom exception in
	//line 44
	//to avoid null pointer exception
	//selenium performs action once the page is fully loaded
	//sometime the page loading completed but some elements are still loading 
	//https://developer.mozilla.org/en-US/docs/Web/API/Document/readyState
	//Document.readyState

	static WebDriver driver;

	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getelement(locator);
				System.out.println("Element is found in attempt " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt :" + attempts + " for " + locator);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}

			attempts++;
		}
		if (element == null) {

			System.out.println(
					"element not found tried for: " + timeOut + " Secs " + " tried with the interval of 0.5 sec");
			throw new FrameworkExeption4("TimeOutException");
		}
		return element;
	}

	public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getelement(locator);
				System.out.println("Element is found in attempt " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt :" + attempts + " for " + locator);
				try {
					Thread.sleep(intervalTime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}

			attempts++;
		}
		if (element == null) {

			System.out.println("element not found tried for: " + timeOut + " Secs " + " tried with the interval of "
					+ intervalTime + " sec");
			throw new FrameworkExeption4("TimeOutException");
		}
		return element;
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		By firstname = By.name("first_name ");
		// retryingElement(firstname, 20).sendKeys("Prabesh");
		retryingElement(firstname, 10, 2000).sendKeys("Prabesh");

	}

}
