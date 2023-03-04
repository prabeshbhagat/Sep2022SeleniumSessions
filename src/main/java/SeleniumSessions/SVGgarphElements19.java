package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGgarphElements19 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(3000);
		// using css selector //g#regions>g
		// *[local-name()='svg']//*[name()='g' and @class='region']//*[name()='path']
		// *[local-name()='svg' and @id='map-svg']//*[name()='g' and
		// @id='regions']//*[name()='path']

		String xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='path']";
		WebElement ele = driver.findElement(By.cssSelector("iframe[id*=map-instance]"));
		driver.switchTo().frame(ele);

		List<WebElement> statesList = driver.findElements(By.xpath(xpath));
		System.out.println(statesList.size());

		Actions act = new Actions(driver);

		for (WebElement e : statesList) {
			String text = e.getAttribute("name");
			System.out.println(text);

			if (text.equals("Alaska")) {
				act.click(e).build().perform();
				break;
			}

			// act.moveToElement(e).build().perform();
		}

	}

}
