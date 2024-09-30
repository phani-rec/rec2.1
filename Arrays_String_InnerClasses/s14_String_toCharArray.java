public class String_toCharArray 
{
  public static void main(String[] args) 
  {
	  String myStr = "phaneendra";
      char[] ch = myStr.toCharArray();
      System.out.println(ch[0]);
	  for(char t : ch)
		  System.out.print(" "+t);
  }
}
