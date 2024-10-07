class Animal
{
	void eat()
	{
		System.out.println("Animal eating...");
	}
}  
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eating bread...");
	}
	void bark()
	{
		System.out.println("Dog barking...");
	}
	void work()
	{
		super.eat();  
		bark();  
	}  
}  
class Test
{
	public static void main(String args[])
	{
		Dog d=new Dog();  
		d.work();  
	}
}  