// creating instance block in class 
class Block01{
	{
		//instance block
		System.out.println("instance block 1");
	}	
	{
		//instance block
		System.out.println("instance block 01");
	}	
 public static void main(String[] args)
 {
	 System.out.println("main .......");
	     new Block01();  //way 1 to call instance block
		Block01 b1 = new Block01(); //way 2 to call instance block
 }
}