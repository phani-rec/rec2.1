class String_ReplaceAll
{
	public static void main(String[] args)
	{
		String s1=" ";
		System.out.println("to replace a string  old char with new char");
		String s2 = " ";
		String s3 = "a" ;
		s1.replaceAll(s2,s3);
		System.out.println("s1 --"+s1);
		
		
		String s4 = s1.replaceAll(s2,s3);
		System.out.println("s4 --"+s4);
		
		String s5 = s1.replaceAll(" ","A");
		System.out.println("s5 --"+s5);
		
		String s6="https://github.com/phani-rec/rec2.1";  
		String s7=s6.replaceAll("ec","it");
		//replaces all occurrences of 'ec' to 'it'  
		System.out.println(s7); 		
		/*
		String s8 = null;    
		// replacing null with Java. Hence, the NullPointerException is raised.  
		String s9 = s6.replaceAll(s8, "Java");    
		System.out.println(s9);
		*/
		
		//Let's see an example to remove all the occurrences of white spaces.		 
		String s11=s6.replaceAll("\\s","");  
		System.out.println(s11);
		
		String s12 = "";  
		// adding a white space before and after every character of the input string.  
		String s13 = s6.replaceAll(s12, " "); 
		System.out.println(s13);  
		
		
		
	}	
}