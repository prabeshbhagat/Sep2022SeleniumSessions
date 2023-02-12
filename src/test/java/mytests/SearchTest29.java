package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest29 extends BaseTest29 {
	
	@DataProvider
	public Object[][] getSearchData() {
		return new Object[][] {
			{"macbook"},
			{"ipad"},
			{"samsung"}
		};
		
	}

	@Test(dataProvider="getSearchData")
	public void searchTest(String productName) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("#search button")).click();
		String results = driver.findElement(By.tagName("h1")).getText();
		Assert.assertTrue(results.contains(productName));
	}

}
