//create static primitive variable and create static and instance blocks calling that variable
class Block04
{
	static int a=123;
	
	static  //static block
	{		
		System.out.println("static block ......");
		System.out.println("static int a "+a+ "calling from static block");
	}
	//instance block
	{		
		System.out.println("instance block........ ");
		System.out.println("static int a "+a+ " calling from instance block");
		
	}		
	
 public static void main(String[] args)
 {
	 new Block04();
	 System.out.println("main .......");
     System.out.println("static int a "+a+ " calling from main method");
 }
}