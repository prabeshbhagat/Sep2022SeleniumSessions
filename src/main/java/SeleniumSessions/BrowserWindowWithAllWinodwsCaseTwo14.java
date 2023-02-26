package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithAllWinodwsCaseTwo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		WebElement fbPage = driver.findElement(By.xpath("//img[contains(@src,'facebook')]"));
		WebElement linkdinPage = driver.findElement(By.xpath("//img[contains(@src,'linkedin')]"));
		WebElement ytubePage = driver.findElement(By.xpath("//img[contains(@src,'youtube')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", fbPage);

	}

}
