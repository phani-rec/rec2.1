// byte -> short -> char -> int -> long -> float -> double  
//upcasting	or implicit conversion or casting down. It is done automatically

class ImplicitIntExample1  
{
	public static void main(String[] args)
	{
	int i1=100000;
	System.out.println("before conversion, int value "+i1 ); 
	long l1=i1;
	System.out.println("After conversion, long value "+l1 + " int value "+i1); 
	float f1=i1;
	System.out.println("After conversion, float	value "+f1 + " int value "+i1); 
	double d1=i1;
	System.out.println("After conversion, double value "+d1 + " int value "+i1); 
	}
}  