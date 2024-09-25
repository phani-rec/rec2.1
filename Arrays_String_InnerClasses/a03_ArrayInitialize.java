class ArrayInitialize
{
  public static void main(String[] args)
  {
	System.out.println("array declaration , creation & initializing ......");
	int[] a;  			//decleration
	a = new int[8];	//creation
	a[0] = 98;			//initializing
	a[1] = 87;
	a[2] = 97;
	a[3] = 66;
	a[4] = 94;
	a[5] = 8;
	a[6] = 897;
	a[7] = 8700;
	System.out.println("array size "+a.length);
	//way1 using for loop
	for(int i= 0;i<a.length;i++)
		System.out.println(a[i]);
	
	//way2 using for each loop
	for(int t:a)
		System.out.println(t);
			
  }
}