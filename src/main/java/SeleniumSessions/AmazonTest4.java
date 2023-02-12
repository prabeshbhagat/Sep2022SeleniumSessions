package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest4 {

	public static void main(String[] args) {
		
		String browserName="Chrome";
		
		BrowserUtil4 brUtil=new BrowserUtil4();
		WebDriver driver=brUtil.launchBrowser(browserName);
		//driver.get("https://www.amazon.com");
		//brUtil.launchUrl("https://www.amazon.com");
		//brUtil.launchUrl(null);
		//Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument
		//brUtil.launchUrl("");
		brUtil.launchUrl("https://www.amazon.com");
		String actTitle=brUtil.getPageTitle();
		System.out.println(actTitle);
		
		if(actTitle.contains("Amazon")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Incorrect Title");
		}
	}

}
