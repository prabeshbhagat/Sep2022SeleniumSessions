package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MultipleLevelParentchildMenu11 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.bigbasket.com/");
		// --**Without using generic method**--
		// WebElement shopByLocL1 =
		// driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		
		/**
		WebElement shopBYCatBtn = driver.findElement(By.id("headlessui-menu-button-:R5bab6:"));
		shopBYCatBtn.click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		// action.moveToElement(shopByLocL1).build().perform();
		WebElement bevragesL2 = driver.findElement(By.xpath("(//a[text()='Beverages'])[2]"));
		action.moveToElement(bevragesL2).build().perform();
		Thread.sleep(2000);
		WebElement teaL3 = driver.findElement(By.xpath("(//a[text()='Tea'])[1]"));

		action.moveToElement(teaL3).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Green Tea'])[1]")).click();
		
		**/

		 By parentMenu=By.id("headlessui-menu-button-:R5bab6:");
		 selectLevel4MenuItem(parentMenu,"a","Beverages","Tea","Green Tea");
	}

	public static void selectLevel4MenuItem(By eleLoctaor, String htmlTag, String level1Menu, String level2Menu,
			String level3Menu) throws InterruptedException {
		
		WebElement shopByLocL1 = driver.findElement(eleLoctaor);
		shopByLocL1.click();
		Thread.sleep(2000);

		Actions action = new Actions(driver);

		//action.moveToElement(shopByLocL1).build().perform();

		WebElement bevragesL2 = driver.findElement(By.xpath("(//" + htmlTag + "[text()='" + level1Menu + "'])[2]"));
		action.moveToElement(bevragesL2).build().perform();
		
		WebElement teaL3 = driver.findElement(By.xpath("(//" + htmlTag + "[text()='" + level2Menu + "'])[1]"));
		Thread.sleep(4000);
		action.moveToElement(teaL3).build().perform();

		driver.findElement(By.xpath("(//" + htmlTag + "[text()='" + level3Menu + "'])[1]")).click();

	}

}
