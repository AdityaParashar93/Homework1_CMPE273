import java.io.*;
class Fulltime_Employees implements Employees
{
	String name;
	int hrs,pay;
	
	public Fulltime_Employees() 
	{
		pay=50;
	}
	
	public double calculate_pay() 
	{
		System.out.println("Salary of the for this week is\t"+((hrs*pay)+(hrs*pay*0.2))+"\tUSD");
		return ((hrs*pay)+(hrs*pay*0.2));
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
		Fulltime_Employees f= new Fulltime_Employees();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the Employee");
		f.name=br.readLine();
		System.out.println("Enter number of hrs employee worked in this week");
		f.hrs=Integer.parseInt(br.readLine());
		double test=f.calculate_pay();
		int result=forTestPurpose(test);
	}
}
