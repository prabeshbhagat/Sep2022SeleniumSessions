package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebtablePaginationConceptMultiSel20Pre {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(opt);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);

		while (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
			System.out.println("Inside while loop");
			if (true) {
				multiSelectCountry("India");
			}
			
			//pagination logic::
			WebElement nextButton = driver.findElement(By.linkText("Next"));
			
			if (nextButton.getAttribute("class").contains("disabled")) {
				System.out.println("Pagination is over.....");
				break;
			}
			nextButton.click();
		}
		System.out.println("Outside  while loop");

	}

	public static void multiSelectCountry(String country) {
		List<WebElement> checkBoxList = driver
				.findElements(By.xpath("(//td[text()='India'])/preceding-sibling::td/input[@type='checkbox']"));

		for (WebElement e : checkBoxList) {
			e.click();
		}
	}
}
