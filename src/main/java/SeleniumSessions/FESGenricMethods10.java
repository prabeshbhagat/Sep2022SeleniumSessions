package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FESGenricMethods10 {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.findElement(null);
		driver.get("https://www.freshworks.com/");
		By footerLinks = By.xpath("//div[contains(@class,'footer-left-section')]//a");
		int actFooterLinkCount=totalElementsCount(footerLinks);
		if(actFooterLinkCount==20) {System.out.println("footerLinkscount --Pass");}

		List<String> actEleTextList = getElementsTextList(footerLinks);
		System.out.println(actEleTextList);
		System.out.println(actEleTextList.size());

		if (actEleTextList.contains("Philanthropy")) {System.out.println("1Pass");}
		if (actEleTextList.contains("Affiliates")) {System.out.println("2Pass");}
		if (actEleTextList.contains("Tax FAQs")) {System.out.println("3Pass");}

	}

	public static int totalElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		System.out.println("======" + eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}

		return eleTextList;

	}

}
