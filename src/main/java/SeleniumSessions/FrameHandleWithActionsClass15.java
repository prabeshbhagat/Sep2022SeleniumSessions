package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandleWithActionsClass15{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("newautomation");	
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		List<WebElement> noOFFrames=driver.findElements(By.tagName("frame"));
		System.out.println(noOFFrames.size());
		driver.switchTo().frame("mainpanel");
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).build().perform();
		act.click(driver.findElement(By.linkText("New Contact"))).build().perform();
		driver.findElement(By.name("first_name")).sendKeys("Test 123");
		

	}

}
