package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept7 {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://amazon.com/");
//		String value = driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
//		System.out.println(value);
//
//		WebElement ele = driver.findElement(By.id("nav-logo-sprites"));
//		String classvalue = ele.getAttribute("class");
//		String hrefvalue = ele.getAttribute("href");
//		System.out.println(classvalue);
//		System.out.println(hrefvalue);

		By logo = By.id("nav-logo-sprites");
		String attrKey = "class";

		String attributeValue = doGetAttributeValue(logo, attrKey);
		System.out.println(attributeValue);
	}

	public static WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doGetAttributeValue(By locator, String attrKey) {
		return getWebElement(locator).getAttribute(attrKey);
	}

}
