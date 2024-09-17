class Constructor
{
	static int count=0;
	
	{
		count++;  //instance block 
	}
	
	void m1()
	{
		new Constructor();
		System.out.println(" m1 instance method  ");	
	}	
  Constructor()
  {	  
	  System.out.println("0 arg constructor");
  }
  Constructor(int x)
  {	 
	  System.out.println("1 arg constructor");
  }
  Constructor(int x,int y)
  { 
	  System.out.println("2 arg constructor");
  }
 Constructor(int x,int y,int z)
  { 
	  System.out.println("3 arg constructor");
  }
  public static void main (String[] args)
  {    
		new Constructor().m1();
		new Constructor(111,122,333).m1();
		new Constructor(11,22);
		
		System.out.println("main ----total created objects count "+count);		
   }
}