package string;

import java.util.stream.Stream;

public class AllAboutString {

	public static void main(String[] args) {

		/*
		 * There are 2 way to create String.....\ By using new keyword new String(); and
		 * another by String litteral
		 */

		String str = new String("Prabhakar");
		String str1 = new String("Kumar"); // That Object Will get create into Heap Memory.....

		// 2nd way by litteral.............
		String s = "Prabhakar"; // That Object Will get create inside String Constant Pool(SCP) that area is
								// part of Heap.

		/*
		 * Now Explore all methods................
		 */
		int length = str.length();               // Returns the number of characters in the string
		char charAt = str.charAt(0);             // Returns the character at given index
		int lastIndexOf = str.lastIndexOf('a');  // Returns last occurrence index of given character
		String lowerCase = str.toLowerCase();    // Converts entire string to lowercase
		String upperCase = str.toUpperCase();    // Converts entire string to uppercase
		char[] charArray = str.toCharArray();    // Converts string into a char array
		int compareTo = str.compareTo(str1);     // Lexicographically compares two strings
		String concat = str.concat("Kumar");     // Concatenates one string with another
		boolean empty = str.isEmpty();           // Checks if string is empty (length == 0)
		String trim = str.trim();                // Removes leading and trailing spaces
		String substring = str.substring(1, 3);  // Returns substring between given indexes
		String replace = str.replace('P','W');   // Replaces all occurrences of a character
		boolean equals = str.equals(str1);       // Compares strings for exact content equality
		boolean equalsIgnoreCase = str.equalsIgnoreCase(str1); // Compares ignoring case
		boolean startsWith = str.startsWith("Pre"); // Checks if string starts with given prefix
		boolean endsWith = str.endsWith("kar"); // Checks if string ends with given suffix
		boolean contains = str.contains("bha"); // Checks if string contains given sequence
		int indexOf = str.indexOf("a");          // Returns first index of given character/substring
		String[] parts = str.split(" ");         // Splits string into array based on regex
		byte[] bytes = str.getBytes();           // Converts string into byte array 

		
		String repeat = str.repeat(3);           // Repeats the string n times
		String strip = str.strip();              // Removes leading & trailing whitespace (Unicode aware, better than trim)
		String stripLeading = str.stripLeading();// Removes only leading whitespaces
		String stripTrailing = str.stripTrailing();// Removes only trailing whitespaces
		boolean blank = str.isBlank();           // Checks if string is empty or contains only whitespace
		Stream<String> lines = str.lines();      // Splits string into a Stream of lines


		/*
		 * Reverse String.......................
		 */

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}
}