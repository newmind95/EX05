package Ex0501;

/**
 * Math:  pentagonal  numbers)  A  pentagonal  number  is  defined  as
 * n(3n–1)/2  for  n=1, 2,  . . ., and so on. Therefore,
 * the first few numbers are 1, 5, 12, 22, . . . .
 * Write a method with the following header that returns a pentagonal number:
 * public static int getPentagonalNumber(int n)
 * Write  a  test  program  that  uses  this  method  to  display  the  first  100  pentagonal
 * numbers with 10 numbers on each line.
 */

public class Ex0501 {

    public static void main(String[] args) {

        final int NUMBER_OF_LINE = 10;         // Initial is 10
        int count = 0;                    // Initial is 0

        for (int i = 1; i <= 100; i++) {
            count++;
            if (count % NUMBER_OF_LINE == 0) {
                System.out.println(getPentagonalNumber(i));
            } else {
                System.out.print(getPentagonalNumber(i) + " ");
            }
        }
    }

    /** Method that returns pentagonal number. */
    public static int getPentagonalNumber(int n) {
        return (n * (n * 3 - 1) / 2);
    }
}
