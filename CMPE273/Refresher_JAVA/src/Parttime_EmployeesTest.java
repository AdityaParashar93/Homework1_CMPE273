import static org.junit.Assert.*;

import org.junit.Test;


public class Parttime_EmployeesTest {

	Parttime_Employees p=new Parttime_Employees();
	@Test
	public void testForTestPurpose() 
	{
				p.name="Test_Object";
				p.hrs=20;
				double t=p.calculate_pay();
				assertEquals(1, Parttime_Employees.forTestPurpose(t));
	}

}
