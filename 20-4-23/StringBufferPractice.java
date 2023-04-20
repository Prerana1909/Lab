/*Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.

1. Adds the string”- This is a sample program” to existing string and display it.

2. Inserts the string “Object” into the existing string at 21st postion and display it.

3. Reverses the entire string and displays it.

4. Replaces the word “Buffer” with “Builder” and display it.
 */
package arrays;

public class StringBufferPractice {

	public static void main(String[] args) {
	
		
		        StringBuffer strBuffer = new StringBuffer("This is StringBuffer");

		        // to add string"- This is a sample program" to existing string 
		        strBuffer.append("- This is a sample program");
		        System.out.println("Appended string: " + strBuffer.toString());
		        System.out.println();

		        // to Insert string "Object" into the existing string at 21
		        strBuffer.insert(21, "Object ");
		        System.out.println("Inserted string: " + strBuffer.toString());
		        System.out.println();

		        //to reverses the entire string 
		        strBuffer.reverse();
		        System.out.println("Reversed string: " + strBuffer.toString());
		        System.out.println();

		        // to replaces the word "Buffer" with "Builder"
		        StringBuffer strBuffer1 = new StringBuffer("This is String Buffer");
		        strBuffer1.replace(strBuffer1.indexOf("Buffer"), strBuffer1.indexOf("Buffer") + "Buffer".length(), "Builder");
		        System.out.println("Replaced string: " + strBuffer1.toString());

	}

}
