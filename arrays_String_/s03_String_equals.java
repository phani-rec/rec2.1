class StrEquals
{
	public static void main(String[] args)
	{
		String s = "Hello"; 
		String sobj1 = new String("Hello");		
		char[] ch={'H','e','l','l','0'}; 		
		String sobj2 = new String(ch);
		String sobj3 = new String("Hello");
		StringBuffer sbf = new StringBuffer("Hello");
		StringBuilder sbi = new StringBuilder("Hello");	 
		 
		System.out.println("s      eq sobj1  "+s.equals(sobj1));  //content comparison		
		System.out.println("sobj1  eq sobj2  "+sobj1.equals(sobj2));
		System.out.println("sobj1  eq sobj3  "+sobj1.equals(sobj3));
		System.out.println("sobj2  eq sobj3  "+sobj2.equals(sobj3));
		System.out.println("sbf    eq sbi    "+sbf.equals(sbi));
		
		if(s == sobj1)
			System.out.println("s  , sobj1 same");
		else
			System.out.println("s  , sobj1 not same");		
		
	}
}