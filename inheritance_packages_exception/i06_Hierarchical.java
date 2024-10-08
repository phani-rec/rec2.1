// Java program to illustrate the concept of Hierarchical  inheritance

class A 
{
    public void print_A() 
	{ 
		System.out.println("Class A"); 
	}
}

class B extends A 
{
    public void print_B() 
	{ 
		System.out.println("Class B"); 
	}
}

class C extends A 
{
    public void print_C() 
	{ 
		System.out.println("Class C"); 
	}
}

class D extends A 
{
    public void print_D() 
	{ 
		System.out.println("Class D"); 
	}
}

// Driver Class
class Test 
{
    public static void main(String[] args)
    {
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();

        C obj_C = new C();
        obj_C.print_A();
		//obj_C.print_B();
        obj_C.print_C();

        D obj_D = new D();
        obj_D.print_A();
		//obj_D.print_B();
		//obj_D.print_C();
        obj_D.print_D();
    }
}

/* In Hierarchical Inheritance, one class serves as a superclass 
(base class) for more than one subclass. In the below image, 
class A serves as a base class for the derived classes B, C, and D./*