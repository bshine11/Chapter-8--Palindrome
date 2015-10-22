/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 10-20-15             
 * Palindrome                        *
 *                                   *
 ************************************/

// Lab08vst.java
// The "Palindrome" Program
// This is the student starting file.

import java.util.Scanner;

public class Lab08vst {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean notFinished = false;
		do {
			System.out.print("Enter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println();
			System.out.println("Entered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  "
					+ Palindrome.almostPal(str));
			System.out
					.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			String repeat = input.nextLine();
			notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
			System.out.println();
		} while (notFinished);
	}
}

class Palindrome {
	/*
	 * Precondition: s is an arbitrary String. Postcondition: The value of true
	 * is returned if s is a Palindrome, false otherwise. Note: This method is
	 * required for both the 80 point and the 100 point.
	 */
	public static boolean isPal(String s) {
		String s2 = "";
		for(int k = 0; k < s; k++){
		 	
		}
		if (s.equals(s2))
			
			return true; // This statement is provided to allow initial
							// compiling.
		else
			return false;
	}

	/*
	 * Precondition: s is a String of one character. Postcondition: The value of
	 * true is returned if s is a letter and false otherwise. Note: >>>>> This
	 * method is only completed for the 100 point version <<<<<
	 */
	private static boolean isLetter(String letter) {
		return true; // This statement is provided to allow initial compiling.
	}

	/*
	 * Precondition: s is an arbitrary String. Postcondition: All non-letter
	 * characters are removed from s. Note: This method is only completed for
	 * the 100 point version. private static String purge(String s) { return "";
	 * // This statement is provided to allow initial compiling. }
	 * 
	 * /* Precondition: s is an arbitrary String. Postcondition: After purging
	 * all non-letter characters from s, the value of true is returned if the
	 * resulting String is a Palindrome, false otherwise. Note: This method is
	 * only completed for the 100 point version.
	 */
	public static boolean almostPal(String s) {
		return true; // This statement is provided to allow initial compiling.
	}

}