class StringReverse03
{
	static String s = "phaneendra";
	public static void main(String[] args)
	{		
		System.out.println(s);
		for(int i= s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}		
	}
}