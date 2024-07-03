import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan bulat X
        System.out.print("Masukkan bilangan bulat X (0 < X < 100): ");
        int X = scanner.nextInt();

        // Menentukan apakah X ganjil atau genap
        String hasil = cekGanjilGenap(X);

        // Menampilkan hasil
        System.out.println(hasil);

        scanner.close();
    }

    // Method untuk menentukan apakah suatu bilangan ganjil atau genap
    private static String cekGanjilGenap(int X) {
        if (X % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }
    }
}
