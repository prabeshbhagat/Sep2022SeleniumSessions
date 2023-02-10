package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics4 {

	public static void main(String[] args) {
//
//		// 1.open browser
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		// 2.launch url
//		// driver.get("https://www.google.com");
//
//		// InvalidArgumentException
//		// this will come whenever there is no protocol
//		// driver.get("www.google.com");
//		driver.get("https://google.com");

		
//		// 3.get the title
//		String title = driver.getTitle();
//		System.out.println("The title of the page is :" + title);
//
//		// validataion or testing or check point or actual vs expected
//		if (title.equals("Google")) {
//			
//			System.out.println("Title is correct");
//		} else {
//			System.out.println("Title is incorrect");
//		}
//		
//		//Automation steps +validation=Automation testing
//		driver.quit();//close the browser
//		
		//----------------------------------------------------------
		//------------------------------------------
		//-------------------------------------
		//Assignement with Linkedin .com
		

		// 1.open browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2.launch url
		 driver.get("https://www.linkedin.com");

		// InvalidArgumentException
		// this will come whenever there is no protocol
		// driver.get("www.google.com");
		//driver.get("https://google.com");

		// 3.get the title
		String title = driver.getTitle();
		System.out.println("The title of the page is :" + title);

		// validataion or testing or check point or actual vs expected
		if (title.contains("LinkedIn")) {
			
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}
		
		//Automation steps +validation=Automation testing
		//driver.quit();//close the browser
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String pgSrc=driver.getPageSource();
		System.out.println(pgSrc);
		
		
		if(pgSrc.contains("Copyright Policy")) {
			System.out.println("The text is present");
		}
		
		
	}	

}
