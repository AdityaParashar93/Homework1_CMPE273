import java.io.BufferedReader;
import java.io.InputStreamReader;


public class stacks 
{
	String vehicle_owner_name;
	int time;
	stacks()
	{
		vehicle_owner_name=null;
		time=0;
	}
	void accept()throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the vehicle owner's name:\t");
		vehicle_owner_name=br.readLine();
		System.out.println("Enter the duration for which car is going to be parked:\t");
		time=Integer.parseInt(br.readLine());
	}
	int release()
	{
		System.out.println(vehicle_owner_name+"'s vehicle will be released");
		return 1;
	}
	public static void main(String[] args) throws Exception 
	{
		stacks s[];
		int n;
		System.out.println("Enter the number of cars you want to park in the line");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		s=new stacks[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new stacks();
			s[i].accept();
		}
		System.out.println("As soon as the array is scanned system will program will release");
		for(int i=(s.length-1);i>=0;i--)
		{
			s[i].release();
		}
	}
}