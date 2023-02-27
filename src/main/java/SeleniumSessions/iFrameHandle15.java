package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameHandle15 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		WebElement img=driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']"));
		
		img.click();
		
		driver.switchTo().frame("frame-one748593425");
		
		WebElement vin=driver.findElement(By.id("RESULT_TextField-7"));
		
		vin.sendKeys("Test-1234");
		
		WebElement state =driver.findElement(By.id("RESULT_RadioButton-12"));
		Select select =new Select(state);
		select.selectByValue("Radio-37");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("Log in")).click();
		
	}

}
