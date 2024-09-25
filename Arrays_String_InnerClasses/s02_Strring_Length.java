class Strlength
{
	public static void main(String[] args)
	{
		String s = "Hello"; 
		String sobj1 = new String("Hello");
		char[] ch={'j','a','v','a','p','r','o','g','r','a','m'};		
		String sobj2 = new String(ch);
		StringBuffer sbf = new StringBuffer("java");
		StringBuilder sbi = new StringBuilder("program");	 
		 
		System.out.println(s.length());
		System.out.println(sobj1.length());
		System.out.println(sobj2.length());
		System.out.println(sbf.length());
		System.out.println(sbi.length());
		
	}
}