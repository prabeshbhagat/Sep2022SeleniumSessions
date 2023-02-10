package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//1.Open Browser
//		WebDriver driver=new ChromeDriver();
//		
//		//2.Launch URL
//		driver.get("https://www.google.co.in");
//		//3. Get the title
//		System.out.println(driver.getTitle());
//		
//		//4. close browser
//		driver.quit();
//		
//		//System.out.println(driver.getTitle());
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

		WebDriver driver = new ChromeDriver();

		// 2.Launch URL
		driver.get("https://www.google.co.in");
		// 3. Get the title
		System.out.println(driver.getTitle());

		// 4. close browser
		driver.close();

		 //System.out.println(driver.getTitle());

		// NoSuchSessionException
		// Session ID is null. Using WebDriver after calling quit()?

		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		// 3. Get the title
		System.out.println(driver.getTitle());

		

	}

}
