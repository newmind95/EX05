package EX0514;

public class Ex0514 {

    public static void main(String[] args) {

        // Display header
        System.out.println("i               m(i)");
        for (int i = 1; i <= 901; i+=100) {
            for (double j = 4.0; j >= Math.PI; j++) {
                System.out.printf("%-10d", i);
                System.out.printf("%10.4f%n", sumSeries(j));
            }
        }

    }

    public static double sumSeries(double num) {
        double sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += 4 * i / (i + 1);
        }
        return sum;
    }
}
