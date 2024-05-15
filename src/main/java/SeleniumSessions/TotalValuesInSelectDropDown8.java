package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalValuesInSelectDropDown8 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(2000);
		By country = By.id("Form_getForm_Country");
		// doSelectDropDownValue(country, "Canada");
		By dropDownLoc = By.xpath("//select[@id='Form_getForm_Country']/option");
		doSelectDropDownValueWithoutUsingSelect(dropDownLoc, "India");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));

		List<WebElement> dropdownOptions = select.getOptions();

		for (WebElement e : dropdownOptions) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

	public static void doSelectDropDownValueWithoutUsingSelect(By dropLoc, String Val) {

		List<WebElement> dropdownValues = driver.findElements(dropLoc);
		System.out.println(dropdownValues.size());
		int count = 1;
		for (WebElement e : dropdownValues) {
			System.out.println(count + ": " + e.getText());
			count++;
			if (e.getText().equals(Val)) {
				e.click();
				break;
			}
		}

	}

}
