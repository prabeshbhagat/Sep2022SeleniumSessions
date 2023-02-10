package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();//maxmize browser
		
		driver.manage().window().fullscreen();//fit to screen
		Thread.sleep(2000);
		driver.manage().window().minimize();

	}

}
