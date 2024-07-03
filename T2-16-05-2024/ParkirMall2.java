import java.util.Scanner;

public class ParkirMall2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input user
        String jenisKendaraan = input.nextLine();
        int lamaParkir = Integer.parseInt(input.nextLine());
        String jenisMember = input.nextLine();
        input.close();
        
        // Deklarasi data
        String[] jenisKendaraanList = {"Mobil", "Motor", "Box", "Bus", "Sepeda"};
        int[] listTarifParkirJamPertama = {5000, 2000, 10000, 25000, 1000};
        int[] listTarifPerJam = {2000, 1000, 5000, 5000, 500};
        int[] listMaksimalTarif = {25000, 10000, 50000, 75000, 5000};
        
        int minLamaParkir = 1;
        int maksLamaParkir = 24;
        
        // Validasi lama parkir
        if (lamaParkir >= minLamaParkir && lamaParkir <= maksLamaParkir) {
            int tarifJamPertama = getTarifJamPertamaWithMember(jenisKendaraan, jenisMember, jenisKendaraanList, listTarifParkirJamPertama);
            int tarifPerjam = getTarifPerJam(jenisKendaraan, jenisKendaraanList, listTarifPerJam);
            int maksimalTarif = getTarifMaksimal(jenisKendaraan, jenisKendaraanList, listMaksimalTarif);
            int biayaParkir = hitungTarifParkir(lamaParkir, tarifJamPertama, tarifPerjam, maksimalTarif);
            System.out.println(biayaParkir);
        } else {
            System.out.println("Input Error!!!");
        }
    }
    
    public static int getTarifJamPertamaWithMember(String jenisKendaraan, String jenisMember, String[] jenisKendaraanList, int[] listTarifParkirJamPertama) {
        int index = getIndex(jenisKendaraan, jenisKendaraanList);
        if (index == -1) {
            return 0;
        }
        int tarifJamPertama = listTarifParkirJamPertama[index];
        int potongan = getPersentasePotonganTarifJamPertama(jenisMember);
        return tarifJamPertama - (tarifJamPertama * potongan / 100);
    }

    public static int getPersentasePotonganTarifJamPertama(String jenisMember) {
        switch (jenisMember.toLowerCase()) {
            case "gold":
                return 100;
            case "silver":
                return 50;
            case "bronze":
                return 20;
            case "non member":
                return 0;
            default:
                return 0;
        }
    }

    public static int getTarifPerJam(String jenisKendaraan, String[] jenisKendaraanList, int[] listTarifPerJam) {
        int index = getIndex(jenisKendaraan, jenisKendaraanList);
        if (index == -1) {
            return 0;
        }
        return listTarifPerJam[index];
    }

    public static int getTarifMaksimal(String jenisKendaraan, String[] jenisKendaraanList, int[] listMaksimalTarif) {
        int index = getIndex(jenisKendaraan, jenisKendaraanList);
        if (index == -1) {
            return 0;
        }
        return listMaksimalTarif[index];
    }

    public static int getIndex(String jenisKendaraan, String[] jenisKendaraanList) {
        for (int i = 0; i < jenisKendaraanList.length; i++) {
            if (jenisKendaraanList[i].equalsIgnoreCase(jenisKendaraan)) {
                return i;
            }
        }
        return -1;
    }

    public static int hitungTarifParkir(int lamaParkir, int tarifJamPertama, int tarifPerjam, int maksimalTarif) {
        int totalBayar = tarifJamPertama;
        if (lamaParkir > 1) {
            totalBayar += (lamaParkir - 1) * tarifPerjam;
        }
        if (lamaParkir > 8) {
            totalBayar -= 5000;
        }
        return Math.min(totalBayar, maksimalTarif);
    }
}
