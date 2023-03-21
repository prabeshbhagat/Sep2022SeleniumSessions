package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavScriptTest24 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);

		JavaScriptUtil24 jsUtil = new JavaScriptUtil24(driver);

//		System.out.println(jsUtil.getTitleByJS());
//		
//		String innerText=jsUtil.getPageInnerText();
//		if(innerText.contains("creating ")) {
//			System.out.println(innerText);
//			System.out.println("Pass");
//		}

		// jsUtil.refreshBrowserByJS();
		// jsUtil.generateAlert("Hi This is an alert");
		// "alert("+Hi This is an alert+")"

		// draw Border
//		WebElement pwdBox=driver.findElement(By.id("input-password"));
//		WebElement rightPaneel=driver.findElement(By.id("column-right"));
//		
//		jsUtil.drawBorder(rightPaneel);
//		jsUtil.drawBorder(pwdBox);
//		jsUtil.flash(rightPaneel);
//		jsUtil.flash(pwdBox);
//		
//		driver.navigate().to("https://www.amazon.com/");
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDown("2000");

		WebElement ele = driver.findElement(By.xpath("//h2[text()='Shop Laptops & Tablets']"));
		jsUtil.scrollIntoView(ele);

	}

}
