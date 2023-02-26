package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bigBasketAssn13 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		WebElement shopByLoc = driver.findElement(By.xpath("//a[@qa='categoryDD']"));

		Actions act = new Actions(driver);
		act.moveToElement(shopByLoc).build().perform();

		List<WebElement> categoryListL1 = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
		List<WebElement> categoryListL2 = driver
				.findElements(By.xpath("(//ul[contains(@class,'nav-pills')])[2]/li"));
		List<WebElement> categoryListL3 = driver
				.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]//li"));

		for (WebElement e : categoryListL1) {
			act.moveToElement(e).build().perform();
			System.out.println(e.getText());

//			List<WebElement> categoryListL2 = driver
//					.findElements(By.xpath("(//ul[contains(@class,'nav-pills')])[2]/li"));
			for (WebElement f : categoryListL2) {
				act.moveToElement(f).build().perform();
				System.out.println(f.getText());
//				List<WebElement> categoryListL3 = driver
//						.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]//li"));

				for (WebElement g : categoryListL3) {
					act.moveToElement(g).build().perform();
					System.out.println(g.getText());

				}
			}

		}

//		//ul[@id='navBarMegaNav']//a
//		List<WebElement> categoryListL3=driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]//a"));
//		List<WebElement> categoryListL1=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
//		
//		for(WebElement e:categoryListL1) {
//			
//			act.moveToElement(e).build().perform();
//			String text=e.getText();
//			System.out.println("L1 "+text);
//			Thread.sleep(3000);
//			
//			List<WebElement> categoryListL2 = driver.findElements(By.xpath("(//ul[contains(@class,'nav-pills')])[2]"));
//			for(WebElement f:categoryListL2) {
//				act.moveToElement(f).build().perform();
//				String text1=f.getText();
//				System.out.println("L2--"+text1);
//				
//			}
//			
//			
//		}

	}

}
