package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch8 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

//		driver.findElement(By.name("q")).sendKeys("irctc");
//		Thread.sleep(3000);
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//
//		for (WebElement e : suggList) {
//			System.out.println(e.getText());
//			if (e.getText().equals("irctc pnr")) {
//				e.click();
//				break;
//			}
//
//		}
		By searchLocator = By.name("q");
		By listLocator = By.xpath("//div[@class='wM6W7d']/span");
		googleSearchAndClick(searchLocator, "irctc", listLocator, "irctc pnr");
	}

	public static void googleSearchAndClick(By searchLocator, String searchValue, By listLocator, String clickValue)
			throws InterruptedException {
		getElement(searchLocator).sendKeys(searchValue);
		Thread.sleep(3000);
		List<WebElement> suggList = getElements(listLocator);
		for (WebElement e : suggList) {
			System.out.println(e.getText());
			if (e.getText().contains(clickValue)) {
				e.click();
				break;
			}
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
