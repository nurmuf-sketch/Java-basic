import java.util.Scanner;

public class MaksimalTigaBilangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.println("Masukkan tiga bilangan bulat:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Menentukan bilangan terbesar
        int max = cariNilaiMaksimal(num1, num2, num3);

        // Menampilkan hasil
        System.out.println("Bilangan terbesar adalah: " + max);

        scanner.close();
    }

    // Method untuk mencari nilai maksimal dari tiga bilangan
    private static int cariNilaiMaksimal(int a, int b, int c) {
        int max = a; // Anggap bilangan pertama sebagai nilai maksimal awal

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}
