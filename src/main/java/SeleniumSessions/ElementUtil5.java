package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
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

	// *******************************Actions
	// Class*************************************

	public void selectSubMenu(String htmlTag, String parentMenu, String childMenu) throws InterruptedException {

		By parentMenuLocator = By.xpath("//" + htmlTag + "[text()='" + parentMenu + "']");
		By childMenuLocator = By.xpath("//" + htmlTag + "[text()='" + childMenu + "']");

		WebElement parent = getElement(parentMenuLocator);

		Actions action = new Actions(driver);

		action.moveToElement(parent).build().perform();

		Thread.sleep(3000);

		doClick(childMenuLocator);

	}

	public void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}

	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

	// *********************Waits utils*********************

	public String waitForTitleContains(String titleFractionValue, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		if (wait.until(ExpectedConditions.titleContains("Register"))) {
			return driver.getTitle();
		} else {
			System.out.println("Expected title is not visble...");
			return null;
		}
	}

	// An expectation for checking the title of a page.
	public String waitForTitleIs(String titleVal, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		if (wait.until(ExpectedConditions.titleIs(titleVal))) {
			return driver.getTitle();
		} else {
			System.out.println("Expected title is not visble...");
			return null;
		}
	}

	public String waitForURLContains(String urlFractionValue, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		if (wait.until(ExpectedConditions.urlContains(urlFractionValue))) {
			return driver.getCurrentUrl();
		} else {
			System.out.println("Expected URL is not visble...");
			return null;
		}
	}

	public String waitForURLIS(String urlValue, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
			return driver.getCurrentUrl();
		} else {
			System.out.println("Expected URL is not visble...");
			return null;
		}
	}

	// FW
	public Alert waitForAlertIsPresentAndSwitchWithFluentWait(int timeOut, int intervalTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime)).ignoring(NoAlertPresentException.class)
				.withMessage("Alert Not present on the page...");

		return wait.until(ExpectedConditions.alertIsPresent());

	}

	// WW
	public Alert waitForAlertIsPresentAndSwitch(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public String getAlertText(int timeOut) {
		return waitForAlertIsPresentAndSwitch(timeOut).getText();
	}

	public void acceptAlert(int timeOut) {
		waitForAlertIsPresentAndSwitch(timeOut).accept();
	}

	public void dismissAlert(int timeOut) {
		waitForAlertIsPresentAndSwitch(timeOut).dismiss();
	}

	public void alertSendkeys(int timeOut, String value) {
		waitForAlertIsPresentAndSwitch(timeOut).sendKeys(value);
		;
	}

	public void waitForFramePresentAndSwitch(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public void waitForFramePresentAndSwitch(By frameLocator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public void waitForFramePresentAndSwitch(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}

	public void waitForFramePresentAndSwitch(String nameOrId, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that isgreater than 0.
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that all elements present on the web page that
	 * match the locatorare visible. Visibility means that the elements are not only
	 * displayed but also have a heightand width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut default interval time 500 millisecs
	 * @return
	 */
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	/**
	 * An expectation for checking that all elements present on the web page that
	 * match the locator are visible. Visibility means that the elements are not
	 * only displayed but also have a heightand width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @param interval time
	 * @return
	 */
	public List<WebElement> waitForElementsVisible(By locator, int timeOut, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	/**
	 * An expectation for checking that there is at least one element present on a
	 * web page.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	/**
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 * 
	 * @param locator
	 * @param timeOut
	 */
	public void clickElementWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		;
	}

	/**
	 * 
	 * @param locator
	 * @param timeOut
	 * @param intervaltime
	 * @return
	 */
	public WebElement waitForElementTobeVisibleWithFluentWait(By locator, int timeOut, int intervaltime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervaltime)).ignoring(ElementNotInteractableException.class)
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.withMessage("Element Not found on the page...");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	/**
	 * 
	 * @param locator
	 * @param timeOut
	 * @param intervaltime
	 * @return the above waitForElementTobeVisibleWithFluentWait method and this
	 *         method both are same but implementation is different
	 */

	public WebElement waitForElementTobeVisibleWithoutFluentWait(By locator, int timeOut, int intervaltime) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(intervaltime));
		wait.ignoring(ElementNotInteractableException.class).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class).withMessage("Element Not found on the page...");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	// ******************Custom Wait*******************///

	public WebElement retryingElement(By locator, int timeOut) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("Element is found in attempt " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt :" + attempts + " for " + locator);
				TiemUtil23.applyWait(500);
			}

			attempts++;
		}
		if (element == null) {

			System.out.println(
					"element not found tried for: " + timeOut + " Secs " + " tried with the interval of 0.5 sec");
			throw new FrameworkExeption4("TimeOutException");
		}
		return element;
	}

	public WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("Element is found in attempt " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt :" + attempts + " for " + locator);
				TiemUtil23.applyWait(intervalTime);
				// instead of Thread.sleep we use Time util as it look ugly here
			}

			attempts++;
		}
		if (element == null) {

			System.out.println("element not found tried for: " + timeOut + " Secs " + " tried with the interval of "
					+ intervalTime + " sec");
			throw new FrameworkExeption4("TimeOutException");
		}
		return element;
	}

	// waitForPageLoad using JS
	public void waitForPageLoad(int timeOut) {

		long endTime = System.currentTimeMillis() + timeOut;

		while (System.currentTimeMillis() < endTime) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String pageState = js.executeScript("return document.readyState").toString();
			System.out.println(pageState);
			if (pageState.equals("complete")) {
				System.out.println("Page Dom is fully loaded ...");
				break;
			}
		}

	}
}
