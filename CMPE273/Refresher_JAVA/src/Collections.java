import java.io.*;
import java.util.*;
public class Collections 
{
	LinkedList<String> l1=new LinkedList<String>();
	
	int repair()throws Exception
	{
		int i=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(i++<=5)
		{
			System.out.println("Enter the name of the Customer's car to be repaired");
			String name;
			name=br.readLine();
			l1.add(name);
		}
		if(i>=5)
		{
			return 1;
		}
		else 
			return 0;
	}
	int dispatch()throws Exception
	{
		int i=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(i++<=5)
		{
			String name;
			System.out.println("Enter the name of the Customer's car to be dispatched");
			name=br.readLine();
			l1.remove(name);
			System.out.println("remaining cars"+l1);
		}

		if(i>=5)
		{
			return 1;
		}
		else 
			return 0;
	}
	
	public static void main(String ags[])throws Exception
	{
		Collections c=new Collections();
		c.repair();
		c.dispatch();
	}	
}
