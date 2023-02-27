package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextFiledValue15 {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement login=driver.findElement(By.id("input-email"));
		login.sendKeys("parabesh@gmail.com");
		String val=login.getText();
		 val=login.getAttribute("value");
		System.out.println(val);
	}

}
