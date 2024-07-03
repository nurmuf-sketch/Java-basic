import java.util.Scanner;

public class Pola3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] pattern = generatePattern(N);
        printPattern(pattern);
    }

    private static int[][] generatePattern(int N) {
        int[][] pattern = new int[N][];
        int startNumber = 1;
        int count = N;

        for (int i = 0; i < N; i++) {
            pattern[i] = new int[count];
            for (int j = 0; j < count; j++) {
                pattern[i][j] = startNumber++;
            }
            count--;
        }

        return pattern;
    }

    private static void printPattern(int[][] pattern) {
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
                if (j < pattern[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
