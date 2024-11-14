class Exception06
{	
	public static void main(String[] args)
	{
		try
		{
			int t=10/0;
			System.out.println(t);
		}
		catch(NumberFormatException e) 
		{
			e.printStackTrace();	
		}
		catch(ArithmeticException e)
		{			
			e.printStackTrace();			
		}
		catch(Exception e)
		{			
			e.printStackTrace();			
		}
	}	
}

/*
java.lang.ArithmeticException: / by zero
        at Exception06.main(e06_Exception06.java:7)
		*/
