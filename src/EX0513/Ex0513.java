package EX0513;

public class Ex0513 {

    /** Main method. */
    public static void main(String[] args) {
        // Display table.
        System.out.println("" +
                "i          m(i)" +
                "\n------------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-5d",i);
            System.out.printf("%15.4f\n", sumSeries(i));
        }
    }

    /** Method to compute series. */
    public static double sumSeries(double number ) {
        double sum = 0;
        for (double i = 1; i <= number; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }
}
