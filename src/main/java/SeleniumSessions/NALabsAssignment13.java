package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NALabsAssignment13 {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

		List<WebElement> elements1 = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']//li"));
		Actions act=new Actions(driver);
		for (WebElement e : elements1) {
			act.moveToElement(e).build().perform();
			System.out.println(e.getText());
		}
	}

}
