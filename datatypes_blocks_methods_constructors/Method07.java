//static method with return type and no arguments

class Addition   
    {  
    public static void main(String[] args)   
    {  
    
    //method calling  
    int c = add();   
    System.out.println("The sum vaues is = " + c);  
    }  
    //user defined method  
    public static int add()     
    { 
		int n1 = 11;
		int n2 = 22;	
    int s;  
    s=n1+n2;  
    return s; //returning the sum  
    }  
    }  