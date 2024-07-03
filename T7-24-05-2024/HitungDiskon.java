import java.util.Scanner;

public class HitungDiskon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input harga barang dan jumlah barang
        System.out.println("Masukkan harga barang:");
        double hargaBarang = scanner.nextDouble();
        System.out.println("Masukkan jumlah barang:");
        int jumlahBarang = scanner.nextInt();

        // Menghitung total harga setelah mendapat potongan
        double totalHarga = calculateTotalHarga(hargaBarang, jumlahBarang);

        // Menampilkan total harga
        System.out.printf("%.2f%n", totalHarga);

        scanner.close();
    }

    // Method untuk menghitung total harga setelah mendapat potongan
    private static double calculateTotalHarga(double hargaBarang, int jumlahBarang) {
        double totalHarga = hargaBarang * jumlahBarang;

        // Jika jumlah barang adalah kelipatan 3 dan 4, dapatkan diskon 15%
        if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0) {
            totalHarga *= 0.85; // Diskon 15%
        }

        return totalHarga;
    }
}
