class Constructor
{
	static int count=0;
	
	{
		count++;  //instance block 
	}
  Constructor()
  {
	  this(10);
	  System.out.println("0 arg constructor");
  }
  Constructor(int x)
  {
	  this(1,2);
	  System.out.println("1 arg constructor");
  }
  Constructor(int x,int y)
  { //this();  //error: recursive constructor invocation
	  System.out.println("2 arg constructor");
  }
 
  public static void main (String[] args)
  {    
		new Constructor();	
		System.out.println("main ....."+count);		
   }
}