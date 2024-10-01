// Java implementation to print the characters and
// frequencies in order of its occurrence

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void prCharWithFreq(String string)
	{
		Map<Character, Integer> d = new HashMap<>();
		// Store all characters and their frequencies
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (d.containsKey(c)) {
				d.put(c, d.get(c) + 1);
			}
			else {
				d.put(c, 1);
			}
		}

		// Print characters and their frequencies in same
		// order of their appearance
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (d.containsKey(c)) {
				System.out.print(
					c + Integer.toString(d.get(c)) + " ");
				d.remove(c);
			}
		}
	}

	public static void main(String[] args)
	{
		String string = "phaneendra";
		prCharWithFreq(string);
	}
}

// This code is contributed by shivamsharma215
