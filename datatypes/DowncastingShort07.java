//Converting a higher data type into a lower one is called narrowing type casting.
//It is also known as explicit conversion or casting up. 
//It is done manually by the programmer. 
//If we do not perform casting then the compiler reports a compile-time error.

class ExplicitInt02  
    {  
    public static void main(String args[])  
    {  
		int i2=321321;
		System.out.println("before conversion int type: "+i2);  
		byte b2=(byte)i2;
		System.out.println("after conversion byte type: "+b2+" int type "+i2); 
		short s2=(short)i2;
		System.out.println("after conversion short type: "+s2+" int type "+i2); 
    }  
    }  