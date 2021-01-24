package EX0510;

/**
 * (Use the isPrimeMethod) Listing 6.7, PrimeNumberMethod.java,
 * provides the isPrime(int number) method for testing whether a number is prime.
 * Use this method to find the number of prime numbers less than 10000.
 */

public class Ex0510 {

    /** Main method. */
    public static void main(String[] args) {
        System.out.println("The first 1000 prime numbers are: ");
        primeNumbers(1000);
    }

    /** Method to print prime numbers. */
    public static void primeNumbers(int numberOfPrimes) {
        final int NUMBER_PER_LINE = 10;       // Display ten per line.
        int count = 0;            // Initial is zero.
        int number = 2;           // Number to be tested for primeness.
        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_PER_LINE == 0) {
                    System.out.printf("%-5s\n", number);
                } else {
                    System.out.printf("%-5s", number);
                }
            }
            number++;
        }
    }

    /** Method to check whether it is prime number. */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
