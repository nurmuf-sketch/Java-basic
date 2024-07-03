import java.util.Scanner;

public class VolumeTabung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jari-jari tabung (R) dan tinggi tabung (t):");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();

        double volume = calculateVolume(radius, height);
        System.out.printf("%.2f\n", volume);

        scanner.close();
    }

    // Method untuk menghitung volume tabung
    private static double calculateVolume(double radius, double height) {
        final double PI = 3.14;
        double volume = PI * radius * radius * height;
        return volume;
    }
}
