import java.util.Scanner;

public class Beecrowd1138 {

    public static int[] countDigits(int A, int B) {
        int[] digitCount = new int[10];

        for (int number = A; number <= B; number++) {
            String numStr = String.valueOf(number);
            for (char digit : numStr.toCharArray()) {
                digitCount[digit - '0']++;
            }
        }
        return digitCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (A == 0 && B == 0) break;

            int[] digitCount = countDigits(A, B);
            for (int count : digitCount) {
                System.out.print(count + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
