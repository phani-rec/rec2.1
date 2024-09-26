class Outer
{
	class Inner
	{
		 int x=111;
		{
			System.out.println("inner class instance block");
		}		
		void m1()
		{
			System.out.println("Iner class m1 method "+x);
		}
	}
	void m2()
	{
		System.out.println("Outer class m2 method ");
		Inner obji = new Inner();
		System.out.println("inner class object creation and calling inner class method ");
		obji.m1();
	}
	public static void main(String[] args)
	{
		System.out.println("Outer class main method");
		Outer objo = new Outer();
		objo.m2();
	}
}