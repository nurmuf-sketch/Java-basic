import java.util.Scanner;

public class TunjanganKeluarga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk kategori status pernikahan
        String[] kategoriStatus = {"Kawin", "Belum Kawin", "Cerai"};

        // Array untuk persentase tunjangan
        double[] persentaseTunjangan = {0.1, 0, 0};

        // Input status pernikahan
        System.out.print("Masukkan status pernikahan (Kawin, Belum Kawin, Cerai): ");
        String statusPernikahan = scanner.nextLine().trim();

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = Integer.parseInt(scanner.nextLine().trim());

        // Menghitung tunjangan keluarga
        int tunjangan = kalkulasiTunjanganKeluarga(statusPernikahan, gajiPokok, kategoriStatus, persentaseTunjangan);

        // Output hasil
        printResult(tunjangan);
    }

    // Function untuk menghitung tunjangan keluarga
    public static int kalkulasiTunjanganKeluarga(String statusPernikahan, int gajiPokok, String[] kategoriStatus, double[] persentaseTunjangan) {
        for (int i = 0; i < kategoriStatus.length; i++) {
            if (statusPernikahan.equalsIgnoreCase(kategoriStatus[i])) {
                return (int) (persentaseTunjangan[i] * gajiPokok);
            }
        }
        return 0; // Return 0 jika tidak ada kategori status yang cocok
    }

    // Function untuk mencetak hasil
    public static void printResult(int tunjangan) {
        System.out.println("Tunjangan Keluarga: " + tunjangan);
    }
}
