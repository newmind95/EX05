package EX0517;

import java.util.Scanner;

/**
 * (Display matrix of 0s and 1s)
 * Write a method that displays an n-by-n matrix using the following header:
 * public static void printMatrix(int n)Each element is 0 or 1,
 * which is generated randomly.
 * Write a test program that prompts the user to enter n and displays an n-by-n matrix.
 */

public class Ex0517 {

    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter n-by-n matrix number
        System.out.print("Enter n: ");
        int n = input.nextInt();
        // Display result
        printMatrix(n);
    }

    /** Method that displays an n-by-n matrix. */
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2));
            }
            System.out.println();
        }
    }
}
