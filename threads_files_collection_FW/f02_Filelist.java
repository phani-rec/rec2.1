import java.io.*;
class Demo
{
	public static void main(String[] args)throws IOException
	{
		int count =0;
		File f= new File(".");		
		String s[] = f.list();
        System.out.println("List of files & Dirctory in the current working directory:");
        for(String s1:s)
		{
			count++;
         System.out.println(s1);
		}	
		System.out.println("total files & Dirctory in the current working directory:"+count);
	}
}