import java.util.Scanner;

public class KonversiAngkaRomawi {
    public static void main(String[] args) {
        // Inisialisasi scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Daftar nilai desimal dan simbol Romawi
        int[] nilaiDesimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolRomawi = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // Input angka desimal dari pengguna
        int angkaDesimal = inputAngkaDesimal(scanner);

        // Validasi input
        if (!validasiInput(angkaDesimal)) {
            System.out.println("Input tidak valid. Masukkan angka antara 1 dan 3999.");
        } else {
            // Konversi angka desimal ke angka Romawi
            String angkaRomawi = konversiKeRomawi(angkaDesimal, nilaiDesimal, simbolRomawi);
            // Menampilkan hasil konversi
            tampilkanHasil(angkaRomawi);
        }

        // Menutup scanner
        scanner.close();
    }

    // Method untuk mengambil input angka desimal dari pengguna
    public static int inputAngkaDesimal(Scanner scanner) {
        System.out.print("Masukkan angka desimal (1 s.d 3999): ");
        return scanner.nextInt();
    }

    // Method untuk validasi input
    public static boolean validasiInput(int angkaDesimal) {
        return angkaDesimal >= 1 && angkaDesimal <= 3999;
    }

    // Method untuk mengkonversi angka desimal ke angka Romawi
    public static String konversiKeRomawi(int angka, int[] nilaiDesimal, String[] simbolRomawi) {
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < nilaiDesimal.length; i++) {
            while (angka >= nilaiDesimal[i]) {
                hasil.append(simbolRomawi[i]);
                angka -= nilaiDesimal[i];
            }
        }

        return hasil.toString();
    }

    // Method untuk menampilkan hasil konversi
    public static void tampilkanHasil(String angkaRomawi) {
        System.out.println("Angka Romawi: " + angkaRomawi);
    }
}
