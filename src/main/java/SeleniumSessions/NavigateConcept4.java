package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcept4 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https:www.google.com");
		driver.navigate().to(new URL("https:www.amazon.com"));
		String title = driver.getTitle();
		System.out.println("The title of the page is :" + title);

		// validataion or testing or check point or actual vs expected
		if (title.contains("LinkedIn")) {
			
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

	}

}
