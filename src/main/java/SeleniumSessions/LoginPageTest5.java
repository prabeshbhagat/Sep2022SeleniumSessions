package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//7th approach
public class LoginPageTest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil4 brUtil=new BrowserUtil4();
		WebDriver driver=brUtil.launchBrowser("chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageTitle());
		
		By emailID=By.id("input-email");
		By psswd=By.id("input-password");
		
		ElementUtil5 eUtil=new ElementUtil5(driver);
		eUtil.doSendkeys(emailID, "test99@gmail.com");
		eUtil.doSendkeys(psswd, "passowrd");
		
		
		Thread.sleep(2000);
		brUtil.quitBrowser();
	}

}
