import java.util.Scanner;

public class Beecrowd1170 {
    public static int calculateDays(double foodSupply) {
        int days = 0;
        while (foodSupply > 1) {
            foodSupply /= 2;
            days++;
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            double X = scanner.nextDouble();
            int days = calculateDays(X);
            System.out.println(days + " dias");
        }

        scanner.close();
    }
}
