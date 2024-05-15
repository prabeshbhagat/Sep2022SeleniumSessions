package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableConceptCheckBox17 {

	// even if the name position changes the xpath should be so generic that its
	// should handle

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//a[text()='Kevin.Mathews']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		selectUserCheckbox("Kevin.Mathews");
		selectUserCheckbox("Joe.Root");
		List<String> kevinDetails=getUserInfo("Kevin.Mathews");
		System.out.println("Details:"+kevinDetails);
	}
	//"//table[contains(@class,'table-bordered')]/descendant::a[text()='"+productName+"']"
	public static void selectUserCheckbox(String user) {
		driver.findElement(
				By.xpath("//a[text()='" + user + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static List<String> getUserInfo(String user) {
		List<WebElement> colElem = driver
				.findElements(By.xpath("//a[text()='" + user + "']/parent::td/following-sibling::td"));
		List<String> eles = new ArrayList<String>();
		for (WebElement e : colElem) {
			String ele = e.getText();
			eles.add(ele);
		}

		return eles;

	}

}
