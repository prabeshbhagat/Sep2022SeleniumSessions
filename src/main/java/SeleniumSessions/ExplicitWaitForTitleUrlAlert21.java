package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForTitleUrlAlert21 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(opt);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.linkText("Register")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		if(wait.until(ExpectedConditions.titleContains("Register"))) {
			System.out.println(driver.getTitle());
		}

	}

}
