package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept27 {
	
	//for the below method there will be  failure &  skip
	//for parrallel execution there will be problem 
	//mutiple thread are there if the dependent test case is not complete others wont execute
	
	
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		int a=9/3;
	}
	
	@Test(dependsOnMethods="searchTest")
	public void addToCartTest() {
		System.out.println("addToCartTest");
		int a=9/0;
	}
	
	@Test(dependsOnMethods="addToCartTest")
	public void paymentTest() {
		System.out.println("paymentTest");
	}

}
