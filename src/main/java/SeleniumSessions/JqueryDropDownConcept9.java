package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept9 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		// 1.Single Selection
		// selectChoice(choices, "choice 2 1");

		// 2.Multi Selection
		selectChoice(choices, "choice 9", "choice 2 1", "choice 2 3", "choice 6 2 1");

		// 3. Select All/all selection
		// selectChoice(choices, "all");

		// 4 Wrong choice/No Choice
		// selectChoice(choices, "choice 9");
	}
	// don't make the method more complex by passing wrong choice in multi selection

	/**
	 * switch(selection) case: multiple 
	 *  case: single
	 *	case: multiple
	 *	case: all default:
	 */
//	public void switchSelectChoice(By Locator,String choice) {
//		String 
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
//
//	}

	/**
	 * this method is handling single,multiple and all choices selection, this
	 * method is also handling the Single choice if it not available Please pass the
	 * choices which are present, in case of multiple selection Please pass all in
	 * case of all selection
	 * 
	 * @param Locator
	 * @param choice
	 */

	public static void selectChoice(By Locator, String... choice) {
		List<WebElement> choiceList = driver.findElements(Locator);
		boolean flag = false;

		if (!choice[0].equalsIgnoreCase("all")) {
			for (WebElement e : choiceList) {
				String text = e.getText();
				// System.out.println(e.getText());
				for (int i = 0; i < choice.length; i++) {
					if (text.equals(choice[i])) {
						flag = true;
						System.out.println(e.getText());
						e.click();
						break;
					} 
//					else {
//						System.out.println("The choice is not available " + choice[i]);
//						
//					}
				}

			}

		} else {
			// all selection logic
			try {// to avoid element not intractable exception
				for (WebElement e : choiceList) {
					flag = true;
					e.click();
				}
			} catch (Exception e) {

			}

		}

		if (flag == false) {
			System.out.println("The choice is not present" + choice[0]);
		}

	}

}
