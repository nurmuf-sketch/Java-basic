import java.util.Scanner;

public class Maksimal10Bilangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = cariNilaiMaksimal(numbers);
        System.out.println(max);

        scanner.close();
    }

    private static int cariNilaiMaksimal(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
