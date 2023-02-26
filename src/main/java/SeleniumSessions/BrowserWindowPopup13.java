package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopup13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(5000);
		//Window handler api
		
		WebElement fbPage=driver.findElement(By.xpath("//img[contains(@src,'facebook')]"));
		//fbPage.click();
		
//		Actions act=new Actions(driver);
//		act.moveToElement(fbPage).click().build().perform();
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", fbPage);
		
		//child window opens
		//switch driver to child window
		
		//1st capture the window id
		Set<String> handles= driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parentWindowId is "+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("childWindowId is "+childWindowId);
		
		//2.Switch work
		driver.switchTo().window(childWindowId);
		String childUrl=driver.getCurrentUrl();
		System.out.println("The child window URl is"+childUrl);
		
		//close the child window 
		driver.close();
		
		//switch back to parent window 
		driver.switchTo().window(parentWindowId);
		String parentUrl=driver.getCurrentUrl();
		System.out.println("The parent window Url is"+parentUrl);
		driver.close();
		
		
	}

}
