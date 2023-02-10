package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
	}

}
