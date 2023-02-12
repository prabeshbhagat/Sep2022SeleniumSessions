package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//1. test case will run in alphabetical order

public class PriorityTest27 {
	//we can avoid giving priority in test cases
	//as user will not use the application based on priority he will use randomly
	//1.priority=1to5
	//2.priority=-1
	//3/priority=0
	//4.priority is int
	//The scheduling priority. Lower priorities will be scheduled first.
	//5.priority is same for all tests it will than be based on alphabetic order
	//6.Tests with Priority & without Priority 
	//1st non priority based will execute in alphabetic order than priority tests
	//
	
	
	@Test(priority=2)
	public void aTest() {
		System.out.println("aTest");
	}
	
	@Test(priority=1)
	public void bTest() {
		System.out.println("bTest");
	}
	@Test(priority=5)
	public void cTest() {
		System.out.println("cTest");
	}
	@Test(priority=-1)
	public void dTest() {
		System.out.println("dTest");
	}
	@Test(priority=0)
	public void eTest() {
		System.out.println("eTest");
	}

}
