class Display
{
	String name;
	public static synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning...");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

//Thread class

class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

// Demo class synchronization using synchronized method

class synchronizationDemo
{
	public static void main(String[] args)
	{
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1,"Dhoni");
		MyThread t2 = new MyThread(d2,"Virat");
		t1.start();
		t2.start();		
	}
}