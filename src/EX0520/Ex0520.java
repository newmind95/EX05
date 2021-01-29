package EX0520;

import java.util.Scanner;

/** (Count the letters in a string)
 *  Write a method that counts the number of letters in a string using the following header:
 *  public static int countLetters(String s)Write a test program that prompts
 *  the user to enter a string and displays the num-ber of letters in the string.
 */

public class Ex0520 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a string.
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        // Display result.
        System.out.println("Number of letters in a string are: " + countLetters(s));
    }

    /** Method that counts the number of letters in a string. */
    public static int countLetters(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++ ){
            if (Character.isLetter(s.charAt(i)))
                sum++;        // Increment sum of letters.
        }
        return sum;
    }
}
