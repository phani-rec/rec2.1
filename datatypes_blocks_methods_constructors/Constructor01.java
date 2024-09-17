class Constructor
{
  Constructor()
  {
    System.out.println("0 arg  Constructors.....");
   }
  Constructor(int x)
  {
    System.out.println("1 arg  Constructors.....");
   }
  Constructor(int a,int b)
  {
    System.out.println("2 arg  Constructors.....");
   }
  Constructor(int x, int y, int z)
  {
    System.out.println("3 arg  Constructors.....");
   }

  
  public static void main (String[] args)
  {
    System.out.println("main .....");
     new Constructor();
     new Constructor(9);
     new Constructor(11,22);
     new Constructor(112,224,333);
   }
}