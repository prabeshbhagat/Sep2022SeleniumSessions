package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountEnabledTest27 {
	
	//same test will be executed 10 times 
	//invocationCount=0 means the test will not run 
	//its recommended not to use it as some other SDET might 
	//--change the invocation count to 2 from 0
	//enabled is boolean variable
	
	
	
	
	@Test(invocationCount=10)
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	@Test(invocationCount=0)
	public void dtest() {
		System.out.println("a test");
	}
	
	@Test(enabled=false)
	public void atest() {
		System.out.println("a test");
	}
	
	@Test(enabled=true,description="bTest Desc")
	public void btest() {
		System.out.println("b test");
	}
	
	@Test()
	public void ctest() {
		System.out.println("c test");
	}

}
