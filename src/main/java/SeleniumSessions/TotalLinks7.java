package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks7 {

	public static void main(String[] args) {

		// 1.Total Links
		// 2.print the text of the link
		// 3.print the link with text or avoid the links without text

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());

		for (int i = 0; i < linksList.size(); i++) {
			String text = linksList.get(i).getText();

//			if(!text.equals("")) {
//				System.out.println(i+"="+text);
//			}
//		
			// 2nd way
//			if(!(text.length()==0)) {
//				System.out.println(i+"="+text);
//			}

//			if(text.equals(null)) {
//				System.out.println(i+"="+text);
//			}
		}

		// using foreach loop
		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			String hrfVal=e.getAttribute("href");
			System.out.println("Href value is>>> :"+hrfVal);
			if (!text.isEmpty()) {
				System.out.println(count + "=" + text);
			}
			count++;
		}
	}

}
