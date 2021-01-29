package EX0619;

import java.util.Scanner;

/**
 * (TheMyTriangleclass)  Create  a  class  named  MyTriangle  that  contains  the  following two methods:
 * /** Return true if the sum of any two sides is
 *   greater than the third side.
 * public static boolean isValid(double side1, double side2, double side3)
 * /** Return the area of the triangle.
 * public static double area(double side1, double side2, double side3)
 * Write a test program that reads three sides for a triangle and
 * computes the area if the input is valid. Otherwise, it displays that the input is invalid.
 * The formula for computing the area of a triangle is given in Programming Exercise 2.19.
 */

public class Ex0619 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter three sides.1
        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        // Display results.
        System.out.println(isValid(side1,side2,side3) ?
                ("The area of triangle is: " + side1 + side2 + side3) : "Invalid input");
    }

    /** Return true if the sum of any two sides is
     * greater than the third side. */
    public static boolean isValid(
            double side1, double side2, double side3) {
        boolean isValidTriangle = side1 + side2 > side3 && side1 + side3 > side2 &&
                side2 + side3 > side1;
        return isValidTriangle;

    }

    /** Return the area of the triangle. */
    public static double area(
            double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
