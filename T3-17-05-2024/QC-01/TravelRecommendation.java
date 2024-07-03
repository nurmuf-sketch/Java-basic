import java.util.Scanner;

public class TravelRecommendation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah orang, jumlah hari, dan budget
        System.out.print("Masukkan jumlah orang, jumlah hari, dan budget (dipisahkan oleh Spasi tiap input nya): ");
        int jumlahOrang = scanner.nextInt(); // jumlah orang
        int jumlahHari = scanner.nextInt(); // jumlah hari
        int budget = scanner.nextInt(); // budget

        // Daftar destinasi wisata dan biaya yang terkait
        String[] destinasi = {"Lombok", "Bangkok", "Singapura", "Tokyo"};
        int[] biayaTransportasiPP = {2170000, 3780000, 1200000, 4760000};
        int[] biayaAkomodasiHotel = {125000, 155000, 170000, 170000};
        int[] biayaTurKuliner = {75000, 55000, 85000, 105000};
        int[] biayaTurTambahan = {250000, 300000, 360000, 325000}; // Shopping tour, Universal studio, Ski

        // Menghitung total biaya untuk setiap destinasi
        int[] totalBiaya = hitungTotalBiayaUntukSemuaDestinasi(jumlahOrang, jumlahHari, biayaTransportasiPP, biayaAkomodasiHotel, biayaTurKuliner, biayaTurTambahan, destinasi.length);

        // Mencari destinasi yang paling mendekati budget
        String destinasiRekomendasi = cariDestinasiRekomendasi(totalBiaya, budget, destinasi);

        // Menampilkan destinasi wisata dan total budget yang direkomendasikan
        tampilkanHasil(destinasiRekomendasi, totalBiaya, destinasi);

        scanner.close();
    }

    // Method untuk menghitung total biaya untuk setiap destinasi
    public static int hitungTotalBiaya(int jumlahOrang, int jumlahHari, int biayaTransportasiPP, int biayaAkomodasiHotel, int biayaTurKuliner, int biayaTurTambahan) {
        return jumlahOrang * biayaTransportasiPP + jumlahOrang * biayaAkomodasiHotel * jumlahHari + jumlahOrang * biayaTurKuliner * jumlahHari + jumlahOrang * biayaTurTambahan;
    }

    // Method untuk menghitung total biaya untuk semua destinasi
    public static int[] hitungTotalBiayaUntukSemuaDestinasi(int jumlahOrang, int jumlahHari, int[] biayaTransportasiPP, int[] biayaAkomodasiHotel, int[] biayaTurKuliner, int[] biayaTurTambahan, int destinasiLength) {
        int[] totalBiaya = new int[destinasiLength];
        for (int i = 0; i < destinasiLength; i++) {
            totalBiaya[i] = hitungTotalBiaya(jumlahOrang, jumlahHari, biayaTransportasiPP[i], biayaAkomodasiHotel[i], biayaTurKuliner[i], biayaTurTambahan[i]);
        }
        return totalBiaya;
    }

    // Method untuk mencari destinasi yang paling mendekati budget
    public static String cariDestinasiRekomendasi(int[] totalBiaya, int budget, String[] destinasi) {
        int selisihTerkecil = Integer.MAX_VALUE;
        String destinasiRekomendasi = "";
        for (int i = 0; i < destinasi.length; i++) {
            if (totalBiaya[i] <= budget) {
                int selisih = Math.abs(totalBiaya[i] - budget);
                if (selisih < selisihTerkecil) {
                    selisihTerkecil = selisih;
                    destinasiRekomendasi = destinasi[i];
                }
            }
        }
        return destinasiRekomendasi;
    }

    // Method untuk menampilkan hasil
    public static void tampilkanHasil(String destinasiRekomendasi, int[] totalBiaya, String[] destinasi) {
        if (!destinasiRekomendasi.isEmpty()) {
            int biayaRekomendasi = totalBiaya[dapatkanIndeks(destinasi, destinasiRekomendasi)];
            System.out.println(destinasiRekomendasi + " " + biayaRekomendasi);
        } else {
            System.out.println("Need more budget");
        }
    }

    // Method untuk mendapatkan indeks dari array
    public static int dapatkanIndeks(String[] array, String nilai) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(nilai)) {
                return i;
            }
        }
        return -1; // Jika tidak ditemukan
    }
}
