package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopupCaseOne13 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(5000);
		// Window handler api

		WebElement fbEle = driver.findElement(By.xpath("//img[contains(@src,'facebook')]"));
		WebElement linkdinEle = driver.findElement(By.xpath("//img[contains(@src,'linkedin')]"));
		WebElement ytubeEle = driver.findElement(By.xpath("//img[contains(@src,'youtube')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", fbEle);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", linkdinEle);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", ytubeEle);

		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		String parentwindowId = it.next();
		String childwindowId1 = it.next();
		String childwindowId2 = it.next();
		String childwindowId3 = it.next();

		System.out.println("Parent window Id " + parentwindowId);
		System.out.println("1st Child window Id " + childwindowId1);
		System.out.println("2nd Child window Id " + childwindowId2);
		System.out.println("3rd Child window Id " + childwindowId3);

		// Swicthing part
		// Swicth to 1st child window
		driver.switchTo().window(childwindowId1);
		System.out.println("Child 1 Url :" + driver.getCurrentUrl());
		driver.close();

		// Swicth to 2nd child window
		driver.switchTo().window(childwindowId2);
		System.out.println("Child 2 Url :" + driver.getCurrentUrl());
		driver.close();

		// Swicth to 3rd child window
		driver.switchTo().window(childwindowId3);
		System.out.println("Child 3 Url :" + driver.getCurrentUrl());
		driver.close();

		// Swicth to  Parent window
		driver.switchTo().window(parentwindowId);
		System.out.println("PArent Url :" + driver.getCurrentUrl());
		driver.quit();

	}

}
