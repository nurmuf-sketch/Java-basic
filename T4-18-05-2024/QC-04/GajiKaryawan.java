import java.util.Scanner;

public class GajiKaryawan {

    // UMK per kota
    static final String[] KOTA = {"Garut", "Bandung", "Jakarta", "Bekasi", "Bogor", "Palembang"};
    static final int[] UMK = {1961085, 3742276, 4453935, 4782935, 4330249, 3289409};

    // Posisi Jabatan dan tunjangan
    static final String[] POSISI = {"Admin", "Coordinator", "SPV", "Manager", "Sprinter", "Officer"};
    static final int[] TUNJANGAN_PEGAWAI = {200000, 500000, 700000, 1000000, 200000, 200000};

    // Gaji Pokok Berdasarkan Posisi dan Masa Kerja
    static final int[][] AMBANG_BATAS_MASA_KERJA = {
        {2},    // Admin
        {3},    // Coordinator
        {2, 5}, // SPV
        {3},    // Manager
        {},     // Sprinter
        {},     // Officer
    };

    static final double[][] PERSENTASE_GAJI_POKOK = {
        {1.0, 1.2},     // Admin
        {1.1, 1.3},     // Coordinator
        {1.25, 1.4, 1.5}, // SPV
        {1.5, 2.0},     // Manager
        {0.9},          // Sprinter
        {1.0},          // Officer
    };

    // Potongan
    static final double[] POTONGAN_PERSENTASE = {0.02, 0.02, 0.05};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String kota = scanner.nextLine().trim();
        String posisi = scanner.nextLine().trim();
        int masaKerja = Integer.parseInt(scanner.nextLine().trim());
        boolean menikah = Boolean.parseBoolean(scanner.nextLine().trim());

        // Logging untuk input
        System.out.println("Input: ");
        System.out.println("Kota: " + kota);
        System.out.println("Posisi: " + posisi);
        System.out.println("Masa Kerja: " + masaKerja);
        System.out.println("Menikah: " + menikah);

        try {
            // Hitung gaji pokok
            int umk = getUMK(kota);
            int gajiPokok = hitungGajiPokok(posisi, masaKerja, umk);

            // Hitung tunjangan
            int tunjanganKeluarga = hitungTunjanganKeluarga(gajiPokok, menikah);
            int tunjanganJabatan = hitungTunjanganJabatan(gajiPokok, masaKerja);
            int tunjanganPegawai = hitungTunjanganPegawai(posisi);

            // Hitung gaji kotor
            int gajiKotor = hitungGajiKotor(gajiPokok, tunjanganKeluarga, tunjanganJabatan, tunjanganPegawai);

            // Hitung potongan
            int potonganPensiun = hitungPotongan(gajiKotor, 0); // Pensiun
            int potonganBPJS = hitungPotongan(gajiKotor, 1); // BPJS
            int potonganPPH = hitungPotongan(gajiKotor, 2); // PPH

            // Hitung gaji bersih
            int gajiBersih = hitungGajiBersih(gajiKotor, potonganPensiun, potonganBPJS, potonganPPH);

            // Output
            System.out.println(gajiPokok);
            System.out.println(tunjanganKeluarga);
            System.out.println(tunjanganJabatan);
            System.out.println(tunjanganPegawai);
            System.out.println(gajiKotor);
            System.out.println(potonganPensiun);
            System.out.println(potonganBPJS);
            System.out.println(potonganPPH);
            System.out.println(gajiBersih);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static int getUMK(String kota) {
        for (int i = 0; i < KOTA.length; i++) {
            if (kota.equalsIgnoreCase(KOTA[i])) {
                return UMK[i];
            }
        }
        throw new IllegalArgumentException("Kota tidak valid: " + kota);
    }

    static int hitungGajiPokok(String posisi, int masaKerja, int umk) {
        System.out.println("Memeriksa posisi: " + posisi); // Logging tambahan
        for (int i = 0; i < POSISI.length; i++) {
            if (posisi.equalsIgnoreCase(POSISI[i])) {
                return (int)(umk * dapatkanPersentaseGajiPokok(masaKerja, AMBANG_BATAS_MASA_KERJA[i], PERSENTASE_GAJI_POKOK[i]));
            }
        }
        throw new IllegalArgumentException("Posisi tidak valid: " + posisi);
    }

    static double dapatkanPersentaseGajiPokok(int masaKerja, int[] ambangBatas, double[] persentase) {
        for (int i = 0; i < ambangBatas.length; i++) {
            if (masaKerja < ambangBatas[i]) {
                return persentase[i];
            }
        }
        return persentase[persentase.length - 1];
    }

    static int hitungTunjanganKeluarga(int gajiPokok, boolean menikah) {
        return menikah ? (int)(gajiPokok * 0.1) : 0;
    }

    static int hitungTunjanganJabatan(int gajiPokok, int masaKerja) {
        return (masaKerja > 4) ? (int)(gajiPokok * 0.05) : 0;
    }

    static int hitungTunjanganPegawai(String posisi) {
        for (int i = 0; i < POSISI.length; i++) {
            if (posisi.equalsIgnoreCase(POSISI[i])) {
                return TUNJANGAN_PEGAWAI[i];
            }
        }
        throw new IllegalArgumentException("Posisi tidak valid: " + posisi);
    }

    static int hitungGajiKotor(int gajiPokok, int tunjanganKeluarga, int tunjanganJabatan, int tunjanganPegawai) {
        return gajiPokok + tunjanganKeluarga + tunjanganJabatan + tunjanganPegawai;
    }

    static int hitungPotongan(int gajiKotor, int jenisPotongan) {
        return (int)(gajiKotor * POTONGAN_PERSENTASE[jenisPotongan]);
    }

    static int hitungGajiBersih(int gajiKotor, int potonganPensiun, int potonganBPJS, int potonganPPH) {
        return gajiKotor - potonganPensiun - potonganBPJS - potonganPPH;
    }
}
