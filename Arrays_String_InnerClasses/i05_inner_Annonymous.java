/*
Java anonymous inner class is an inner class without a name 
and for which only a single object is created. 
An anonymous inner class can be useful when making 
an instance of an object with certain "extras" 
such as overloading methods of a class or interface, 
without having to actually subclass a class.
*/
interface Eatable
{  
    void eat();  
}  

class AnnonymousInner
{  
    public static void main(String args[])
	{
		Eatable e=new Eatable()
		{
			public void eat()
			{
				System.out.println("nice fruits");
			}
		};  
     e.eat();  
     }  
    }  