package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Headless mode:Bowser will not display
		//execution will happen behind the scene
		//faster than normal mode
		
		//htmlUnit ,phantom Js--ghost driver deprecated
		
		ChromeOptions co=new ChromeOptions();
		//co.setHeadless(true);
		co.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}
