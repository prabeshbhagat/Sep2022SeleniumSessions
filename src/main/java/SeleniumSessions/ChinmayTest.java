package SeleniumSessions;

import org.openqa.selenium.By;

public class ChinmayTest {
	
	private static String emp_id;

	private static String emp_fst_lnk=emp_id;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChinmayTest c1= new ChinmayTest();
		c1.m1("12345");
		String emp_fst_lnk=emp_id;
		System.out.println(emp_fst_lnk);
		System.out.println("emp_id"+emp_id);
		

	}
	
	public void m1(String Employee_Id) {
		emp_id=Employee_Id;
		//System.out.println(emp_id+"test");
		//System.out.println(emp_fst_lnk);
	}

}
