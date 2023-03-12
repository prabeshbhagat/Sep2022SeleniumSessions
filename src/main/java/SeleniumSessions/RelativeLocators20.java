package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.linkText("Wujiaqu, China"));
		
		//right of ele
		String rightIndex=driver.findElement(with(By.className("countryName_list")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		//left of ele
		String leftRank=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		//below ele
		String belowCity=driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		
		//above ele
		String aboveCity=driver.findElement(with(By.tagName("a")).above(ele)).getText();
		System.out.println(aboveCity);
		
		
		//near ele within 100 px
		String nearEle=driver.findElement(with(By.linkText("Madaba, Jordan")).near(ele)).getText();
		System.out.println(nearEle);
		
		//
		
	}

}
