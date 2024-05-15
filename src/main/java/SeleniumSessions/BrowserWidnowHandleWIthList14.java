package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserWidnowHandleWIthList14 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions co= new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		//WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		WebElement fbPage = driver.findElement(By.xpath("//img[contains(@src,'facebook')]"));
		WebElement linkdinPage = driver.findElement(By.xpath("//img[contains(@src,'linkedin')]"));
		WebElement ytubePage = driver.findElement(By.xpath("//img[contains(@src,'youtube')]"));

		String parentWindowId = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", fbPage);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", linkdinPage);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", ytubePage);

		Set<String> handles = driver.getWindowHandles();
		//converting set to list
		List<String> list=new ArrayList<String>(handles);
		String pwid=list.get(0);
		String cwid1=list.get(1);
		String cwid2=list.get(2);
		String cwid3=list.get(3);
		
		driver.switchTo().window(cwid1);
		String chURl=driver.getCurrentUrl();
		System.out.println(chURl);
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(cwid2);
		String chUR2=driver.getCurrentUrl();
		System.out.println(chUR2);
		driver.close();
		
		driver.switchTo().window(cwid3);
		String chUR3=driver.getCurrentUrl();
		System.out.println(chUR3);
		driver.close();
		
		driver.switchTo().window(pwid);
		String pURL=driver.getCurrentUrl();
		System.out.println(pURL);
		driver.quit();
	}

}
