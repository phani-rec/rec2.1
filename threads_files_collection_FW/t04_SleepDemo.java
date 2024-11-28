import java.lang.*; 
  
class SleepDemo implements Runnable 
{ 
    Thread t; 
    public void run() 
    { 
        for (int i = 0; i < 4; i++) { 
            System.out.println(Thread.currentThread().getName() + "  "
                + i); 
            try 
			{ 
                Thread.sleep(1000); 
            } 
            catch (Exception e) 
			{ 
                System.out.println(e); 
            } 
        } 
    } 
  
    public static void main(String[] args) throws Exception 
    { 
        Thread t = new Thread(new SleepDemo()); 
        // call run() function 
        t.start(); 
        Thread t2 = new Thread(new SleepDemo()); 
        // call run() function 
        t2.start(); 
    } 
}

/*
Thread-1  0
Thread-0  0
Thread-1  1
Thread-0  1
Thread-1  2
Thread-0  2
Thread-0  3
Thread-1  3
*/