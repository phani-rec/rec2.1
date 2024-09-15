//create instance primitive variable and create static and instance blocks calling that variable
class Block05
{
	 int b = 456;  //instance primitive variable
	
	static  //static block
	{		
		System.out.println("static block ......");
		//System.out.println("instance int b "+b+ "calling from static block");
	}
	//instance block
	{		
		System.out.println("instance block........ ");
		System.out.println("instance int b "+b+ " calling from instance block");
		
	}		
	
 public static void main(String[] args)
 {	 
	 System.out.println("main .......");
	 Block05 b5 = new Block05();
     System.out.println("instance int a "+b5.b+ " calling from main method");
 }
}