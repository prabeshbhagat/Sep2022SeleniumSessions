package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptions27 {
	String name;
	
	//1.single exception
	//2.Multiple Exception
	//3exception ,description & priority 
	
	@Test(expectedExceptions=ArithmeticException.class,priority=2)
	public void calTest() {
		System.out.println("calTest");
		int a=9/0;
	}
	
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class},priority=1,description="Multiple exception test")
	public void cal1Test() {
		System.out.println("calTest");
		int a=9/0;//ArithmeticException
		ExpectedExceptions27 obj=null;
		obj.name="Tom";//NullPointerException
	}

}
