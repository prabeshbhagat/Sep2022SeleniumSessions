package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenCartTest26 {
	WebDriver driver;

	@BeforeMethod
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

	@Test(description = "Open cart title test")
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		Assert.assertEquals(title, "Account Login1", "...Open Cart Login Title is incoreect..");
	}

	@Test(description = "Open cart Logo test")
	public void logoTest() {
		boolean flag = driver.findElement(By.cssSelector("div#logo img")).isDisplayed();
		Assert.assertEquals(flag, true);
	}

	@Test(description = "Open cart fgt pwd test")
	public void ForgotPwdLinkExistTest() {
		boolean flag = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	//combine all test in a single test  its a bad approach 
	//1st disadvantage as if 1st assert fails lines after that wont be executed
	
	//2nd disadvantage wont be able to know a specific test cases & its details if we combine all & run & if passes
	@Test
	public void combineAllTest() {

		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		Assert.assertEquals(title, "Account Login1", "...Open Cart Login Title is incoreect..");
	

		boolean flag = driver.findElement(By.cssSelector("div#logo img")).isDisplayed();
		Assert.assertEquals(flag, true);
	
	
		boolean flag1 = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		Assert.assertEquals(flag1, true);
	
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
