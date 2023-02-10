package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverLaunch {

	public static void main(String[] args) {

		/*
		 * Scenario 1
		 */
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new ChromeDriver();
//		
//		
//		driver.get("https://www.google.com");

		/*
		 * Scenario 2
		 */
//		WebDriver driver = new ChromeDriver();
//		driver = new ChromeDriver();
//		driver = new ChromeDriver();
		// driver.get("https://www.google.com");
//		driver.quit();

		/*
		 * Scenario 3
		 */
//		WebDriver driver = new ChromeDriver();
//		driver = null;//null pointer exception
//		driver.get("https://www.google.com");
//		driver.quit();
//	

		/*
		 * Scenario 4
		 */
//		WebDriver driver = new ChromeDriver();
//		driver = null;
	//  driver = new ChromeDriver();
	//  driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.quit();
//

//		/*
//		 * Scenario 5
//		 */
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new ChromeDriver();
//		WebDriver driver3 = new ChromeDriver();
//		
//		driver1.get("https://www.google.com");
//		driver2.get("https://www.amazon.com");
//		driver3.get("https://www.flipkart.com");
//		driver3.quit();
		
		/*
		 * Scenario 6 Assignment
		 */
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		WebDriver driver3 = new ChromeDriver();
		
		driver1.get("https://www.google.com");
		driver2.get("https://www.amazon.com");
		driver3.get("https://www.flipkart.com");
		
		driver1=driver2;
		System.out.println(driver1.getTitle());
		System.out.println(driver2.getTitle());
		System.out.println(driver3.getTitle());
		driver2=driver3;

		System.out.println(driver1.getTitle());
		System.out.println(driver2.getTitle());
		System.out.println(driver3.getTitle());
		driver3=driver1;
		System.out.println(driver1.getTitle());
		System.out.println(driver2.getTitle());
		System.out.println(driver3.getTitle());
		//driver3.quit();

		
		
	}

}
