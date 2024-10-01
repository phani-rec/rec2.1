/*Java program to remove duplicate characters from a string
  1  By using the simple for loop.
  2  By using the sorting algorithm.
  3  By using the hashing.
  4  By using the indexOf() method. */
  
import Java.util.*;   
  
//Create RemoveDuplicatesExample3 for removing duplicate characters  
class RemoveDuplicates
{   
    //Create removeDuplicates() method for removing duplicates using LinkedHashSet  
    static void removeDuplicates(String str)   
    {     
        //Create LinkedHashSet of type character   
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
        //Add each character of the string into LinkedHashSet   
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            
        // print the string after removing duplicate characters   
        for(Character ch : set)   
            System.out.print(ch);   
    }   
        
    //main() method start  
    public static void main(String args[])   
    {   
        //Create string variable with default value  
        String str = "phaneendra";   
        //removeDuplicates() method by passing the string as an argument   
        removeDuplicates(str);   
    }   
}  