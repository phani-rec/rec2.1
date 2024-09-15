//Converting a higher data type into a lower one is called narrowing type casting.
//It is also known as explicit conversion or casting up. 
//It is done manually by the programmer. 
//If we do not perform casting then the compiler reports a compile-time error.

class Explicitshort02  
    {  
    public static void main(String args[])  
    {  
		short s2=12345;
		System.out.println("before conversion short : "+s2);  
		byte b2=(byte)s2;
		System.out.println("after conversion byte : "+b2+" short  "+s2); 
    }  
    }  