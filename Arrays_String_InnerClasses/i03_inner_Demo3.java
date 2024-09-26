//method local inner class
class Outer
{	
	void m2()
	{
		System.out.println("method local inner class");
		class Inner
		{
			{
				System.out.println("inner class instance block");
			}		
			void m1()
			{
				System.out.println("Iner class m1 method ");			
			}
		
		}
		Inner obji= new Inner();
		obji.m1();		
	}
	public static void main(String[] args)
	{
		System.out.println("Outer class main method");
		Outer objo = new Outer();
		objo.m2();
		
	}
}