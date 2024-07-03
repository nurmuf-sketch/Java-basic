import java.util.Scanner;

public class LuasNLingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input jari-jari dan jumlah lingkaran dari pengguna
        System.out.print("Masukkan jari-jari lingkaran dan jumlah N: ");
        double jariJari = scanner.nextDouble();
        int N = scanner.nextInt();

        // Menghitung jumlah luas N buah lingkaran identik
        double totalLuas = hitungJumlahLuasNLingkaran(jariJari, N);

        // Menampilkan hasil jumlah luas N buah lingkaran
        System.out.printf("Jumlah luas %d buah lingkaran dengan jari-jari %.2f: %.2f\n", N, jariJari, totalLuas);

        scanner.close();
    }

    // Method untuk menghitung jumlah luas N buah lingkaran identik
    private static double hitungJumlahLuasNLingkaran(double jariJari, int N) {
        // Konstanta pi
        final double PI = 3.14;

        // Menghitung luas lingkaran
        double luasLingkaran = PI * jariJari * jariJari;

        // Menghitung total luas N buah lingkaran
        double totalLuas = N * luasLingkaran;
        return totalLuas;
    }
}
