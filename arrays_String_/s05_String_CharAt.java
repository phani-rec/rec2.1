// The charAt() method returns the character at the specified index in a string.
class StrCharAt 
{
  public static void main(String[] args) 
  {
    String myStr = "Hello";
    char result = myStr.charAt(0);
    System.out.println(result);
	
	String sobj = new String("Hello");
	System.out.println(sobj.charAt(1));
	
	char[] ch={'H','e','l','l','0'}; 		
	String sobja = new String(ch);
	System.out.println(sobja.charAt(2));
	
	StringBuffer sbf = new StringBuffer("hello");
	System.out.println(sbf.charAt(2));
	
	StringBuilder sbi = new StringBuilder("hello");
    System.out.println(sbi.charAt(2));		
  }
}
