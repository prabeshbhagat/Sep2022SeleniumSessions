package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class psuedoElements20Pre {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 

		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String mand_text = js.executeScript(
				"return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')")
				.toString();

		System.out.println(mand_text);
		
		if(mand_text.contains("*")) {
			System.out.println(" It is a mandatory field ");
		}

	}

}
