//1.0 default values using static primitive 

public class Demo01 {
   static boolean val1;
   static double val2;
   static float val3;
   static int val4;
   static long val5;
   static String val6;
   public static void main(String[] args) {
      System.out.println("Default values.....");
      System.out.println("Val1 = " + val1);
      System.out.println("Val2 = " + val2);
      System.out.println("Val3 = " + val3);
      System.out.println("Val4 = " + val4);
      System.out.println("Val5 = " + val5);
      System.out.println("Val6 = " + val6);
   }
}



// 2.1 QuadraticEquationExample way 1

    import java.util.Scanner;  
    public class QuadraticEquationExample1  
    {  
    public static void main(String[] Strings)   
    {  
    Scanner input = new Scanner(System.in);  
    System.out.print("Enter the value of a: ");  
    double a = input.nextDouble();  
    System.out.print("Enter the value of b: ");  
    double b = input.nextDouble();  
    System.out.print("Enter the value of c: ");  
    double c = input.nextDouble();  
    double d= b * b - 4.0 * a * c;  
    if (d> 0.0)   
    {  
    double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
    double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
    System.out.println("The roots are " + r1 + " and " + r2);  
    }   
    else if (d == 0.0)   
    {  
    double r1 = -b / (2.0 * a);  
    System.out.println("The root is " + r1);  
    }   
    else   
    {  
    System.out.println("Roots are not real.");  
    }  
    }  
    }  

// 2.2 QuadraticEquationExample  way  2

    import static java.lang.Math.*;  
    public class QuadraticEquationExample2  
    {  
    //defining a static method that finds the roots of the quadratic equation  
    static void calculateRoots(int a, int b, int c)  
    {  
    //comparing the value of a with 0, if a is 0 then the equation is not quadratic   
    if (a == 0)   
    {  
    System.out.println("The value of a cannot be 0.");  
    return;  
    }  
    //calculating discriminant (d)  
    int d = b * b - 4 * a * c;  
    double sqrtval = sqrt(abs(d));  
    if (d > 0)   
    {  
    System.out.println("The roots of the equation are real and different. \n");  
    System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
    }  
    else if (d == 0)   
    {  
    System.out.println("The roots of the equation are real and same. \n");  
    System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
    }  
    // executes if d < 0  
    else   
    {  
    System.out.println("The roots of the equation are complex and different. \n");  
    System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
    }  
    }  
    //main method  
    public static void main(String args[])  
    {  
    //Output 1  
    int a = 1, b = 5, c = 2;      
    //calling function  
    calculateRoots(a, b, c);  
    //Output 2: int a=1, b=1, c=1               
    //Output 3: int a=1, b=-2, c=1  
    }  
    }  


//3.0 speed of qualifying racers 

import java.io.*;
import java.util.*;
class Bikers
{
static float S1,S2,S3,S4,S5;
static float AvgSpeed;
public static void main(String args[ ])
{
Scanner input = new Scanner(System.in);
System.out.println(" Enter Speed of five Bike Racer");
S1 = input.nextInt();
S2 = input.nextInt();
S3 = input.nextInt();
S4 = input.nextInt();
S5 = input.nextInt();
AvgSpeed=(S1+S2+S2+S3+S4+S5)/5;
if( S1>AvgSpeed)
System.out.println("The Speed of Qualifying Racer is"+S1);
if( S2>AvgSpeed)
System.out.println(" The Speed of Qualifying Racer is"+S2);
if( S3>AvgSpeed)
System.out.println(" The Speed of Qualifying Racer is"+S3);
if( S4>AvgSpeed)
System.out.println(" The Speed of Qualifying Racer is"+S4);
if( S5>AvgSpeed)
System.out.println(" The Speed of Qualifying Racer is"+S5);
}
}
