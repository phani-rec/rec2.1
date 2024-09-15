// byte -> short -> char -> int -> long -> float -> double  
//upcasting	or implicit conversion or casting down. It is done automatically

class ImplicitFloatExample1  
{
	public static void main(String[] args)
	{
	float f1=23451678934.123f;
	System.out.println("before conversion, float value "+f1 ); 
	 
	double d1=f1;
	System.out.println("After conversion, double value "+d1 + " float value "+f1); 
	}
}  