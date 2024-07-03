import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class GajiKaryawan {

    // Constants for salary data
    static final String[] POSITIONS = {"Software Engineer", "Data Analyst", "UX Designer", "Project Manager", "QA Engineer"};
    static final String[] DIVISIONS = {"Surabaya", "Jakarta", "Bandung", "Medan", "Makassar"};
    static final double[][] GAJI_POKOK = {
            {8000000, 9000000, 7500000, 7200000, 8500000},
            {7000000, 8000000, 6500000, 6200000, 7500000},
            {7500000, 8500000, 7000000, 6800000, 8000000},
            {10000000, 11000000, 9500000, 9200000, 10500000},
            {7500000, 8500000, 7000000, 6800000, 8000000}
    };
    static final double[] TUNJANGAN_TRANSPORT = {1000000, 1500000, 1200000, 1100000, 1300000};
    static final double TUNJANGAN_MAKAN_PER_HARI = 50000;
    static final int JUMLAH_HARI_KERJA = 22;
    static final double PERSENTASE_BPJS = 0.03;
    static final double PERSENTASE_PPH = 0.05;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Posisi Karyawan: ");
        String posisi = input.nextLine().trim();

        System.out.print("Masukkan Divisi Karyawan: ");
        String divisi = input.nextLine().trim();

        // Get basic salary
        double gajiPokok = getGajiPokok(posisi, divisi);
        if (gajiPokok == -1) {
            System.out.println("Posisi atau divisi tidak valid.");
            return;
        }

        // Calculate allowances and deductions
        double tunjanganTransport = getTunjanganTransport(divisi);
        double tunjanganMakan = TUNJANGAN_MAKAN_PER_HARI * JUMLAH_HARI_KERJA;
        double tunjanganKesehatan = calculateTunjanganKesehatan(gajiPokok);
        double potonganBPJS = calculatePotonganBPJS(gajiPokok);
        double potonganPPH = calculatePotonganPPH(gajiPokok);

        // Calculate net salary
        double gajiBersih = calculateGajiBersih(gajiPokok, tunjanganTransport, tunjanganMakan, tunjanganKesehatan, potonganBPJS, potonganPPH);

        // Print the result
        System.out.println("Posisi: " + posisi);
        System.out.println("Divisi: " + divisi);
        System.out.println("Jumlah hari kerja dalam 1 bulan: " + JUMLAH_HARI_KERJA + " hari");
        System.out.println("Total Gaji Bersih: " + formatCurrency(gajiBersih));
    }

    public static String formatCurrency(double amount) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        return numberFormat.format(amount);
    }

    public static double getGajiPokok(String posisi, String divisi) {
        int posisiIndex = -1, divisiIndex = -1;

        for (int i = 0; i < POSITIONS.length; i++) {
            if (POSITIONS[i].equalsIgnoreCase(posisi)) {
                posisiIndex = i;
                break;
            }
        }

        for (int i = 0; i < DIVISIONS.length; i++) {
            if (DIVISIONS[i].equalsIgnoreCase(divisi)) {
                divisiIndex = i;
                break;
            }
        }

        if (posisiIndex != -1 && divisiIndex != -1) {
            return GAJI_POKOK[posisiIndex][divisiIndex];
        } else {
            return -1; // Indicate invalid input
        }
    }

    public static double getTunjanganTransport(String divisi) {
        for (int i = 0; i < DIVISIONS.length; i++) {
            if (DIVISIONS[i].equalsIgnoreCase(divisi)) {
                return TUNJANGAN_TRANSPORT[i];
            }
        }
        return 0;
    }

    public static double calculateTunjanganKesehatan(double gajiPokok) {
        return gajiPokok * 0.02;
    }

    public static double calculatePotonganBPJS(double gajiPokok) {
        return gajiPokok * PERSENTASE_BPJS;
    }

    public static double calculatePotonganPPH(double gajiPokok) {
        return gajiPokok * PERSENTASE_PPH;
    }

    public static double calculateGajiBersih(double gajiPokok, double tunjanganTransport, double tunjanganMakan, double tunjanganKesehatan, double potonganBPJS, double potonganPPH) {
        return gajiPokok + tunjanganTransport + tunjanganMakan + tunjanganKesehatan - potonganBPJS - potonganPPH;
    }
}
