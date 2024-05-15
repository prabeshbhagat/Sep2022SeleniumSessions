package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionWithFEAndFEs7 {

	public static void main(String[] args) {

		// there is no exception in Selenium like Element No found Exception
		// there will be no exception returned for List<WebElemenT>
		// it will return an empty list if we pass an wrong xpath.

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// driver.findElement(By.id("input-email1"));
		// NoSuchElementException - If no matching elements are found
		// NoSuchElementException
		// List<WebElement> linksList =
		// driver.findElements(By.xpath("//div[@class='list-group']/a0"));
		// findElements//A list of all matching WebElements, or an empty list if nothing
		// matches
		// findElement//
		List<WebElement> linksList = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		System.out.println(linksList.size());// empty list
		int count = 0;

		for (WebElement e : linksList) {

			String text = linksList.get(count).getText();
			System.out.println(text);
			count++;
			System.out.println(count);

		}

	}

}
