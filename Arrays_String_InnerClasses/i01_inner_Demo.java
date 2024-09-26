class Outer
{
	class Inner
	{
		{
			System.out.println("inner class instance block");
		}
		void m1()
		{
			System.out.println("Iner class m1 method");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("outer class main method");
		//way1 to create object for inner class and calling inner class methods
	/*	Outer objo = new Outer();
		Outer.Inner obji = objo.new Inner();
		obji.m1();  
		
		//way 2 to create object for inner class and calling inner class methods
		new Outer().new Inner().m1();	*/
		
		//way 3 to create object for inner class and calling inner class methods
		Outer.Inner objoi= new Outer().new Inner();
		objoi.m1();		
	}
}