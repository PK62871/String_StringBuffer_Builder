package stringBuffer;

public class AllAboutStringBuffer {

	public static void main(String[] args) {
		
		/*
		 * Ways to create StringBuffer
		 */
		
		//Empty create... default capacity with 16..
		StringBuffer sb = new StringBuffer();
		
		//create StringBuffer and declea intial capacity..........
		StringBuffer sb1 = new StringBuffer(20);
		
		//From a String 
		/*
		 * In this case intial capacity + string length
		 */
		StringBuffer sb2 = new StringBuffer("Prabhakar");
		
		/*
		 * Perform All Operations of StringBuffer
		 */

		StringBuffer sb21 = new StringBuffer("Hello");

		// ---------- Append operations ----------
		char[] ch = {'A','B'};
		sb21.append(ch);                          // Appends char array to buffer
		sb21.append('C');                         // Appends a single character
		sb21.append("World");                     // Appends a string
		sb21.append(123);                         // Appends number (int → converted to string)
		sb21.append(true);                        // Appends boolean value

		// ---------- Insert operations ----------
		sb21.insert(1, 'Z');                      // Inserts char at given index
		sb21.insert(2, "Java");                   // Inserts string at given index
		sb21.insert(0, ch);                       // Inserts char array at given index

		// ---------- Capacity and length ----------
		int cap = sb21.capacity();                // Returns current capacity
		int len = sb21.length();                  // Returns number of characters in buffer
		sb21.ensureCapacity(50);                  // Ensures minimum capacity
		sb21.setLength(5);                        // Sets new length (truncates or pads with \u0000)

		// ---------- Character access & modification ----------
		char c = sb21.charAt(0);                  // Returns char at index
		sb21.setCharAt(1, 'S');                   // Replaces char at index
		String sub = sb21.substring(1, 4);        // Returns substring (like String’s substring)

		// ---------- Delete operations ----------
		sb21.deleteCharAt(1);                     // Deletes char at given index
		sb21.delete(1, 4);                        // Deletes chars from startIndex (inclusive) to endIndex (exclusive)

		// ---------- Replace ----------
		sb21.replace(0, 5, "Replaced");           // Replaces chars from start to end with given string

		// ---------- Reverse ----------
		sb21.reverse();                           // Reverses characters in buffer

		// ---------- Conversion ----------
		String str = new String("Prabhakar");
		sb21.append(str);                         // Append a String
		String toStr = sb21.toString();           // Converts buffer to String

		
		/*
		 * All methods like append(), insert(), delete(), replace(), reverse(), capacity(),
		 *  ensureCapacity(), length(), setLength(), charAt(), setCharAt(), substring(), toString() etc.
             are available in both StringBuffer and StringBuilder.
		 */
	}
}
