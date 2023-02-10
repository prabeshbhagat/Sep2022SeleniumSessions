package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest29 {

//	WebDriver driver;

//	@BeforeTest
//	public void setupMethod() {
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://naveenautomationlabs.com/opencart/");
//	}

	@Test(priority=1)
	public void titleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/");
		Assert.assertEquals(driver.getTitle(), "Your Store");
	}

	@Test(priority=2)
	public void searchbarExistTest() {
		Assert.assertEquals(driver.findElement(By.name("search")).isDisplayed(), true);
	}

//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}


}
