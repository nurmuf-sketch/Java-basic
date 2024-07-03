import java.util.Scanner;

public class GanjilDuaDimensi {

    public static void main(String[] args) {
        int[][] X = new int[4][4];

        inputData(X);

        int countGanjil = hitungGanjil(X);
        System.out.println(countGanjil);
    }

    private static void inputData(int[][] X) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                X[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    private static int hitungGanjil(int[][] X) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (X[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
