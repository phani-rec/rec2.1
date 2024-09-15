// byte -> short -> char -> int -> long -> float -> double  
//upcasting	or implicit conversion or casting down. It is done automatically

// byte -> short -> char -> int -> long -> float -> double  
//upcasting	or implicit conversion or casting down. It is done automatically


class ImplicitShortExample1  
{
	public static void main(String[] args)
	{
	short s1=3000;     
	System.out.println("before conversion, short value "+s1 ); 
	int i1=s1;
	System.out.println("After conversion, int value "+i1 + " short value "+s1); 
	long l1=s1;
	System.out.println("After conversion, long value "+l1 + " short value "+s1); 
	float f1=s1;
	System.out.println("After conversion, float	value "+f1 + " short value "+s1); 
	double d1=s1;
	System.out.println("After conversion, double value "+d1 + " short value "+s1); 
	}
}  