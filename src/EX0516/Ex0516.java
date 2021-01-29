package EX0516;

/**
 * (Number of days in a year)
 * Write a method that returns the number of days in a year using the following header:
 * public static int numberOfDaysInAYear(int year)
 * Write a test program that displays the number of days in year from 2000 to 2020
 */

public class Ex0516 {

    /** Main method. */
    public static void main(String[] args) {
        // Display results
        for (int i = 2000; i <= 2020; i++) {
            System.out.println("Days of " + i + " is: " + numberOfDaysInAYear(i));
        }

    }

    /** Method that returns number of days in a year. */
    public static int numberOfDaysInAYear(int year) {
        int days = 365;
        // Check whether a number is a leap year.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            days++;
        } else {
            days--;
        }
        return days;
    }
}
