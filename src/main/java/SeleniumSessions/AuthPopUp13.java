package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp13 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabesh.bhagat\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		boolean flag = authPopup("admin", "admin", "the-internet.herokuapp.com/basic_auth");
		if (flag) {
			System.out.println("Logged in Successfully");
		} else {
			System.out.println("Auth failed");
		}
	}

	public static boolean authPopup(String un, String pwd, String url) {
		driver.get("https://" + un + ":" + pwd + "@" + url);
		WebElement ele = driver.findElement(By.xpath("//div[@id='content']//p"));
		String text = ele.getText();
		if (text.contains("Congratulations! You must have the proper credentials")) {
			return true;
		}
		return false;
	}

}
