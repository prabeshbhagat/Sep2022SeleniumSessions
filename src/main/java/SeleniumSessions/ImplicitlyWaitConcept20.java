package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitlyWaitConcept20 {

	public static void main(String[] args) {

		// Implicitly wait concept:Dynamic wait
		// 10secs ---> 2 secs --> 8 secs will cancelled/ignored
		// its only applied for WebElements
		// it will be by default applied for all WebElemnts in the page once it is
		// declared
		// not applicable for non WebElements: alerts,title,urls
		// its a global wait

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(opt);
		//Int Qu diff bet Sel 3 & 4
		// Selenium 3.X
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Selenium 4.X
		//for home Page wait is for 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27");
		WebElement e1 = driver.findElement(By.linkText("iMac"));
		System.out.println(e1.getAttribute("href"));
		
		//if the ele is not found within 10 secs it throw exception
		//if the ele is found in 2secs it will ignore 8 secs.
		//e2
		//e3
		//e4
		
		//for login page we need wait of 20 secs
		//the imp wait will be overwidden to 20 secs for all webelements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//problem :anytime we need to change it will be applicable for all ele 
		//override again & again
		//eg- for homepage we want 10 secs wait //than for login page we want 20 secs that time it will be overiiden to 20 secs
		//oce declred applicable for all
		
	}

}
