import java.util.Scanner;

public class LuasLingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jari-jari lingkaran dari pengguna
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        // Menghitung luas lingkaran
        double luasLingkaran = hitungLuasLingkaran(jariJari);

        // Menampilkan hasil luas lingkaran
        System.out.printf("Luas lingkaran dengan jari-jari %.2f: %.2f\n", jariJari, luasLingkaran);

        scanner.close();
    }

    // Method untuk menghitung luas lingkaran
    private static double hitungLuasLingkaran(double jariJari) {
        // Konstanta pi
        final double PI = 3.14;

        // Menghitung luas lingkaran
        double luas = PI * jariJari * jariJari;
        return luas;
    }
}
