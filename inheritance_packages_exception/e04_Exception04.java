class Exception04
{		
	public static void main(String[] args)
	{
		char[] ch= new char[5];
		System.out.println(ch.length);
		System.out.println(ch[6]);
	}
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
         Index 6 out of bounds for length 5
        at Exception04.main(e04_Exception04.java:7)
		
		*/