//Child or subclass or derived
class Child 
{
	int pa = 11;
	static int pb = 22;
	{
		System.out.println("Child instance block");
	}
	
	static
	{
		System.out.println("Child static block");
	}
	void meth01()
	{
		System.out.println("Child instance method 01 ");
	}
	void meth03()
	{
		System.out.println("Child instance method 03 ");
	}
	static void meth02()
	{
		System.out.println("Child static method 02 ");
	}
	Child()
	{
		System.out.println("Child 0 arg constructor ");
	}
	public static void main(String[] args)
	{
		System.out.println("Child class main");
		Child c = new Child();
		c.meth01();
		c.meth02();
		c.meth03();
	}
}