package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil5 {

	private WebDriver driver;

	public ElementUtil5(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetAttributeValue(By locator, String attrKey) {
		return getElement(locator).getAttribute(attrKey);
	}

	public void doClickOnElement(By locator, String linkText) {

		List<WebElement> linksList = driver.findElements(locator);

		for (WebElement e : linksList) {
			String text = e.getText();
			System.out.println("The lang link text is :" + text);
			if (text.contains(linkText)) {
				e.click();
				break;
			}

		}

	}

	public boolean doISDisplayedMethod(By locator) {
		return getElement(locator).isDisplayed();
	}

	// find an element without using is displayed
	public boolean isSingleElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("Actual count of element is++" + actCount);
		if (actCount == 1) {
			return true;
		}
		return false;
	}

	public boolean isTwoElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("Actual count of element is++" + actCount);
		if (actCount == 2) {
			return true;
		}
		return false;
	}

	// mutliple element not aware of actElement count
	public boolean isMultipleElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("Actual count of element is++" + actCount);
		if (actCount > 1) {
			return true;
		}
		return false;
	}

	//// mutliple element aware of actElement count ,pass the count
	public boolean isMultipleElementExist(By locator, int actElementCount) {
		int actCount = getElements(locator).size();
		System.out.println("Actual count of element is++" + actCount);
		if (actCount == actElementCount) {
			return true;
		}
		return false;
	}

	public int totalElementsCount(By locator) {
		return getElements(locator).size();
	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		System.out.println("======" + eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}

		return eleTextList;

	}

	/**
	 * Drop Down Utils Select Based drop downs
	 *
	 */
	// *************************************

	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectByVisibleText(By locator, String name) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(name);
	}

	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doSelectDropDownValue(By locator, String value) {
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

	public void doSelectDropDownValueWithoutUsingSelect(By dropLoc, String Val) {

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
	// *************************************
	// ****************Google Search**********************//

	public void googleSearchAndClick(By searchLocator, String searchValue, By listLocator, String clickValue)
			throws InterruptedException {
		getElement(searchLocator).sendKeys(searchValue);
		Thread.sleep(3000);
		List<WebElement> suggList = getElements(listLocator);
		for (WebElement e : suggList) {
			System.out.println(e.getText());
			if (e.getText().contains(clickValue)) {
				e.click();
				break;
			}
		}

	}
	
	//*******************************Actions Class*************************************

	public void selectSubMenu(String htmlTag, String parentMenu, String childMenu) throws InterruptedException {

		By parentMenuLocator = By.xpath("//" + htmlTag + "[text()='" + parentMenu + "']");
		By childMenuLocator = By.xpath("//" + htmlTag + "[text()='" + childMenu + "']");

		WebElement parent = getElement(parentMenuLocator);

		Actions action = new Actions(driver);

		action.moveToElement(parent).build().perform();

		Thread.sleep(3000);

		doClick(childMenuLocator);

	}
	
	
	public  void doActionsSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public  void doActionsClick(By locator) {
		Actions act = new Actions(driver); 
		act.click(getElement(locator)).build().perform();
	}
	
	//*********************Waits utils*********************
	
	public  WebElement waitForElementPresence(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
