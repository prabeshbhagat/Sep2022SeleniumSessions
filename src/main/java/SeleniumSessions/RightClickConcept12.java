package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept12 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).build().perform();
		
		List<WebElement> rightClickOptions = driver.findElements(By.xpath(
				"//ul[@class='context-menu-list context-menu-root']//li[contains(@class,'context-menu-icon')]/span"));

		System.out.println(rightClickOptions.size());
		
		for (WebElement e : rightClickOptions) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Delete")) {
				e.click();
				break;
			}

		}

	}

}
