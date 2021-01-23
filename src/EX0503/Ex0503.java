package EX0503;

import java.util.Scanner;

/** (Palindrome integer) Write the methods with the following headers//
 * Return the reversal of an integer, i.e., reverse(456) returns 654 public static int reverse(int number)
 * Return true if number is a palindrome //public static boolean isPalindrome(int number)Use  the
 * reverse  method  to  implement  isPalindrome.  A  number  is  a  palin-drome
 * if its reversal is the same as itself.
 * Write a test program that prompts the user to enter an integer and reports whether
 * the integer is a palindrome.
 */


public class Ex0503 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer.
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(" Is not a palindrome.");
        }
    }

    /** Method that return the reversal of an integer. */
    public static int reverse(int number) {

        int reversed = 0;            // Initial is 0
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    /** Method that returns whether it is a palindrome or not. */
    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }
}
