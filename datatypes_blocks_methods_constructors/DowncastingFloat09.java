class ExplicitFlocat02
{
 public static void main(String[] args)
 {
  float f2 = 123456789.123f;
  System.out.println("before conversion float : "+f2);
  long l2=(long)f2;
  System.out.println("after conversion long : "+l2+" float  "+f2); 
  int i2=(int)f2;
  System.out.println("after conversion int : "+i2+" float  "+f2);
  short s2=(short)f2;
  System.out.println("after conversion short : "+s2+" float  "+f2);
  
  byte b2=(byte)f2;
  System.out.println("after conversion long : "+b2+" float  "+f2);   
 }
}