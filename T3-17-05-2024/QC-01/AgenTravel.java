import java.util.Scanner;

public class AgenTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar bus dengan kapasitas dan harga
        int[] kapasitas = {60, 45, 32, 18, 12};
        int[] harga = {2300000, 2000000, 1800000, 1500000, 1300000};

        // Input jumlah penumpang
        System.out.print("Masukkan jumlah penumpang: ");
        int n = scanner.nextInt();

        // Menghitung harga termurah untuk n penumpang
        int hargaTermurah = hitungHargaTermurah(n, kapasitas, harga);

        // Output hasil
        System.out.println(hargaTermurah);
    }

    public static int hitungHargaTermurah(int n, int[] kapasitas, int[] harga) {
        int minHarga = Integer.MAX_VALUE;

        // Gunakan kombinasi bus untuk menemukan harga termurah
        for (int i = 0; i < kapasitas.length; i++) {
            int totalHarga = 0;
            int penumpangTersisa = n;
            
            // Hitung jumlah bus yang diperlukan untuk kapasitas saat ini
            while (penumpangTersisa > 0) {
                int jumlahBus = (int) Math.ceil((double) penumpangTersisa / kapasitas[i]);
                totalHarga += jumlahBus * harga[i];
                penumpangTersisa -= jumlahBus * kapasitas[i];
                
                // Jika harga total sudah lebih besar dari minHarga, break untuk efisiensi
                if (totalHarga >= minHarga) break;
            }
            
            // Update minHarga jika menemukan total harga yang lebih murah
            if (totalHarga < minHarga) {
                minHarga = totalHarga;
            }
        }

        return minHarga;
    }
}
