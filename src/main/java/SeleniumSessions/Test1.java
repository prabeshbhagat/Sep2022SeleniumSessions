package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationregression.quality.pmapconnect.com/?ssoredirect=no");
		System.out.println("--------------");
		Thread.sleep(3000);
		System.out.println("------2--------");
		driver.findElement(By.id("txtUserName")).sendKeys("satishb");
		driver.findElement(By.id("txtPassword")).sendKeys("Pmap@1234");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(7000);
		boolean flag=driver.findElement(By.id("mcp-view-viewName-button")).isDisplayed();
		System.out.println(flag);
		
	}

}
