    public class DoubleExample2 
	{  
      public static void main(String[] args) 
	  {  
          double d1 = 59d;  
          double d2 = 90;  
           
          System.out.println("The first value is : "+d1);  
          System.out.println("The second value is : "+d2);  
         int obj = Double.compare(d1, d2);  
         if(obj==0) {  
             System.out.println("Both the values are same");  
         }  
         else if(obj > 0) {  
             System.out.println("The value '"+d1+"' is greater.");  
         }  
         else {  
             System.out.println("The value '"+d2+"' is the greatest.");  
         }    
         // returns the maximum of the two numbwers.  
          System.out.println("The maximum of the two values '"+ d1+"' and '"+d2+"' is given as :"+Double.max(d1, d2));   
      }  
    }  