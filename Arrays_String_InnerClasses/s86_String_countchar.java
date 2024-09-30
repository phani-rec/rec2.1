// Program to count occurrence of a given character in a string

class String_charcount
{
    // Method that return count of the given
    // character in the string
    public static int count(String s, char c)
    {
        int count = 0;
 
        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
            count++;
        } 
        return count;
    }
     
    // Driver method
    public static void main(String args[])
    {
        String str= "Program to count occurrence of a given character in a string";
        char c = 'r';
        System.out.println(count(str, c));
    }
}