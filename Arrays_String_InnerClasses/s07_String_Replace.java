class String_Replace
{
	public static void main(String[] args)
	{
		String s1=" ";
		System.out.println("to replace a string  old char with new char");
		char c1 =' ';
		char c2 ='a';
		s1.replace(c1,c2);
		System.out.println("s1 --"+s1);
		
		String s2 = s1.replace(c1,c2);
		System.out.println("s2 --"+s2);
		
		String s3 = s1.replace(' ','e');
		System.out.println("s3 --"+s3);
		
		String s4="https://github.com/phani-rec/rec2.1";  
		String replace4=s4.replace('e','i');
		//replaces all occurrences of 'e' to 'i'  
		System.out.println(replace4);  
		
		String s5="https://github.com/phani-rec/rec2.1";  
		String replace5=s5.replace("ec","it");
		//replaces all occurrences of "ec" to "it" 
		System.out.println(replace5); 
		
		/*
		String target = null;    
		// replacing null with Java. Hence, the NullPointerException is raised.  
		String s7 = str.replace(target, "Java");    
		System.out.println(s7); 
		*/
		
	}	
}