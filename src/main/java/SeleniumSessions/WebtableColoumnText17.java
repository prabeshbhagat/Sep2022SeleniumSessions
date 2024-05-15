package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebtableColoumnText17 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("newautomation");	
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
			
		driver.switchTo().frame("mainpanel");
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).click().build().perform();
		
		
		System.out.println(getCompanyName("Romi singh"));
		System.out.println(getCompanyName("sanvy k"));
		System.out.println(getEmail("Kishore Venkat"));
		
		//span[contains(text()='Mushfiqur Rahim')]
	}
	
	public static String getCompanyName(String username) {
		//a[text()='Romi singh']/parent::td/following-sibling::td/a[@context='company']
		return driver.
		findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context='company']"))
		.getText();
	}
	
	public static String getEmail(String username) {
		//a[text()='Romi singh']/parent::td/following-sibling::td/a[@context='company']
		return driver.
		findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[last()-1]/a"))
		.getText();
	}

}
