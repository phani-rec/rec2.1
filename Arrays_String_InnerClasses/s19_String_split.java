public class String_split {
    public static void main(String args[])
    {
        String str  = "the split method takes a regular expression as a parameter and breaks the given string around matches of this regular expression";
       // String[] arrOfStr = str.split("\\s");

        // for (String a : arrOfStr)
            // System.out.println(a);
		
		String[] arrOfStr5 = str.split(" ");

        for (String e : arrOfStr5)
            System.out.println(e);
		
		
		
		String str2 = "word1, word2 word3@word4?word5.word6";
		
		String[] arrOfStr2 = str2.split(" ");

        for (String b : arrOfStr2)
            System.out.println(b);
		
        String[] arrOfStr3 = str2.split("[, ?.@]+");

        for (String c : arrOfStr3)
            System.out.println(c);
    }
}
