//flow of instance variable 
class Abc
{
	//1 varables 		1.1 instance variables
	//1 varables 		1.2 static variables
	//2 blocks   		2.1 instance blocks
	//2 blocks   		2.2 static blocks
	//3 methods  		3.1 instance methods
	//3 methods  		3.2 static methods
	//4 Constructors 	4.1 0 args const
	//4 Constructors  	4.2* 1 args const
	//5 main method
	static int a=8;
	
	{
		System.out.println("3 ... instance block  " +a);	
	}	
	static
	{
		System.out.println("1..  static block "+a);	
	}
	void m1()
	{
		System.out.println("5...  m1 instance method  "+a);	
	}	
	static void m2()
	{
		System.out.println("m2 static  method"+a);	
	}
	Abc()
	{
		System.out.println("4...... 0 arg constructor "+a);		
	}
	Abc(int x)
	{
		System.out.println("1 arg constructor "+a);			
	}
	public static void main (String[] args)
    {    
		System.out.println("2... main ..... "+a);
		new Abc().m1();
		new Abc(1).m2();
    }
}