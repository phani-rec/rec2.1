import java.lang.Thread;
class Myinter implements Runnable
{
	public void run()
	{
		System.out.println("runnable child thread");
		System.out.println("runnable thread name - "+Thread.currentThread().getName());	
		System.out.println("runnable thread child priority - "+Thread.currentThread().getPriority());	
	}
}
class DemoThread
{
	public static void main(String[] args)
	{
		Myinter r = new Myinter(); 
		Thread t = new Thread(r);
		t.start();
		System.out.println("main thread");
		System.out.println("thread name - "+Thread.currentThread().getName());	
		System.out.println("thread main priority- "+Thread.currentThread().getPriority());			
	}
}
/*
output :1
........
main thread
runnable child thread
runnable thread name - Thread-0
thread name - main
runnable thread child priority - 5
thread main priority- 5

output :2 
..............
main thread
runnable child thread
thread name - main
runnable thread name - Thread-0
thread main priority- 5
runnable thread child priority - 5
*/