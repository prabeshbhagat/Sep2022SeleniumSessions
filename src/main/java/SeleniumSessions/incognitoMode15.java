package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognitoMode15 {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		//co.setHeadless(true);
		co.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.quit();

 
	}

}
