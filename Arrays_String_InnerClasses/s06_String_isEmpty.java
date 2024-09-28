class String_isEmpty
{
	public static void main(String[] args)
	{
		String s1="";
		System.out.println("to find String is empty or not");
		System.out.println(s1.isEmpty());
		System.out.println("s1 length "+s1.length());
		
		String s2=" ";  // empty space also considered as a character
		System.out.println("s2  "+s2.isEmpty());
		System.out.println("s2 length "+s2.length());
		
		String s3="a";  
		System.out.println("s3  "+s3.isEmpty());
		System.out.println("s3 length "+s3.length());
		
		String s4="phani";  
		System.out.println("s4  "+s4.isEmpty());
		System.out.println("s4 length "+s4.length());
		
		
	}	
}