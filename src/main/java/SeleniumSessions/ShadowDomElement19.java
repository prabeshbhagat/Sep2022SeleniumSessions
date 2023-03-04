package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement19 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//#shadow-root open we can automate 
		//#shadow root close cannot be automated
		//shadow dom is used for more security 
		
		//for shadow dome
		//go to the element
		//right click on copy JSselector
		//open console and paste the copied one than .shadowRoot.querySelector("#pizza")--id value (pizza)
		//example document.querySelector("#userName").shadowRoot.querySelector("#app2").shadowRoot.querySelector("#pizza")
		//
		//click on console the particluar  element below shadow dom wil appear
		
		
		//document.querySelector("#userName").shadowRoot.querySelector("#app2").shadowRoot.querySelector("#pizza")

		//convert the driver to jsexecutor to implement the above js code
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement tea=(WebElement)js.executeScript("retrun document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		//conveting the above js to webelement 
		//once its converted by type casting we can use sendkeys
		tea.sendKeys("Piazaa");
	}

}
