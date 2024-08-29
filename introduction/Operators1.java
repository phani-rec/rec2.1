class Operators1
{
 public static void main(String[] args)
 {
  int a = 10;
  int b = 20;
  
  // Arithmetic operators
  System.out.println("operator + "+ a+b );
  System.out.println("operator + for addition "+ (a+b) );
  //System.out.println("operator - "+ a-b );
  System.out.println("operator - for substraction "+ (a-b) );
  System.out.println("operator * "+ a*b );
  System.out.println("operator / "+ b/a );
  System.out.println("operator % "+ b%a );
  
   // Using unary operators
    System.out.println("Postincrement : " + (a++));
    System.out.println("Preincrement : " + (++a));

    System.out.println("Postdecrement : " + (b--));
    System.out.println("Predecrement : " + (--b));
	
	// Assignment operators
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));
		
		
		// Comparison operators
        int p = 10;
        int q = 3;
        int r = 5;

        System.out.println("p > q: " + (p > q));
        System.out.println("p < q: " + (p < q));
        System.out.println("p >= q: " + (p >= q));
        System.out.println("p <= q: " + (p <= q));
        System.out.println("a == r: " + (p == r));
        System.out.println("p != r: " + (p != r));
		
		 // Logical operators
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
  }
}