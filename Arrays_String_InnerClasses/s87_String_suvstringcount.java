// Program to count occurrence of a given string in a string

class String_sbustringcount
{
	public static void main(String args[])
	{       
		String str= "Program to count occurrence of a given character in a string";
        
		String findStr = "ra";
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1)
		{
			lastIndex = str.indexOf(findStr,lastIndex);
			if(lastIndex != -1)
			{
				count ++;
				lastIndex += findStr.length();
			}
		}
		System.out.println(count);
    }
}