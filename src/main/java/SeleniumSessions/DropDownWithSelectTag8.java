package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelectTag8 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		Thread.sleep(2000);

		 WebElement dropDown = driver.findElement(By.id("Form_getForm_Country"));
		 Select select = new Select(dropDown);

		// select.selectByIndex(150);
		// select.selectByVisibleText("Andorra");
		// select.selectByValue("Austria");

		// 30:00
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country,96);
		Thread.sleep(2000);
		doSelectByVisibleText(country, "Albania");
		Thread.sleep(2000);
		doSelectByValue(country, "India");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByVisibleText(By locator, String name) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(name);
	}

	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
