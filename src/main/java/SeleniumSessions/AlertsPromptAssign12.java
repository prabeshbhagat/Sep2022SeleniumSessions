package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPromptAssign12 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Hello Prabesh");
		//alert.accept();
		alert.dismiss();
		
		//js pop we will get one send keys field
	}

}
