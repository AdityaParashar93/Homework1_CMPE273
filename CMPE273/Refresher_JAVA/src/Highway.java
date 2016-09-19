
class TollBooth implements Runnable 
{
	Thread t;
	String t_id;
	int forTestPurpose=1;
	
	TollBooth(String name)
	{
		t_id=name;
	}
	
	public void start()
	{
		System.out.println("Creating tollbooth\t");
		if(t==null)
		{
			t=new Thread(this,t_id);
			t.start();
		}
		System.out.println("Tollbooth created");
	}
	
	public void run() 
	{
		try
		{
			int i=1;
			while(i++<=30)
			{
				System.out.println("Waiting for next car at "+t_id);
				t.sleep(500);
				System.out.println("Collecting Toll "+t_id);
				t.sleep(500);
				System.out.println("Releasing Car from "+t_id);
				t.sleep(500);
			}
			forTestPurpose=1;
		}
		catch(InterruptedException E)
		{
			System.out.println("TollBooth interrupted.");
		}
	}
}
class Highway
{
	public static int Test(int t)
	{
		return t;
	}
	public static void main(String[] args)throws Exception
	{
			TollBooth t1,t2,t3;
			t1=new TollBooth("TollBooth#1");
			t2=new TollBooth("TollBooth#2");
			t3=new TollBooth("TollBooth#3");
			t1.start();
			t2.start();
			t3.start();
			if(t1.forTestPurpose==1 && t2.forTestPurpose==1 && t3.forTestPurpose==1)
				Test(1);
			else
				Test(0);
	}
}
