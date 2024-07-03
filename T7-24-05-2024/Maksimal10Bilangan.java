import java.util.Scanner;

public class Maksimal10Bilangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.println("Masukkan 10 buah bilangan integer:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Menentukan bilangan terbesar
        int max = cariNilaiMaksimal(numbers);

        // Menampilkan hasil
        System.out.println("Bilangan terbesar adalah: " + max);

        scanner.close();
    }

    // Method untuk mencari nilai maksimal dalam array
    private static int cariNilaiMaksimal(int[] arr) {
        int max = arr[0]; // Anggap elemen pertama sebagai nilai maksimal awal

        // Loop untuk mencari nilai maksimal
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
