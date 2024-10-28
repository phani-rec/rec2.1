package rit ;  
import rec.*;  
  
class B
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.msg();
	}  
}  

/*


1) Using packagename.*
If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.


The import keyword is used to make the classes and interface of another package accessible to the current package.
*/