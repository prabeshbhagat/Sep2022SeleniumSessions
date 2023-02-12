package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterAssnTest29 extends BaseTest29 {

	

	@DataProvider
	public Object[][] registerDataSuccessfulTest() {
		return new Object[][] { { "fnames1", "lNames1", "emails11@pmap.com", "9898989891", "#tagpwd1" },
				{ "fnames2", "lNames2", "emails21@pmap.com", "9898989892", "#tagpwd2" },
				{ "fnames3", "lNames3", "emails31@pmap.com", "9898989893", "#tagpwd3" },
				{ "fnames4", "lNames4", "emails41@pmap.com", "9898989894", "#tagpwd4" },
				{ "fnames5", "lNames5", "emails51@pmap.com", "9898989895", "#tagpwd5" } };
	}

	@Test(dataProvider="registerDataSuccessfulTest")
	public void registerSuccessfulTest(String fname,String lname,String email,String num,String pwd) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(fname);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lname);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(num);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(pwd);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Your Account Has Been Created!");
		driver.findElement(By.linkText("Logout")).click();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

}
