package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FESGenricMethodsFoorter10 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.get("https://www.freshworks.com/");
//		
//		By footerLnks = By.xpath("//div[contains(@class,'footer-copyrights')]//a");
//		int actEleCount=totalElementsCount(footerLnks);
//		if(actEleCount==7) {System.out.println("Elements count passed");}
//		
//		List<String> actFooterList=getElementsTextList(footerLnks);
//		
//		System.out.println(actFooterList);
//		if(actFooterList.contains("Privacy Notice")) {System.out.println("1.Pass");}
//		if(actFooterList.contains("Unsubscribe")) {System.out.println("2.Pass");}
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		By langLinks=By.xpath("//div[@id='SIvCob']/a");
		List<String> actlang=getElementsTextList(langLinks);
		System.out.println(actlang);
		
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
