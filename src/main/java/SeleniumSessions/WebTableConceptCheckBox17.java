package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConceptCheckBox17 {
	
	//even if the name position changes the xpath should be so generic that its should handle
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='Kevin.Mathews']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		selectUserCheckbox("Kevin.Mathews");
		selectUserCheckbox("Joe.Root");
	}
	
	public static void selectUserCheckbox(String user) {
		driver.findElement(By.xpath("//a[text()='"+user+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
