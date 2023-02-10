package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest28 extends BaseTest29{
	
	@Test(priority=1)
	public void titleTest() {
		//driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(priority=2)
	public void searchbarExistTest() {
		Assert.assertEquals(driver.findElement(By.name("q")).isDisplayed(), true);
	}

	
}
