package Ex0502;

import java.util.Scanner;

/**
 * (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer.
 * Use the following method header:public static int sumDigits(long n)For example,
 * sumDigits(234) returns 9(2+3+4). (Hint: Use the % opera-tor to extract digits,
 * and the / operator to remove the extracted digit. For instance, to extract 4 from 234,
 * use 234 % 10(=4). To remove 4 from 234, use 234 / 10(=23).
 * Use a loop to repeatedly extract and remove the digit until all the digits are extracted.
 * Write a test program that prompts the user to enter an integer
 * and displays the sum of all its digits
 */

public class Ex0502 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer.
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        // Display result
        System.out.println(sumDigits(num));
    }

    /** Method that computes the sum of the digits in an integer. */
    public static int sumDigits(long n) {

        int sum = 0;             // Initial is 0
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
