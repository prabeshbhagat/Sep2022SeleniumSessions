package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By search = By.name("search");
		By logo = By.className("img-responsive");

//		if (doISDisplayedMethod(search)) {
//			System.out.println("Search is displayed");
//		}
//		;
//		if (doISDisplayedMethod(logo)) {
//			System.out.println("Logo is dispalyed");
//		}
//		;

//		boolean actfalg = isDisplayedMethod(locator);
//		if (actfalg) {
//			System.out.println("Flag is displayed");
//		} else {
//			System.out.println("Flag is not displayed");

//		}

		// find an element is there or not without using isDisplayed method.
//		int size=driver.findElements(search).size();
//		if(size==1) {System.out.println("Search is displayed ");}

		if (isSingleElementExist(search)) {
			System.out.println("ele is dispalyed");
		}
		if (isSingleElementExist(logo)) {
			System.out.println("ele is dispalyed");
		}
		;

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean doISDisplayedMethod(By locator) {
		return getElement(locator).isDisplayed();
	}

	// find an element without using is displayed
	public static boolean isSingleElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("Actual count of element is++" + actCount);
		if (actCount == 1) {
			return true;
		}
		return false;
	}

	public static boolean isTwoElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("Actual count of element is++" + actCount);
		if (actCount == 2) {
			return true;
		}
		return false;
	}
	//mutliple element not aware of actElement count
	public static boolean isMultipleElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("Actual count of element is++" + actCount);
		if (actCount >1) {
			return true;
		}
		return false;
	}
	
	////mutliple element  aware of actElement count ,pass the count
	public static boolean isMultipleElementExist(By locator, int actElementCount) {
		int actCount = getElements(locator).size();
		System.out.println("Actual count of element is++" + actCount);
		if (actCount == actElementCount) {
			return true;
		}
		return false;
	}

}
