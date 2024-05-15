package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitVsClose3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//1.Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		
		//2.Launch URL
		driver.get("https://www.google.co.in");
		//3. Get the title
		System.out.println(driver.getTitle());
		
		//4. close browser
		driver.quit();
		
		System.out.println(driver.getTitle());
//		
//		//NoSuchSessionException
//		//Session ID is null. Using WebDriver after calling quit()?
//		
//		driver=new ChromeDriver();
//		driver.get("https://www.google.co.in");
//		//3. Get the title
//		System.out.println(driver.getTitle());
//		
//		//4. close browser
//		driver.quit();

		// *********************Close******************************//
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		//WebDriverManager.chromedriver().setup();
//		ChromeOptions co= new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(co);
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		

		// 2.Launch URL
		driver.get("https://www.google.co.in");
		// 3. Get the title
		System.out.println(driver.getTitle());

		// 4. close browser
		driver.close();

		 System.out.println(driver.getTitle());

		// NoSuchSessionException
		// Session ID is null. Using WebDriver after calling quit()?

		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		// 3. Get the title
		System.out.println(driver.getTitle());

	}

}
