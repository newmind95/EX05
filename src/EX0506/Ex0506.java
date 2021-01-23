package EX0506;

import java.util.Scanner;

/**
 * (Sort three numbers) Write a method with the following header to display three numbers
 * in increasing order:public static void displaySortedNumbers(double num1, double num2, double num3)
 * Write a test program that prompts the user to enter
 * three numbers and invokes the method to display them in increasing order.
 */

public class Ex0506 {

    /** Main method. */
    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers:\n");
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        // Display result.
        displaySortedNumbers(num1, num2, num3);
    }

    /** Method to display sorted numbers. */
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp = 0;           // Initial is 0.
        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num2 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        } if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
