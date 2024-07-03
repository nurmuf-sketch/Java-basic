import java.util.Scanner;

public class PrintPolaBilBul {
    public static void main(String[] args) {
        int n = readInput();
        int[][] pattern = generatePattern(n);
        printPattern(pattern);
    }

    // Metode untuk membaca input dari pengguna
    private static int readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat (1 ≤ N ≤ 10): ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    // Metode untuk menghasilkan pola berukuran N x N
    private static int[][] generatePattern(int n) {
        int[][] pattern = new int[n][];
        for (int i = 0; i < n; i++) {
            pattern[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pattern[i][j] = (int) Math.pow(2, i - j);
            }
        }
        return pattern;
    }

    // Metode untuk mencetak pola ke layar
    private static void printPattern(int[][] pattern) {
        for (int[] row : pattern) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
