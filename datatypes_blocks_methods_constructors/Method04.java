//instance method with int return type and two argument

class InstanceMethodExample  
 {  
    public static void main(String [] args)  
    {  
    //Creating an object of the class  
    InstanceMethodExample obj = new InstanceMethodExample();  
    //invoking instance method   
    System.out.println("The sum of two args is: "+obj.add(11, 22)); 

	System.out.println("The sum of three args is: "+obj.add(11, 22, 33));  	
    }  
    int s;  
    //user-defined method because we have not used static keyword  
    public int add(int a, int b)  
    {  
    s = a+b;  
    //returning the sum  
    return s;  
    }  
	
	public int add(int a, int b, int c)  
    {  
    s = a+b+c;  
    //returning the sum  
    return s;  
    }  
 }  