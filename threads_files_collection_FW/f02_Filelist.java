import java.io.*;
class Demo
{
	public static void main(String[] args)throws IOException
	{
		File f= new File(".");		
		String contents[] = f.list();
        System.out.println("List of files and directories in the current working directory:");
        for(int i=0; i<contents.length; i++)
		{
         System.out.println(contents[i]);
		}		
	}
}