package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenCartRegisterAssn26 {
	

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	
	
	@Test(description = "Open cart Logo test")
	public void logoTest() {
		driver.findElement(By.id("input-firstname")).sendKeys("Sanjeet1");
		driver.findElement(By.id("input-lastname")).sendKeys("Singh1");
		driver.findElement(By.id("input-email")).sendKeys("Singh1@test.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9898989889");
		driver.findElement(By.id("input-password")).sendKeys("test@123_");
		driver.findElement(By.id("input-confirm")).sendKeys("test@123_");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
