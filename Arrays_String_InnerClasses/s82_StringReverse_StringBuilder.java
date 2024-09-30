class StringReverse02
{
	static String s = "phaneendra";
	public static void main(String[] args)
	{		
		System.out.println(s);
		StringBuilder sb = new StringBuilder(s);
		
		System.out.println(sb.reverse());
		
	}
}