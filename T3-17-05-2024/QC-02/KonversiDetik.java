import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        // Inisialisasi scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Input jumlah detik dari pengguna
        System.out.print("Masukkan jumlah Bilangan Bulat: ");
        int bilBulat = scanner.nextInt();

        // Menghitung hari, jam, menit, dan detik
        int hari = hitungHari(bilBulat);
        int sisaDetik = bilBulat % (24 * 3600);
        int jam = hitungJam(sisaDetik);
        sisaDetik %= 3600;
        int menit = hitungMenit(sisaDetik);
        int detik = hitungDetik(sisaDetik);

        // Menampilkan hasil konversi
        tampilkanHasil(hari, jam, menit, detik);

        // Menutup scanner
        scanner.close();
    }

    // Method untuk menghitung jumlah hari
    public static int hitungHari(int bilBulat) {
        return bilBulat / (24 * 3600);
    }

    // Method untuk menghitung jumlah jam
    public static int hitungJam(int sisaDetik) {
        return sisaDetik / 3600;
    }

    // Method untuk menghitung jumlah menit
    public static int hitungMenit(int sisaDetik) {
        return (sisaDetik % 3600) / 60;
    }

    // Method untuk menghitung jumlah detik
    public static int hitungDetik(int sisaDetik) {
        return sisaDetik % 60;
    }

    // Method untuk menampilkan hasil konversi
    public static void tampilkanHasil(int hari, int jam, int menit, int detik) {
        System.out.println(hari);
        System.out.println(jam);
        System.out.println(menit);
        System.out.println(detik);
    }
}
