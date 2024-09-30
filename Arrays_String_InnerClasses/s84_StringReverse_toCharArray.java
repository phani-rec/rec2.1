class StringReverse04
{
	static String s = "phaneendra";
	public static void main(String[] args)
	{		
		System.out.println(s);
		char[] ch= s.toCharArray();
		for(int i= s.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}

		for(char t:ch)
			System.out.print(" "+t);
	}
}