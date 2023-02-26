package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithAllWinodwsCaseOne14 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		WebElement fbPage = driver.findElement(By.xpath("//img[contains(@src,'facebook')]"));
		WebElement linkdinPage = driver.findElement(By.xpath("//img[contains(@src,'linkedin')]"));
		WebElement ytubePage = driver.findElement(By.xpath("//img[contains(@src,'youtube')]"));

		String parentWindowId = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", fbPage);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", linkdinPage);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", ytubePage);

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			if (!windowId.equals(parentWindowId)) {
				driver.close();
			}

		}
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
	}

}
