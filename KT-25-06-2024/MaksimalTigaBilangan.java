import java.util.Scanner;

public class MaksimalTigaBilangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = cariNilaiMaksimal(num1, num2, num3);
        System.out.println(max);

        scanner.close();
    }

    private static int cariNilaiMaksimal(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}
