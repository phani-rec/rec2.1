class Exception05
{	
	public static void main(String[] args)
	{
		try
		{
			int t=10/0;
			System.out.println(t);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("--------");
			e.printStackTrace();
			System.out.println("--------");
			System.out.println(e.toString());
			System.out.println("--------");
			System.out.println(e.getMessage());
		}
	}	
}

/*
java.lang.ArithmeticException: / by zero
--------
java.lang.ArithmeticException: / by zero
        at Exception05.main(e05_Exception05.java:7)
--------
java.lang.ArithmeticException: / by zero
--------
/ by zero   

*/