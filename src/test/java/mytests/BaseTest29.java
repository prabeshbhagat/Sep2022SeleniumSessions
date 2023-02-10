package mytests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest29 {

	// moved the duplicate code to Base class
	// driver will be intialized in Base class

	WebDriver driver;

	// parameter will pick the url passed in testng.xml file
	@Parameters({ "url", "browser","headless" })
	@BeforeTest
	public void setupMethod(String url, String browserName,String headless) {

		System.out.println("Launching browser" + browserName);
		ChromeOptions co=new ChromeOptions();
		
		
		
		if (browserName.equalsIgnoreCase("chrome")) {
			co.setHeadless(Boolean.parseBoolean(headless));
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Please pass the right browser" + browserName);
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);

	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
