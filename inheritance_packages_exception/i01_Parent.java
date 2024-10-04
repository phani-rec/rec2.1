//parent or super  or base
class Parent 
{
	int pa = 11;
	static int pb = 22;
	{
		System.out.println("Parent instance block");
	}
	
	static
	{
		System.out.println("Parent static block");
	}
	void meth01()
	{
		System.out.println("Parent instance method 01 ");
	}
	void meth04()
	{
		System.out.println("Parent instance method 04 ");
	}
	static void meth02()
	{
		System.out.println("Parent static method 02 ");
	}
	Parent()
	{
		System.out.println("Parent 0 arg constructor ");
	}
	public static void main(String[] args)
	{
		System.out.println("Parent class main");
		Parent p = new Parent();
		p.meth01();
		p.meth02();
		p.meth04();
	}
}