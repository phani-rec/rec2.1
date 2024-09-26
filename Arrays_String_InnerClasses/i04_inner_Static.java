class Outer
{ 
    static int data=30;  
    static class Inner
	{  
       void msg()
	   {
		   System.out.println("data is "+data);
		}  
     }  
    public static void main(String args[])
	{  
      Outer.Inner obj=new Outer.Inner();  
      obj.msg();  
    }  
}  