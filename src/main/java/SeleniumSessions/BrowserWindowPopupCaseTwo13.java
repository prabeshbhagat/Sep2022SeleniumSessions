package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopupCaseTwo13 {
		//needs correction
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(5000);
		// Window handler api

		WebElement fbPage = driver.findElement(By.xpath("//img[contains(@src,'facebook')]"));
		WebElement linkdinPage = driver.findElement(By.xpath("//img[contains(@src,'linkedin')]"));
		WebElement ytubePage = driver.findElement(By.xpath("//img[contains(@src,'youtube')]"));
		
		//1.1st Window
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", fbPage);

		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		String parentwindowId = it.next();
		String childwindowId = it.next();
		driver.switchTo().window(childwindowId);
		System.out.println("Child 1 Url :" + driver.getCurrentUrl());		
		driver.close();
		driver.switchTo().window(parentwindowId);
		
		//2.2nd Window
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", linkdinPage);
		
		Set<String> windowIds1 = driver.getWindowHandles();
		Iterator<String> it1 = windowIds1.iterator();
		parentwindowId = it1.next();
		childwindowId = it1.next();
		driver.switchTo().window(childwindowId);
		System.out.println("Child 2 Url :" + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentwindowId);
		
		//3.3rd Window
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ytubePage);
		
		Set<String> windowIds2 = driver.getWindowHandles();
		Iterator<String> it2 = windowIds2.iterator();
		parentwindowId = it2.next();
		childwindowId = it2.next();
		driver.switchTo().window(childwindowId);
		System.out.println("Child 3 Url :" + driver.getCurrentUrl());
		driver.close();
		
		
		
		driver.switchTo().window(parentwindowId);
		System.out.println("PArent 1 Url :" + driver.getCurrentUrl());




//		String childwindowId2 = it.next();
//		System.out.println("222222"+parentwindowId);
		//System.out.println(childwindowId2);

		// Swicthing part
		// Swicth to 2nd child window
		//driver.switchTo().window(childwindowId2);
		//System.out.println("Child 2 Url :" + driver.getCurrentUrl());
		//driver.close();

//
//
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", ytubePage);
//
//		windowIds = driver.getWindowHandles();
//		it = windowIds.iterator();
//		String childwindowId3 = it.next();
//		System.out.println(childwindowId3);
//
//// Swicthing part
//// Swicth to 3rd child window
//		driver.switchTo().window(childwindowId3);
//		System.out.println("Child 2 Url :" + driver.getCurrentUrl());
//		driver.close();

	}

}
