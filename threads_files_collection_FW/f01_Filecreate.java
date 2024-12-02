import java.io.*;
class Demo
{
	public static void main(String[] args)throws IOException
	{
		File f= new File("abc.txt");
		f.createNewFile();
		System.out.println(f.exists());  //true
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		
	}
}

/*
true
true
true
abc.txt
C:\Users\REC\phani\java\rec2.1\threads_files_collection_FW\abc.txt
0

*/