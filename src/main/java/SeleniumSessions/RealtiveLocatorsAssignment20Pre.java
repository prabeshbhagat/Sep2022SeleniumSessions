package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RealtiveLocatorsAssignment20Pre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		
		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		WebElement ele=driver.findElement(By.linkText("John.Smith"));
	
		String leftValue=driver.findElement(with(By.tagName("a")).below(ele)).getText();
		System.out.println(leftValue);
		
		
		
		
		

	}

}
