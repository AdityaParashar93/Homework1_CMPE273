import static org.junit.Assert.*;

import org.junit.Test;


public class Fulltime_EmployeesTest {

	Fulltime_Employees f=new Fulltime_Employees();
	
	@Test
	public void testForTestPurpose() 
	{
		int expected=1;
		f.name="Test_Object";
		f.hrs=40;
		double test_pay=f.calculate_pay();
		assertEquals(expected,Fulltime_Employees.forTestPurpose(test_pay));
	}
}
