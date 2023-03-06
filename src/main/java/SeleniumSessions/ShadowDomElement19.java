package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement19 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		//in interview ask that there app is made of full of shadow domm if yes dont join company
		//if shadow dom is close ask dev team to open saying no way to automate close ones
		//to come out of shadow don use driver.switch.to defaultcontent
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//for shadow dom xpath will not work we have to work with css selector
		//Browser
			//page-elements
				//iframe
					//shadow DOM
		
		//#shadow-root open we can automate 
		//#shadow root close cannot be automated
		//shadow dom is used for more security 
		
		//for shadow dom
		//go to the element above shadow dom (root)(above #shadow-root(open)
		//right click on copy JSselector
		//open console and paste the copied one than .shadowRoot.querySelector("#pizza")--id value (pizza)
		//example document.querySelector("#userName").shadowRoot.querySelector("#pizza")
		//
		//click on console the particluar  element below shadow dom wil appear
		//document.querySelector("#userName").shadowRoot.querySelector("#app2")
		
		//document.querySelector("#userName").shadowRoot.querySelector('#kils')

		//convert the driver to jsexecutor to implement the above js code
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement tea=(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector('#kils')");
		//conveting the above js to webelement 
		//once its converted by type casting we can use sendkeys
		tea.sendKeys("Hello");
	}

}
