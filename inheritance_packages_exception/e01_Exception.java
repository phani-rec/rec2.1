class Exception01
{
	static void hi()
	{
		System.out.println("hi method");
		sayhi();
	}
	static void sayhi()
	{
		System.out.println("say hi method");
		int t=10/0;
	}
	public static void main(String[] args)
	{
		Exception01.hi();
	}
	
}
/* 
hi method
say hi method
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception01.sayhi(e01_Exception.java:11)
        at Exception01.hi(e01_Exception.java:6)
        at Exception01.main(e01_Exception.java:15)
		*/