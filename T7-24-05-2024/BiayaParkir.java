import java.util.Scanner;

public class BiayaParkir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk jenis kendaraan (indeks 0 untuk mobil, indeks 1 untuk motor)
        int[] biayaAwal = {2000, 1000}; // biaya awal parkir
        int[] biayaPerJam = {1000, 500}; // biaya per jam setelah jam pertama

        // Input jenis kendaraan (1 untuk mobil, 2 untuk motor)
        System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor): ");
        int jenisKendaraan = scanner.nextInt() - 1; // mengubah 1 atau 2 menjadi indeks array

        // Input lama parkir dalam jam
        System.out.print("Masukkan lama waktu parkir dalam jam: ");
        int lamaParkir = scanner.nextInt();

        // Menghitung biaya parkir
        int biayaParkir = hitungBiayaParkir(jenisKendaraan, lamaParkir, biayaAwal, biayaPerJam);

        // Output hasil biaya parkir
        System.out.println("Total biaya parkir: " + biayaParkir + " rupiah");

        scanner.close();
    }

    // Method untuk menghitung biaya parkir berdasarkan jenis kendaraan dan lama parkir
    private static int hitungBiayaParkir(int jenisKendaraan, int lamaParkir, int[] biayaAwal, int[] biayaPerJam) {
        if (lamaParkir <= 0) {
            throw new IllegalArgumentException("Lama parkir tidak valid");
        } else if (lamaParkir == 1) {
            return biayaAwal[jenisKendaraan];
        } else {
            return biayaAwal[jenisKendaraan] + biayaPerJam[jenisKendaraan] * (lamaParkir - 1);
        }
    }
}
