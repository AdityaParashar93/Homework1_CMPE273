import java.io.*;

class arrays
{
	String name;
	String driving_licence_number;
	int allow;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	arrays()
	{
		name=null;
		driving_licence_number=null;
		allow=1;
	}
	
	int check()throws Exception
	{
		System.out.println("Enter driver's name:");
		name=br.readLine();
		System.out.println("Enter driver's licence Number:");
		driving_licence_number=br.readLine();
		System.out.println("Enter 1 to allow driver to pass through check post or enter any number");
		allow=Integer.parseInt(br.readLine());
		if(allow!=1)
			return 0;
		else
			return 1;
	}
	
	int releaseVehicles()
	{
		if(allow==1)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) throws Exception
	{
		arrays check_post[];
		check_post=new arrays[5];
		for(int i=0;i<5;i++)
		{
			check_post[i]=new arrays();
			check_post[i].check();
		}
		System.out.println("Releasing manifest of this session");
		for(int i=0;i<5;i++)
		{
			int result=check_post[i].releaseVehicles();
			if(result==1)
				System.out.println(check_post[i].name+"\thas been allowed to pass through the check post");
			else
				System.out.println(check_post[i].name+"\thas not been allowed to pass through the check post");
		}
	}
}
