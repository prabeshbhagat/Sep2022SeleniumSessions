package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest26One {
	
	
	//Assertion is very imp in TestNG
	//1.Global pre condition -->Before Suite,Before method,Before class
	  //Server is up & Running 
	  // QA environment is up & running
	
	//2. Pre condition -->Before
	  // Create user
	  // browser is up & running 
	  //login is fine
	
	//3.test steps test cases-->test 
	
	//4. validations act vs exp--> assertions --Assert
	
	//5.post step-->After Suite,After Method ,After class
	
	
	/*
	 * Order of execution in TestNG
	BS--- connectWithDB
	BT--- createUser
	BC--- launchBrowser
	
	 	BM--- Login to app
	 	cartTest
	 	AM --logout
	 
	 	BM--- Login to app
	 	homePageTest
	 	AM --logout
	 
	 	BM--- Login to app
	 	SearchPageTest
	 	AM --logout
	 
	AC --closeBrowser
	AT --deleteUser
	AS --disconnetWithDb
	 * 
	 */
	

	
	
	//Annotations-Its a keyword starts with @ followed by a method
	
	// We are getting libraries from TestNG
	//to run a class we need TestNg plugin
	
	//1st Pref:
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS--- connectWithDB");
	}
	
	//2nd Pref: 
	@BeforeTest
	public void createUser() {
		System.out.println("BT--- createUser");
	}
	
	//3rd Pref:
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--- launchBrowser");
	}
	
	//4th,7th,10th pref: it will be executed before each & every test method
	@BeforeMethod
	public void login() {
		System.out.println("BM--- Login to app");
	}
	
	//8th Pref
	//--25
	//@test is pointing to the test cases
	@Test
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	
	//11th
	@Test
	public void searchTest() {
		System.out.println("SearchPageTest");
	}
	
	//5th Pref
	@Test
	public void cartTest() {
		System.out.println("cartTest");
	}
	
	//6th,9th,12th pref it will be executed After each & every test method
	@AfterMethod
	public void logout() {
		System.out.println("AM --logout");
	}
	
	//13th pref : 
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC --closeBrowser");
	}
	//14th
	@AfterTest
	public void deleteUser() {
		System.out.println("AT --deleteUser");
	}
	//15th Pref
	@AfterSuite
	public void disconnetWithDb() {
		System.out.println("AS --disconnetWithDb");
	}
	
	
	
	
	
	

}
