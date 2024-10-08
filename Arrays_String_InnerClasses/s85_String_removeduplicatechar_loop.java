/*Java program to remove duplicate characters from a string
  1  By using the simple for loop.
  2  By using the sorting algorithm.
  3  By using the hashing.
  4  By using the indexOf() method. */
  
import java.util.*;   
class RemoveDuplicates  
{   
    //Creating removeDuplicates() method to remove duplicates from array  
    static void removeDuplicate(char str[], int length)   
    {   
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
    
        // Traversing character array  
        for (int i = 0; i < length; i++)   
        {   
              int j;
            // Check whether str[i] is present before or not   
            for (j = 0; j < i; j++)    
            {   
              
			  if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            // If the character is not present before, 
			//add it to resulting string   
            if (j == i)    
            {   
                str[index++] = str[i]; 
				System.out.println(str[index++] +"i -"+i+" = "+ str[i]+" -j "+j);
            }   
        }   
        //System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    
    // main() method starts  
    public static void main(String[] args)   
    {   
        String info = "phaneendra";  
        
        char str[] = info.toCharArray();  
        //Calculating length of the character array  
        int len = str.length;   
        //Calling removeDuplicates() method to remove duplicate characters  
        removeDuplicate(str, len);   
    }   
}  