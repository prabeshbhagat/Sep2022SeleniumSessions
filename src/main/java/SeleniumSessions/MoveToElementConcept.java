package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		/**
		 * 
		 * WebElement addOns = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		 * 
		 * Actions action = new Actions(driver);
		 * 
		 * action.moveToElement(addOns).build().perform();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//div[text()='Student Discount']")).click();
		 * 
		 */

		//selectSubMenu("Add-ons", "Student Discount");
		selectSubMenu("div","SpiceClub", "Benefits");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void selectSubMenu(String htmlTag,String parentMenu, String childMenu) throws InterruptedException {

		By parentMenuLocator = By.xpath("//"+htmlTag+"[text()='" + parentMenu + "']");
		By childMenuLocator = By.xpath("//"+htmlTag+"[text()='" + childMenu + "']");

		WebElement parent = getElement(parentMenuLocator);

		Actions action = new Actions(driver);

		action.moveToElement(parent).build().perform();

		Thread.sleep(3000);

		doClick(childMenuLocator);

	}

}
