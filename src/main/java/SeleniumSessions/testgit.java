package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testgit {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

}
