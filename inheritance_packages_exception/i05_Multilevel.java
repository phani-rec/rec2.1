
class One   // Parent class One
{ 
     public void m1() 
	{
        System.out.println("Parent class m1 method ");
    }
}

class Two extends One  
{ 
    public void m2() 
	{
        System.out.println("Child class Two inherits from class One");
    }
}

// 
class Three extends Two 
{
    public void m3() 
	{
        System.out.println("Child class Three inherits from class Two");
    }
}

class Demo
{
    public static void main(String[] args) 
	{       
        Three t = new Three();
        
        // Calling method from class One
        t.m1();
        
        // Calling method from class Two
        t.m2();
        // Calling method from class Three
        t.m3();
    }
}
