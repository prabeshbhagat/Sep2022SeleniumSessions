package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest29 extends BaseTest29 {
	
	
	
	@DataProvider
	public Object[][] loginNegativeDataTest(){
		return new Object[][] {
			{"test12@mail.com","1234qwer"},
			{"test123@mail.com","test14dd2@mail.comw"},
			{"test121@mail.com","tes738ee"},
			{"test1211@mail.com","test12e"}
		};
	}
	
	
	@Test(dataProvider="loginNegativeDataTest")
	public void loginNegativeTest(String un,String pwd) {

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(un);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println("errMsg is :"+errMsg);
		Assert.assertTrue(errMsg.contains("No match"));
	}

}
