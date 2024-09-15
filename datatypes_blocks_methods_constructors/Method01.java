//instance method with no return type and no arguments
// 
class Method01
{
  public static void main(String[] args)
  {
	  System.out.println("static main method ");
	 Method01 obj = new Method01();
	 obj.display();						//way1
	 
	 // new Method01().display();    //way2 to call instance method
  }
  
  void display()  
	{  
		System.out.println("Abstract method?");  
	}  
}