package testngsessions;

public class AAATestAssert {
	
	///AAA rule  in Unit testing
	//Arrange your test cases according to feature wise
	//Arange:test case should be arranged in such a way that it should not create any dependecy.All the test cases should be independent
	//in parallel mode it will be difficult to identify the failed tc's because of dependency

	// test cases should be independent in unit Tests
	//its should not maintain any order,can be executed in any order
	/**
	 * Good unit tests should be reproducible and independent from external 
	 * factors such as the environment or running order. Fast. 
	 * Developers write unit tests so they can repeatedly run them 
	 * and check that no bugs have been introduced.
	 */
	
	//Arrange,Act,Assert AAA
	//CRUD
	//Create: Create a new user, assert T1
	//Retrive: Create a new user,get the same user ,assert T2
	//Update: Create a new user,get the same user,update the same user ,assert T3
	//Delete: Create a new user,get the same user,Delete the same user ,assert T2
	
	//in case of dependent test case we might get deadlock
	
	//How many assertion per unit test cases.
	//one assertion 
	//One Assertion should be there in One Test case
	//if assert fails line below that wont be executed
	
	
	
	//Diff between Assert & Verify
	//Assert is coming from testng
	//diff bet hard assertion & soft assertion
	//soft assertion is verify
	//hard assertion is assert
	
	
	
	
	
}
