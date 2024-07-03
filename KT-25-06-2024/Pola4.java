import java.util.Scanner;

public class Pola4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int K = scanner.nextInt();

        int[][] pattern = new int[B][K];

        int value = 1;
        for (int j = 0; j < K; j++) {
            if (j % 2 == 0) {
                // Colom genap (1, 3, 5, ...)
                for (int i = 0; i < B; i++) {
                    pattern[i][j] = value++;
                }
            } else {
                // Colom ganjil (2, 4, 6, ...)
                for (int i = B - 1; i >= 0; i--) {
                    pattern[i][j] = value++;
                }
            }
        }

        // Cetak pola
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < K; j++) {
                System.out.print(pattern[i][j]);
                if (j < K - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
