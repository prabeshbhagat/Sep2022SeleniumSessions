package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest27 {
	

	WebDriver driver;
	//Before test if we have 100 tc's and browser will be launced for example if the browser gets 
	//crashed after 4th tc's than from 5th to 100 tc wont execute as we have no mechanaism to launch browser again,
	//BT is for sanity or staraigt forward scenario or 
	 
	
	//Bm we will create a pair with BM test AM
	//if 10 tcs 10 pair will be created
	//BM is used for regression where we have 500 tc's
	
	
	//Diff bet bM & BT
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	// custom message on exception Assert with msg
	// msg will be printed when assertion is getting failed
	// Desciption for each test can also be written
	// right click on particular test and run that

	@Test(description = "Open cart title test",priority=2)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		Assert.assertEquals(title, "Account Login", "...Open Cart Login Title is incoreect..");
	}

	@Test(description = "Open cart Logo test",priority=1)
	public void logoTest() {
		boolean flag = driver.findElement(By.cssSelector("div#logo img")).isDisplayed();
		Assert.assertEquals(flag, true);
	}

	@Test(description = "Open cart fgt pwd test",priority=3)
	public void ForgotPwdLinkExistTest() {
		boolean flag = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		Assert.assertEquals(flag, true);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}



}
