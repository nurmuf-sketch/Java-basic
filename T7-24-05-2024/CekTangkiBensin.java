import java.util.Scanner;

public class CekTangkiBensin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input uang dan kapasitas tangki
        System.out.println("Masukkan uang (7600 <= uang <= 76000) dan kapasitas tangki (1 <= kapasitas <= 10):");
        int uang = scanner.nextInt();
        double kapasitas = scanner.nextDouble();

        // Menghitung jumlah bensin yang dibeli
        double bensinDibeli = hitungBensinDibeli(uang);

        // Menampilkan jumlah bensin yang dibeli
        System.out.printf("%.2f\n", bensinDibeli);

        // Memeriksa apakah kapasitas tangki mencukupi
        cekTangki(bensinDibeli, kapasitas);

        scanner.close();
    }

    // Method untuk menghitung jumlah bensin yang dibeli
    private static double hitungBensinDibeli(int uang) {
        double hargaPerLiter = 7600;
        return uang / hargaPerLiter;
    }

    // Method untuk memeriksa kapasitas tangki
    private static void cekTangki(double bensinDibeli, double kapasitas) {
        if (bensinDibeli > kapasitas) {
            System.out.println("Bensin Berlebih");
        }
    }
}
