import java.util.Scanner;

public class ParkirMalamMinggu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jenis kendaraan dan lama waktu parkir
        System.out.println("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor):");
        int jenisKendaraan = scanner.nextInt();
        System.out.println("Masukkan lama waktu parkir (jam):");
        int lamaParkir = scanner.nextInt();

        // Memanggil method untuk menghitung biaya parkir
        int biayaParkir = calculateParkingFee(jenisKendaraan, lamaParkir);

        // Menampilkan biaya parkir atau pesan "disegel"
        if (biayaParkir == -1) {
            System.out.println("disegel");
        } else {
            System.out.println(biayaParkir);
        }

        scanner.close();
    }

    // Method untuk menghitung biaya parkir
    private static int calculateParkingFee(int jenisKendaraan, int lamaParkir) {
        // Biaya parkir per jam
        int biayaPerJam;
        if (jenisKendaraan == 1) { // Mobil
            biayaPerJam = 1500;
        } else { // Motor
            biayaPerJam = 1000;
        }

        // Menghitung biaya parkir dasar
        int biayaTotal = lamaParkir * biayaPerJam;

        // Menambahkan biaya tambahan jika melebihi 5 jam
        if (lamaParkir > 5) {
            biayaTotal += (lamaParkir - 5) * 500;
        }

        // Cek apakah harus disegel
        if (lamaParkir > 8) {
            return -1; // Kendaraan harus disegel
        }

        return biayaTotal;
    }
}
