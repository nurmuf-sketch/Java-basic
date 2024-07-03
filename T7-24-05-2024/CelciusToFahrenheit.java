import java.util.Scanner;

public class CelciusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca suhu dalam Celcius dari pengguna
        System.out.print("Masukkan suhu dalam Celcius: ");
        double suhuCelcius = scanner.nextDouble();

        // Mengonversi suhu dari Celcius ke Fahrenheit
        double suhuFahrenheit = konversiCelciusKeFahrenheit(suhuCelcius);

        // Menampilkan hasil konversi
        System.out.printf("Hasil konversi ke Fahrenheit: %.2f\n", suhuFahrenheit);

        scanner.close();
    }

    // Method untuk mengonversi suhu dari Celcius ke Fahrenheit
    private static double konversiCelciusKeFahrenheit(double suhuCelcius) {
        // Menghitung suhu dalam Fahrenheit
        double suhuFahrenheit = suhuCelcius * 1.8 + 32;
        return suhuFahrenheit;
    }
}
