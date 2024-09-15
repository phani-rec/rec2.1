//instance method with return type and no arguments

class Addition   
    {  
    public static void main(String[] args)   
    {  
    
    //method calling  
    int c = new Addition().add();   
    System.out.println("The sum vaues is = " + c);  
    }  
    //user defined method  
    public int add()     
    { 
		int n1 = 111;
		int n2 = 222;	
    int s;  
    s=n1+n2;  
    return s; //returning the sum  
    }  
    }  