package Prabesh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Map<String, String> productMap=new HashMap<String, String>();
		//Map<String, String> productMap=new TreeMap<String, String>();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("data12390@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Automation");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("macbook");
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		int count=driver.findElements(By.xpath("//div[contains(@class,'product-layout')]")).size();
		System.out.println(count);
		driver.findElement(By.linkText("MacBook Air")).click();
		String productHeader=driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
		System.out.println(productHeader);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@id='content']//ul[@class='list-unstyled'][position()=1]//li"));
		for(WebElement e:ele) {
			//System.out.println("=="+e.getText());
			String [] arr=e.getText().split(":");
			String key=arr[0].trim();
			String value=arr[1].trim();          
			//System.out.println("key**"+key);
			//System.out.println("value=="+value);
			productMap.put(key, value);
		}
		System.out.println(productMap);
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String cartTxt=driver.findElement(By.xpath("//span[@id='cart-total']")).getText();
		System.out.println(cartTxt);
		driver.findElement(By.linkText("shopping cart")).click();
      
	}

}
