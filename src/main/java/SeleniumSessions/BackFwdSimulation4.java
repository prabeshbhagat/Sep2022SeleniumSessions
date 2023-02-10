package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackFwdSimulation4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.navigate().to("https://www.google.com");
		System.out.println("1"+driver.getTitle());
		
		driver.get("https://www.amazon.com");
		//driver.navigate().to("https://www.amazon.com");
		System.out.println("2"+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("3"+driver.getTitle());
		//Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("4"+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("5"+driver.getTitle());
		
		driver.navigate().refresh();
		
		

	}

}
