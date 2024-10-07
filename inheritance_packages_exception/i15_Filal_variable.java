class Bike
{
	final int speedlimit=90;//final variable	
	void run()
	{
		speedlimit=400;
		System.out.println(speedlimit);
	}
	
   public static void main(String args[])
   {
	 Bike obj = new  Bike();
	 obj.run(); 
	System.out.println(obj.speedlimit);
   }  
}
/*If you make any variable as final, you cannot change 
the value of final variable(It will be constant).*/