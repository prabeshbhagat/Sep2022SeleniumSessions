package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverTopCastingOptions02 {

	static WebDriver driver;

	public static void main(String[] args) {

		// Creating the object of browser driver class
		// valid top casting we use for local excecution for specific browser.
		// ----------------
//#######		// 1.
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\pb610335\\Downloads\\Selenium\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();

		// 2.
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\pb610335\\Downloads\\Selenium\\geckodriver.exe");
		// FirefoxDriver driver = new FirefoxDriver();

		// 3.
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\pb610335\\Downloads\\Selenium\\edgedriver.exe");
		// EdgeDriver driver = new EdgeDriver();
		// ---------------
		System.out.println("-------------------------------");
//########		// 2.Top casting cross browser testing
		// valid top casting we use for local excecution for multiple browser.
//
//		String browser = "ie";
//		if (browser.equals("edge")) {
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\edgedriver.exe");
//			driver = new EdgeDriver();
//		} else if (browser.equals("chrome")) {
//
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\chromedriver.exe");
//			driver = new ChromeDriver();
//
//		} else if (browser.equals("firefox")) {
//
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\geckodriver.exe");
//			driver = new FirefoxDriver();
//
//		} else {
//
//			System.out.println("Please pass the right browser");
//		}
//		
		System.out.println("-------------------------------");

		String browser1 = "ie";
		switch (browser1) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\edgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser");
			break;
		}

//------//3.WD=RWD use to execute test cases in remote machine & in cloud or in grid 
		// valid top casting we use it for remote excecution .

		// driver=new RemoteWebDriver(remoteaddress, capablites);

//#######-----//4.Sc=RWD
		// SearchContext driver=new ChromeDriver();
		// valid top casting but cannot be used to access multiple methods.
		// valid top casting but we dont use it practically.

//5##########---//5.RWd=CD/SD/ED/FD	
		// valid top casting can be used for local execution.
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\chromedriver.exe");
//		RemoteWebDriver driver = new ChromeDriver();

//6############--//6 Sc=RWD
		// valid top casting but we cannot user it as it has 2 methods can only be
		// acesssible
		// ref type check will fail while accessing other methods.
		// SearchContext sc= new RemoteWebDriver(remoteaddress, capabilities);
		// sc.findElement(null);

		// driver.get("www.google.com");
		driver.get("https://google.com");

		// 3.get the title
		String title = driver.getTitle();
		System.out.println("The title of the page is :" + title);

		// validataion or testing or check point or actual vs expected
		if (title.equals("Google")) {

			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		// Automation steps+validation=Automation testing
		driver.quit();// close the browser

	}

}
