package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForAlert21 {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		
		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//what the below method does is wait for alert and even switches to the alert 
		//as well
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.dismiss();
	}

}
