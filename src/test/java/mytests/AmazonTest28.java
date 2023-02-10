package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest28 extends BaseTest29 {

	@Test(priority=1)
	public void titleTest() {
		//driver.get("https://www.amazon.in");
		Assert.assertEquals(driver.getTitle(),
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Test(priority=2)
	public void searchbarExistTest() {
		Assert.assertEquals(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed(), true);
	}

}
