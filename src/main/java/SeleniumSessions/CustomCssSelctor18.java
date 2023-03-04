package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelctor18 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/products/crm&hubs_signup-cta=homepage-nav-login&hubs_content=www.hubspot.com/products/crm&hubs_content-cta=homepage-nav-login");

		// Css Selector is not an attribute
		//its a locator in by class
		
		
		//case 1:id
		//htmltag#idvalue
		//#idvalue
		// #input-email
		// input#input-email
		
		//case 2:class
		//htmltag.classvalue
		// .classvalue
		// input.form-control
		// .form-control
		
		//case 3:combination of css selector and id
		//htmltag.classvalue#idvalue
		//htmltag#idvalue.classvalue
		// input.form-control#input-email
		// .form-control
		// input#input-email.form-control#input-email
		
		//for multiple class names
		// .c1.c2
		// input.btn.btn-primary		
		// input.form-control.input-lg
		
		// .form-control.private-form__control.login-email
		// input.login-email
		
		
		//case4 ;for other attribute apart from id class name 
		//input[type='email']--css
		//input[@type='email']--xpath
		
		
		//case5:for multiple attribute
		//input[type='email'][id='username']
		//input[name='email'][type='text']--css 
		//input[name='email' and type='text']--xpath
		
		//case6:Contains *
		//htmltag [attr*='value']
		// [id*='email']
		// input[id*='email']--Contains
		// input[id^='input']--starts with
		// input[id$='email']--ends with
		
		// input[placeholder^='E-Mail'][id*='email'][class$=control]--combination of start with ends with and contains\
		
		//text? -no support in CSS;
		
		//parernt to child 
		//ornage hrm
		// //select[@id='Form_getForm_Country']/option--xpath
		// select#Form_getForm_Country > option--css for direct child
		// select#Form_getForm_Country  option-- css selector for direct and indirect child (use space instead >)
		
		//parent to child direct and indirect
		// form#hs-login > div--direct div or direct child 
		// form#hs-login  div--direct dic + indirect div count will be more
		
		//child to parent --backward traversing is not supported in css 
		
		//sibling in css
		//preceding-sibling is not supported in css
		// .form-group > label + input following sibling (use + sign)
		//for sibling concept always go for xpath
		
		//case 7:use of comma in css
		// input#username,input#password,button#loginBtn
		//hub spot
		//example below
		By impElemnts=By.cssSelector("input#username,input#password,button#loginBtn");
		int size=driver.findElements(impElemnts).size();
		if(size==3) {
			System.out.println("Imp elements are available");
		}else {
			System.out.println("Imp elements are not available");
		}
		
		
		//indexing in CSS 
		//div.row ul.footer-nav >li:nth-of-type(5)
		
		//xPath vs CSS
		
		//text():xpath
		//Syntax: css is better than xpath
		//contains/starts-with/endswith :both
		//conatins +text+attr--xpath
		//starts with +text = attr--xptah is the winner
		//backward tarversing- xpath
		//sibling-xpath- as prescdeing sibling is not available
		//dynamic elements firstname_123,firstname_456 with contains or anything :both
		//comma -css
		//indexing :xpath
		//performance wise :both are fine (xpath has a engine)
		//whenever a page url is passed the dom is loaded 1st than the page will be loaded
		
		//canvas html 5 ,graphs cannot be automated
		
		
		//normalize space()
		
	}

}
