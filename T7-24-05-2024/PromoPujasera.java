import java.util.Scanner;

public class PromoPujasera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah harga makanan/minuman dan tanggal lahir:");
        double harga = scanner.nextDouble();
        int tanggalLahir = scanner.nextInt();

        double totalBayar = hitungTotalBayar(harga, tanggalLahir);

        System.out.printf("%.2f\n", totalBayar);

        scanner.close();
    }

    // Method untuk menghitung total uang yang harus dibayar
    private static double hitungTotalBayar(double harga, int tanggalLahir) {
        double potongan = 0.02 * tanggalLahir * harga;
        double totalBayar = harga - potongan;

        // Minimal pembelian Rp 50.000 untuk mendapat potongan
        if (harga >= 50000) {
            return totalBayar;
        } else {
            return harga; // Jika tidak mencapai Rp 50.000, total bayar tetap harga awal
        }
    }
}
