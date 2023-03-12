package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablePaginationConcept20Pre {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(opt);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		
		//single selection
		// the no of iterations are unknown hence while loop
		while (true) {

			if (driver.findElements(By.xpath("//td[text()='Hong Kongs']")).size() > 0) {
				selectCountry("Hong Kongs");
				break;
			} else {

				// pagination Logic
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over..Next Button is disabled..Country is not found");
					break;
				}
				next.click();
				Thread.sleep(1000);
			}
		}

	}

	public static void selectCountry(String country) {
		driver.findElement(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

}
