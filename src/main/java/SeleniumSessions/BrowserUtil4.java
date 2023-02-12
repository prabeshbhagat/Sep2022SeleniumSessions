package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil4 {
	WebDriver driver;

	public WebDriver launchBrowser(String BrowserName) {
		//driver = null;
                //drivers = null;

		switch (BrowserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser");
			break;
		}
		return driver;

	}

	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("url is null");
			throw new FrameworkExeption4("URLISNULL");
		}
		if (url.length() == 0) {
			System.out.println("URL is blank");
			throw new FrameworkExeption4("URL is blank or empty");
		}
		if (url.indexOf("https:") != 0 && url.indexOf("http:") != 0) {
			System.out.println("http is missing");
			throw new FrameworkExeption4("HTTP(S) is missing");
		}

		driver.get(url);
	}

	public void launchUrl(URL url) {
		String newURl = String.valueOf(url);
		if (newURl == null) {
			System.out.println("newURl is null");
			throw new FrameworkExeption4("URLISNULL");
		}
		if (newURl.length() == 0) {
			System.out.println("URL is blank");
			throw new FrameworkExeption4("URL is blank or empty");
		}
		if (newURl.indexOf("https:") != 0 && newURl.indexOf("http:") != 0) {
			System.out.println("http is missing");
			throw new FrameworkExeption4("HTTP(S) is missing");
		}

		driver.navigate().to(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void quitBrowser() {
		driver.close();
	}

	public void closeBrowser() {
		driver.close();
	}

}
