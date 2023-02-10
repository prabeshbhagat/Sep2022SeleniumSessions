package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		
		List<WebElement> imgList=driver.findElements(By.tagName("img"));
		System.out.println("Total images count:"+imgList.size());
		
		for(WebElement e: imgList) {
			String srcValue=e.getAttribute("src");
			String altValue=e.getAttribute("alt");
			String heightValue=e.getAttribute("height");
			
			System.out.println(srcValue+"||"+heightValue+"||"+altValue);
		}

	}

}
