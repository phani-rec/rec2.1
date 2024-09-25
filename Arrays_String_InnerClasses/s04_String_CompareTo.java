class StrCompareTo
{
	public static void main(String[] args) 
	{
    String myStr1 = "Hello";
    String myStr2 = "Hello";	
    System.out.println(myStr1.compareTo(myStr2));
	
	String sobj = new String("Hello");
	System.out.println(myStr1.compareTo(sobj));
	
	char[] ch={'H','e','l','l','0'}; 		
	String sobja = new String(ch);
	System.out.println(+myStr1.compareTo(sobja));
	
	
	
	StringBuffer sbf = new StringBuffer("Hello");
	StringBuilder sbi = new StringBuilder("Hello");
	}
}