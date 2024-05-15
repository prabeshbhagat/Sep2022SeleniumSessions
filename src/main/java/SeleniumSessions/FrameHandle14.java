package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameHandle14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//frame is a Webelement
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		// 1.frame by Index
		// driver.switchTo().frame(2);//By Index
		
		// 2.Frame by Name or id
		// driver.switchTo().frame("main");
		
		// 3.Select a frame using its previously located WebElement.
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[contains(@src,'top')]")));

		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		

	}

}
