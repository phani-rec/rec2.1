// Java program to illustrate the concept of single inheritance
import java.io.*;
import java.util.*;

class One   // Parent class
{
    public void m1()
    {
        System.out.println("Parent/base/super class m1 method");
    }
}

class Two extends One 
{
    public void m2() 
	{
		System.out.println("Child/sub/derived class m2 method"); 
	}
}

class Demo  // Main function
{      
    public static void main(String[] args)
    {
        Two g = new Two();
        g.m1();
        g.m2();
    }
}

/* In single inheritance, a sub-class is derived from only one super class. 
 It inherits the properties and behavior of a single-parent class.
 Sometimes, it is also known as simple inheritance.
 In the above, ‘One’ is a parent class and ‘Two’ is a child class. 
 The class ‘Two’ inherits all the properties of the class ‘One’.*/
