import java.io.*;
class Demo
{
	public static void main(String[] args)throws IOException
	{
		int count =0;
		File f= new File(".");		
		String s[] = f.list();
        System.out.println("List of files in the current working directory:");
        for(String s1:s)
		{
			File f1= new File(f,s1);
			if(f1.isFile())
			{
				
				count++;
				System.out.println(s1);
			}
		}	
		System.out.println("total files in the current working directory:"+count);
		System.out.println("------------------------------------");
		int count1=0;
		 for(String s1:s)
		{
			File f2= new File(f,s1);
			if(f2.isDirectory())
			{
				
				count1++;
				System.out.println(s1);
			}
		}	
		System.out.println("total files in the current working directory:"+count1);
	}
}