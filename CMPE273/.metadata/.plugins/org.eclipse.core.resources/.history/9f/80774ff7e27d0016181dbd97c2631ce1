import java.io.*;
public class Parttime_Employees implements Employees 
{
	String name;
	int hrs,pay;
	
	public Parttime_Employees() 
	{
		pay=35;
	}
	
	public double calculate_pay() 
	{
		System.out.println("Salary of the for this week is\t"+((hrs*pay)+(hrs*pay*0.1))+"\tUSD");
		return ((hrs*pay)+(hrs*pay*0.1));
	}
	
	public static int forTestPurpose(Double t)
	{
		if(t!=0)
			return 1;
		else
			return 0;
	}
	
	public static void main(String args[])throws Exception
	{
		Parttime_Employees f= new Parttime_Employees();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the Employee");
		f.name=br.readLine();
		System.out.println("Enter number of hrs employee worked in this week");
		f.hrs=Integer.parseInt(br.readLine());
		double test=f.calculate_pay();
		int t=forTestPurpose(test);
	}


}
