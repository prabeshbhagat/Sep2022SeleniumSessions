package SeleniumSessions;
//43

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WaitForPageLoadConcept22 {

	static WebDriver driver;

	public static void waitForPageLoad(int timeOut) {

		long endTime = System.currentTimeMillis() + timeOut;

		while (System.currentTimeMillis() < endTime) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String pageState = js.executeScript("return document.readyState").toString();
			System.out.println(pageState);
			if (pageState.equals("complete")) {
				System.out.println("Page Dom is fully loaded ...");
				break;
			}
		}

	}

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(opt);
		driver.get("https://naveenautomationlabss.com/opencart/index.php?route=account/login");
		waitForPageLoad(10);
	}

}