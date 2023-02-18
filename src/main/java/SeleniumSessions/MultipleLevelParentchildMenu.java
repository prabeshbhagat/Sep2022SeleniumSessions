package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLevelParentchildMenu {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
// without using generic method
//		WebElement shopByLocL1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
//		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//
//		action.moveToElement(shopByLocL1).build().perform();
//
//		WebElement bevragesL2 = driver.findElement(By.xpath("(//a[text()='Beverages'])[2]"));
//		Thread.sleep(2000);
//		action.moveToElement(bevragesL2).build().perform();
//
//		WebElement teaL3 = driver.findElement(By.xpath("(//a[text()='Tea'])[2]"));
//		Thread.sleep(2000);
//		action.moveToElement(teaL3).build().perform();
//
//		driver.findElement(By.xpath("(//a[text()='Green Tea'])[2]")).click();

		By parentMenu=By.xpath("//a[@qa='categoryDD']");
		selectLevel4MenuItem(parentMenu,"a","Beverages","Tea","Green Tea");
	}

	public static void selectLevel4MenuItem(By eleLoctaor,String htmlTag,
			String level1Menu,String level2Menu,String level3Menu) throws InterruptedException {
		
		WebElement shopByLocL1 = driver.findElement(eleLoctaor);
		Thread.sleep(2000);
 
		Actions action = new Actions(driver);

		action.moveToElement(shopByLocL1).build().perform();

		WebElement bevragesL2 = driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level1Menu+"'])[2]"));
		Thread.sleep(2000);
		action.moveToElement(bevragesL2).build().perform();

		WebElement teaL3 = driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level2Menu+"'])[2]"));
		Thread.sleep(2000);
		action.moveToElement(teaL3).build().perform();

		driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level3Menu+"'])[2]")).click();

	}

}
