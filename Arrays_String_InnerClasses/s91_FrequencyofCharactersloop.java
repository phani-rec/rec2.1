// Java implementation to print the characters and frequencies in order of its occurrence

import java.io.*;
import java.util.ArrayList;

class Frequency3 {
	public static void main(String[] args)
	{
		String s1 = "phaneendra";
		System.out.println("For " + s1);
		frequency(s1);

		String s2 = "aaabccccffgfghc";
		System.out.println("For " + s2);
		frequency(s2);
	}
	private static void frequency(String s)
	{
		if (s.length() == 0) {
			System.out.println("Empty string");
			return;
		}
		ArrayList<CharOccur> occurrences
			= new ArrayList<CharOccur>();
		// Creating ArrayList of objects of Charoccur class

		for (int i = 0; i < s.length(); i++) {
			/* Logic
			* If a pair of character and its occurrence is
			* already present as object - increment the
			* occurrence else create a new object of
			* character with its occurrence set to 1
			*/
			char c = s.charAt(i);
			int flag = 0;
			for (CharOccur o : occurrences) {
				if (o.character == c) {
					o.occurrence += 1;
					flag = 1;
				}
			}
			if (flag == 0) {
				CharOccur grp = new CharOccur(c, 1);
				occurrences.add(grp);
			}
		}

		// Printing the character - occurrences pair
		for (CharOccur o : occurrences) {
			System.out.println(o.character + " "
							+ o.occurrence);
		}
	}
}

// Creating a class CharOccur whose objects have 2
// properties - a character and its occurrence
class CharOccur {
	char character;
	int occurrence = 0;
	CharOccur(char character, int occurrence)
	{
		this.character = character;
		this.occurrence = occurrence;
	}
}
