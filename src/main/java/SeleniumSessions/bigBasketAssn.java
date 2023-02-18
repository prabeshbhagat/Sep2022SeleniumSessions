package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bigBasketAssn {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		WebElement shopByLocL1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(shopByLocL1).build().perform();
		
		Thread.sleep(2000);
		
		WebElement FreshVegetables = driver.findElement(By.xpath("(//a[text()='Fresh Vegetables'])[2]"));
		act.moveToElement(FreshVegetables).build().perform();
		
		Thread.sleep(2000);
		
		

	}

}
