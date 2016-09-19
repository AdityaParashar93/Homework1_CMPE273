import java.io.*;

public class Queue 
{
	int a; 
	String name;
	int for_test_purpose=1;
	
	Queue()
	{
		a=0;
		name=new String();
	}
	void accept(int i)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=i+1;
		name=br.readLine();
	}
	void show(int n)
	{
		for_test_purpose=0;
		System.out.println("Appointment id"+(n)+"\t"+name+"has been provided with service.");
		for_test_purpose=1;
		Service(for_test_purpose);
	}
	public static int Service(int t)
	{
				return t;
	}
	
	public static void main(String[] args)throws Exception 
	{
		int n;
		Queue q[];
		System.out.println("Enter the number of Customers who already has been given the appointments:\t");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		q=new Queue[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Customer's appointment id and name:\t"+(i+1));
			q[i]=new Queue();
			q[i].accept(i);
		}
		
		int i=0;
	    int c=1;
		while(i<n && c==1)
		{
			q[i].show(i);
			System.out.println("Press 1 key to call the next customer in queue");
			c=Integer.parseInt(br.readLine());
			i++;	
		}
	}
}