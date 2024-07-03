import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        String hasil = cekGanjilGenap(X);
        System.out.println(hasil);

        scanner.close();
    }
    private static String cekGanjilGenap(int X) {
        if (X % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }
    }
}
