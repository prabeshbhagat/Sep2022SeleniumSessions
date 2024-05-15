package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertHandling12 {
	
	public static void main(String[] args) {
		//alert('Hi');
		//prompt('Hello')
		//confirm('afafda')
		//no webelement is available for alert
		//cannot inspect alert confirm & prompt
		////js pop we will get one send keys field
		//multiple pop up will not appear
		//when one pop up comes it will freeze the background
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pb610335\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alt=driver.switchTo().alert();//active modal 		
		String text=alt.getText();
		System.out.println(text);
		//alt.accept();
		alt.dismiss();//euqivalent to escape key 
	}

}
