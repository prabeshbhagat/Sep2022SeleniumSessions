package SeleniumSessions;

public class CustomXpath16 {

	public static void main(String[] args) {
		
		//1.Absolute xpath
		///html/body/header/div/div/div[2]/div/input
		
		//2.Custom/Relative xpath
		//Case 1;htmltag[@atrr='value']
		//input[@name='search']
		
		//Case 2;//htmltag[@atrr1='value1' and @atrr2='value2']
		//input[@type='text' and @name='search']
		//input[@type='text' and @name='search' and @placeholder='Search']
		
		//input[@type='text' or @name='search']
		
		//case3:
		//text();
		//htmltag[text()='value']
		//h2[text()='New Customer']
		//a[text()='Returns']
		
		
		//case3:
		//text() and attribute ;
		//htmltag[text()='value' and @attr1='value']
		////a[text()='Register' and @class='list-group-item']
		
		//case 4:
		//contains
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'email')]
		
		//case 5:
		//contains use case 1:
		//<div id='firstname_123'>
		//<div id='firstname_456'>
		//<div id='firstname_789'>
		//div[contains(@id,'firstname_')]
		
		//contains with text();
		//htmltag[contains(text(),'value')]-
		//h2[contains(text(),'return')]--1 value FE
		//a[contains(text(),'Amazon')]--20 values FEs
		
		
		//contains with text()/with attr and contains with one attr
		//a[contains(text(),'Amazon') and @class='nav_a']
		//a[contains(text(),'Amazon') and @class='nav_a' and type='text']
		
		//input[contains(@placeholder,'Mail') and contains(@id,'email')]
		
		
		//Case 5 starts-with() function
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@id,'input')]
		//input[starts-with(@id,'input') and contains(@id,'email')]
		//input[starts-with(@id,'input') and starts-with(@name,'input']
		
		//case 6:ends-with() is deprecated
		
		//case 7:indexing:
		//have a capture group 
		//its a collection with value=total number of elements
		//below size is 6 naveen site
		//  (//input[@class='form-control'])[3]
		
		//case 8:position()
		// (//input[@class='form-control'])[position()=3]
		
		//case 9:last()
		//  (//input[@class='form-control'])[last()]
		//  (//input[@class='form-control'])[last()-1]
		//  (//input[@class='form-control'])[last()-2]
		
		//use case of last()
		//	one forward/ slash direct associtation
		//	two forward// slash indirect assocaitaion
		
		//div[contains(@class,'navFooterLinkCol')]
		//use case of last function 
//    ((//div[contains(@class,'navFooterLinkCol')])[4]//a)[last()]
		//requirement amazon div get to know us 
		//use case find the last element help is visible or not
		//position of help
		//even i the position changes help xpath will not change
//		/((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		
//		(//table[@class='navFooterMoreOnAmazon']//tr//td[@class='navFooterDescItem']/a)[last()-1]		
		//amazon footer link
		
		//htmltag[@id='value']
		//*[@id='value']--will give all the elements
		//input[@id='value']
		
		
	

	
	}

}
