package SeleniumSessions;

public class xPathAxes17 {

	public static void main(String[] args) {

		// case 1:parent to child
		// div[@class='private-form__input-wrapper']/input[@id='username']
		// div[@class='private-form__input-wrapper']/child::input[@id='username']

		// form[@id='hs-login']//input

		// input[@id='username']

		// case 2:Child to parent traversing
		// //input[@id='username']/../../../../../../../../../..
//descendant
		// how to move to immediate parent
		// input[@id='username']/parent::div
		// input[@id='username']/..
		
		//how to move from child to grand parent
		//use ancestor
		//((//span[contains(text(),'Shakib Al Hasan')]/ancestor::td)[position()=2]/following-sibling::td)[1]

		// case3:how to move from one sibling to another sibling

		// use keyword-preceding-sibling
		// input[@id='input-email']/preceding-sibling::label

		// use keyword-folowing-sibling
		// label[text()='E-Mail Address']/following-sibling::input
		// label[text()='E-Mail Address']/following-sibling::input[@id='input-email']

		// amazon footer expamle use case:
		// div[text()='Get to Know Us']/following-sibling::ul//a
		// div[text()='Make Money with Us']/following-sibling::ul//a
		
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
	}

	public static String getxpath(String name) {
		String xpath = "//div[text()='" + name + "']/following-sibling::ul//a";
		return xpath;
	}

}
