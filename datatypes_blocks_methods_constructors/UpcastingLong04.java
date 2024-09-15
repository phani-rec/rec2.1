// byte -> short -> char -> int -> long -> float -> double  
//upcasting	or implicit conversion or casting down. It is done automatically

class ImplicitLongExample1  
{
	public static void main(String[] args)
	{
	long l1=23451678934l;
	System.out.println("before conversion, long value "+l1 ); 
	float f1=l1;
	System.out.println("After conversion, float	value "+f1 + " long value "+l1); 
	double d1=l1;
	System.out.println("After conversion, double value "+d1 + " long value "+l1); 
	}
}  