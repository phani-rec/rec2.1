// Java program to illustrate the concept of Multiple inheritance

interface One 
{
    public void im1();
}

interface Two 
{
    public void im2();
}

interface Three extends One, Two 
{
    public void im3();
}
class Child implements Three 
{
    @Override
	public void im1()
    {
        System.out.println("interface one im1 method");
    }
    public void im2()
    {
        System.out.println("interface Two im2 method");
    }
	public void im3()
    {
        System.out.println("interface Three im3 method");
    }
}

// Drived class
class Demo {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.im1();
        c.im2();
        c.im3();
    }
}

/* In Multiple inheritances, one class can have more than one superclass
 and inherit features from all parent classes. 
 Please note that Java does not support multiple inheritances with classes. 
In Java, we can achieve multiple inheritances only through Interfaces. */