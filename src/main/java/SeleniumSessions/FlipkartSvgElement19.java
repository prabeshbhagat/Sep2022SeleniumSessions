package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSvgElement19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("macbook pro");
		String  xpath="//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']";
		
		Thread.sleep(3000);
		
		
		Actions act= new Actions(driver);
		act.click(driver.findElement(By.xpath(xpath))).build().perform();
		System.out.println("------");
		//driver.findElement(By.xpath(xpath)).click();
		
		
	}

}
