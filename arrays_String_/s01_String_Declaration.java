/*String is a sequence of characters. But in Java,
 string is an object that represents a sequence of characters.
 The java.lang.String class is used to create a string object. 
 */
class Declaration
{
	public static void main(String[] args)
	{
		String s = "Hello"; 
		String sobj1 = new String("Hello");
		char[] ch={'j','a','v','a','p','r','o','g','r','a','m'}; 
		
		String sobj2 = new String(ch);
		StringBuffer sbf = new StringBuffer("hello");
		StringBuilder sbi = new StringBuilder("hello");
		
		 
		 
		System.out.println(s);
		System.out.println(sobj1);
		System.out.println(sobj2);
		System.out.println(sbf);
		System.out.println(sbi);
		
	}
}