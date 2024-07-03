import java.util.Scanner;

public class MembeliBensin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jenis bensin yang akan dibeli (1 untuk Pertamax, 2 untuk Premium)
        System.out.println("Masukkan jenis bensin (1 untuk Pertamax, 2 untuk Premium):");
        int jenisBensin = scanner.nextInt();

        // Membaca jumlah liter bensin yang dibeli
        System.out.println("Masukkan jumlah liter bensin yang dibeli:");
        double jumlahLiter = scanner.nextDouble();

        // Menghitung total biaya yang harus dibayar
        double totalBiaya = hitungTotalBiaya(jenisBensin, jumlahLiter);

        // Menampilkan total biaya dengan format dua angka di belakang koma
        System.out.printf("Total biaya yang harus dibayar: %.2f\n", totalBiaya);

        scanner.close();
    }

    // Method untuk menghitung total biaya berdasarkan jenis bensin dan jumlah liter
    private static double hitungTotalBiaya(int jenisBensin, double jumlahLiter) {
        double hargaPerLiter = 0.0;

        // Menentukan harga per liter berdasarkan jenis bensin
        if (jenisBensin == 1) {
            hargaPerLiter = 9000.0; // Harga Pertamax per liter
        } else if (jenisBensin == 2) {
            hargaPerLiter = 7600.0; // Harga Premium per liter
        }

        // Menghitung total biaya
        double totalBiaya = jumlahLiter * hargaPerLiter;

        return totalBiaya;
    }
}
