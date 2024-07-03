import java.util.Scanner;

public class ParkiranMall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();

        // Deklarasi Untuk Validasi Input Lama Parkir 
        if (lamaParkir <= 0 || lamaParkir > 24) {
            System.out.println("Input Error!!!");
            scanner.close();
            return;
        }

        // Hitung biaya parkir berdasarkan jenis kendaraan
        int totalBayar = hitungBiayaParkir(jenisKendaraan, lamaParkir);

        // Tampilkan hasil
        if (totalBayar == -1) {
            System.out.println("Input Error!!!");
        } else {
            System.out.println(totalBayar);
        }

        scanner.close();
    }

    public static int hitungBiayaParkir(int jenisKendaraan, int lamaParkir) {
        int jamAwal;
        int jamPenalti;
        int jamMax;

        switch (jenisKendaraan) {
            case 1: // Mobil
                jamAwal = 5000;
                jamPenalti = 2000;
                jamMax = 25000;
                break;
            case 2: // Motor
                jamAwal = 2000;
                jamPenalti = 1000;
                jamMax = 10000;
                break;
            case 3: // Box
                jamAwal = 10000;
                jamPenalti = 5000;
                jamMax = 50000;
                break;
            case 4: // Bus
                jamAwal = 25000;
                jamPenalti = 5000;
                jamMax = 75000;
                break;
            default:
                return -    1; // Menandakan input error
        }

        int totalBayar = jamAwal + (lamaParkir - 1) * jamPenalti;

        return Math.min(totalBayar, jamMax);
    }
}
