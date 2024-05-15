package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class bigBasketAssn13 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//By by=By.xpath("//a[@qa='categoryDD']");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.bigbasket.com/");
		
		By parentMenu=By.id("headlessui-menu-button-:R5bab6:");
		WebElement shopByLoc = driver.findElement(parentMenu);
		shopByLoc.click();
		Actions act = new Actions(driver);
		//act.moveToElement(shopByLoc).build().perform();
		
		
		
		List<WebElement> categoryListL1 = driver.findElements(By.xpath("((//nav[@class='jsx-1259984711 flex text-medium'])[2]//ul)[1]//li"));
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
