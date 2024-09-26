class Demo
{
public static void main(int... args)
 {
  System.out.println("Hello world  int");
 }
//static synchronized strictfp final public void main(String[] args)  //way 1
public static void main(String[] args)  // way2 
 {
  System.out.println("Hello world String ");   
   new Demo().main();
 }
}