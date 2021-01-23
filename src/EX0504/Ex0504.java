package EX0504;

import java.util.Scanner;

/**(Display an integer reversed) Write a method with the following
 *  header to display an integer in reverse order:
 *  public static void reverse(int number)For example, reverse(3456) displays 6543.
 *  Write a test program that prompts the user to enter an integer and displays its reversal.
 */

public class Ex0504 {

    public static void main(String[] args) {

        // Create a Scanner.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer.
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        // Display result.
        reverse(number);
    }

    /** Method that display reverse order of an integer. */
    public static void reverse(int number) {
        int reverse = 0;            // Initial is 0.
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse);
    }
}
