package SeleniumSessions;

import org.openqa.selenium.By;

public class ClassNameConcept19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		By.xpath("//input[@class='form-control private-form__control login-email']");// valid
		By.className("form-control private-form__control login-email");
		// Find elements based on the value of the "class" attribute. Only one class
		// name should beused. If an element has multiple classes, please use
		// By.cssSelector(String).
		By.className("login-email");
		By.cssSelector(".form-control.private-form__control.login-email");// we can use multiple only with CSS selector
	}

}
