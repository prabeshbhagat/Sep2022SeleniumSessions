package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BrowserUtil4 brutil=new BrowserUtil4();
		WebDriver driver=brutil.launchBrowser("chrome");
		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title=brutil.getPageTitle();
		if(title.equals("Register Account")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		//Elements
		By fName=By.id("input-firstname");
		By lName=By.id("input-lastname");
		By email=By.id("input-email");
		By tel=By.id("input-telephone");
		By pwd=By.id("input-password");
		By cPwd=By.id("input-confirm");
		
		ElementUtil5 eutils=new ElementUtil5(driver);
		eutils.doSendkeys(fName, "RegFName");
		eutils.doSendkeys(lName, "RegLName");
		eutils.doSendkeys(email, "RegEmail@test.com");
		eutils.doSendkeys(tel, "898989898");
		eutils.doSendkeys(pwd, "67890");
		eutils.doSendkeys(cPwd, "67890");
		
		Thread.sleep(2000);
		
		brutil.closeBrowser();
		
		
		
		
	}

}
