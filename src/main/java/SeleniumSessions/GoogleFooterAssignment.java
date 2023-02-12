package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterAssignment {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Browser Launched");
		// List<WebElement>
		// footerLink=driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		List<WebElement> footerLinks = driver.findElements(By.xpath("//*[contains(@class,'pHiOh')]"));

		System.out.println("Click on ");
		for (WebElement e : footerLinks) {
			String text = e.getText();
		}
	}

}
