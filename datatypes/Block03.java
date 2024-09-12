//create static and instance blocks
class Block03{
	
	static
	{
		//static block
		System.out.println("static block 1");
	}
	{
		//instance block
		System.out.println("instance block 1");
	}		
	static
	{
		//static block
		System.out.println("static block 00");
	}
	
	{
		//instance block
		System.out.println("instance block 01");
	}	
 public static void main(String[] args)
 {
	 System.out.println("main .......");
		new Block03();
 }
}