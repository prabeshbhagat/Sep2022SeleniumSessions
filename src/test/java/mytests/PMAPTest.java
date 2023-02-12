package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PMAPTest extends BaseTest29 {


	@Test(priority=1)
	public void titleTest() {
		driver.findElement(By.id("txtUserName")).sendKeys("demouser");
		driver.findElement(By.id("txtPassword")).sendKeys("lk4nHFY57fyvg2");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals(driver.getTitle(),
				"EHS System");
		
	}

	@Test(priority=2,enabled=true)
	public void verifyURLTest() {
		driver.findElement(By.id("txtUserName")).sendKeys("demouser");
		driver.findElement(By.id("txtPassword")).sendKeys("lk4nHFY57fyvg2");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("home"));
	}



}
