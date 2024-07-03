import java.util.Scanner;

public class ReamurToKelvin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca suhu dalam Reamur dari pengguna
        System.out.print("Masukkan suhu dalam Reamur: ");
        double suhuReamur = scanner.nextDouble();

        // Mengonversi suhu dari Reamur ke Kelvin
        double suhuKelvin = konversiReamurKeKelvin(suhuReamur);

        // Menampilkan hasil konversi
        System.out.printf("Hasil konversi ke Kelvin: %.2f\n", suhuKelvin);

        scanner.close();
    }

    // Method untuk mengonversi suhu dari Reamur ke Kelvin
    private static double konversiReamurKeKelvin(double suhuReamur) {
        // Menghitung suhu dalam Kelvin
        double suhuKelvin = suhuReamur * 1.25 + 273;
        return suhuKelvin;
    }
}
