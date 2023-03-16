package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForAlertUsingUtilty21 {

	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		waitForAlertIsPresentAndSwitch(10);

	}

	public static Alert waitForAlertIsPresentAndSwitch(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlertText(int timeOut) {
		return waitForAlertIsPresentAndSwitch(timeOut).getText();
	}

	public static void acceptAlert(int timeOut) {
		waitForAlertIsPresentAndSwitch(timeOut).accept();
	}

	public static void dismissAlert(int timeOut) {
		waitForAlertIsPresentAndSwitch(timeOut).dismiss();
	}

	public static void alertSenkeys(int timeOut, String value) {
		waitForAlertIsPresentAndSwitch(timeOut).sendKeys(value);
		;
	}

}
