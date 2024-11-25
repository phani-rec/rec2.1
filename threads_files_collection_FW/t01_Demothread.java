import java.lang.Thread;
class Mythread extends Thread
{
	public void run()
	{
		System.out.println("child thread");
		System.out.println("thread name - "+Thread.currentThread().getName());	
		System.out.println("thread child priority - "+Thread.currentThread().getPriority());	
	}
}
class DemoThread
{
	public static void main(String[] args)
	{
		Mythread t= new Mythread();
		t.start();
		System.out.println("main thread");
		System.out.println("thread name - "+Thread.currentThread().getName());	
		System.out.println("thread main priority- "+Thread.currentThread().getPriority());			
	}
}

/*
output :1
..............
main thread
child thread
thread name - main
thread name - Thread-0
thread child priority - 5
thread main priority- 5


output :2
.............
main thread
child thread
thread name - main
thread name - Thread-0
thread main priority- 5
thread child priority - 5

*/