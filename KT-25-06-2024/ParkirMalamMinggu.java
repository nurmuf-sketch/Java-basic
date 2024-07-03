import java.util.Scanner;

public class ParkirMalamMinggu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();

        int biayaParkir = calculateParkingFee(jenisKendaraan, lamaParkir);

        if (biayaParkir == -1) {
            System.out.println("disegel");
        } else {
            System.out.println(biayaParkir);
        }

        scanner.close();
    }

    private static int calculateParkingFee(int jenisKendaraan, int lamaParkir) {
        int biayaPerJam;
        if (jenisKendaraan == 1) {
            biayaPerJam = 1500;
        } else {
            biayaPerJam = 1000;
        }

        int biayaTotal = lamaParkir * biayaPerJam;
        if (lamaParkir > 5) {
            biayaTotal += (lamaParkir - 5) * 500;
        }

        if (lamaParkir > 8) {
            return -1;
        }

        return biayaTotal;
    }
}
