// byte -> short -> int -> long -> float -> double  
//upcasting	or implicit conversion or casting down. It is done automatically

class ImplicitByteExample1  
{
	public static void main(String[] args)
	{
	byte b1=120;
	System.out.println("b1  value "+b1); 
	short s1=b1;     
	System.out.println("After conversion, short value "+s1 + " byte value "+b1); 
	int i1=b1;
	System.out.println("After conversion, int value "+i1 + " byte value "+b1); 
	long l1=b1;
	System.out.println("After conversion, long value "+l1 + " byte value "+b1); 
	float f1=b1;
	System.out.println("After conversion, float	value "+f1 + " byte value "+b1); 
	double d1=b1;
	System.out.println("After conversion, double value "+d1 + " byte value "+b1); 
	}
}  