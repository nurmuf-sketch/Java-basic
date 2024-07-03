import java.util.Scanner;

public class BiayaParkir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] biayaAwal = {2000, 1000};
        int[] biayaPerJam = {1000, 500};

        int jenisKendaraan = scanner.nextInt() - 1;

        int lamaParkir = scanner.nextInt();
        int biayaParkir = hitungBiayaParkir(jenisKendaraan, lamaParkir, biayaAwal, biayaPerJam);

        System.out.println(biayaParkir);

        scanner.close();
    }

    private static int hitungBiayaParkir(int jenisKendaraan, int lamaParkir, int[] biayaAwal, int[] biayaPerJam) {
        if (lamaParkir <= 0) {
            throw new IllegalArgumentException("Lama parkir tidak valid");
        } else if (lamaParkir == 1) {
            return biayaAwal[jenisKendaraan];
        } else {
            return biayaAwal[jenisKendaraan] + biayaPerJam[jenisKendaraan] * (lamaParkir - 1);
        }
    }
}
