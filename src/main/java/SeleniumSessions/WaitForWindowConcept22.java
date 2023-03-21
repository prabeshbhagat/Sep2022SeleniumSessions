package SeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindowConcept22 {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By linkedin = By.xpath("//a[contains(@href,'linkedin')]");
	
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(2));
		//wait.ignoring(ElementNotInteractableException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(linkedin));

		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		System.out.println("parentWindowId is " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("childWindowId is " + childWindowId);

		// 2.Switch work
		driver.switchTo().window(childWindowId);
		String childUrl = driver.getCurrentUrl();
		System.out.println("The child window URl is" + childUrl);

		// close the child window
		driver.close();

	}

}
