import java.util.Scanner;
/*
 * Created By   : Nur Muflikhun
 * Create At    : 16.02 Kamis, 23 Mei 2024
 */

public class GajiPNS {

    static final double[][][] gajiPokok = {
            // Golongan I
            {
                    {1560800, 1560800, 1610000, 1610000, 1660700, 1660700, 1713000, 1713000, 1766900, 1766900, 1822600, 1822600, 1880000, 1880000, 1939200, 1939200, 2000300, 2000300, 2063300, 2063300, 2128300, 2128300, 2195300, 2195300, 2264400, 2264400, 2335800, 2335800},
                    {1560800, 1560800, 1610000, 1704500, 1704500, 1758200, 1758200, 1813600, 1813600, 1870700, 1870700, 1929600, 1929600, 1990400, 1990400, 2053100, 2053100, 2117700, 2117700, 2184400, 2184400, 2253200, 2253200, 2324200, 2324200, 2397400, 2397400, 2472900},
                    {1560800, 1560800, 1610000, 1776600, 1776600, 1832600, 1832600, 1890300, 1890300, 1949800, 1949800, 2011200, 2011200, 2074600, 2074600, 2139900, 2139900, 2207300, 2207300, 2276800, 2276800, 2348500, 2348500, 2422500, 2422500, 2498800, 2498800, 2557500},
                    {1560800, 1560800, 1610000, 1851800, 1851800, 1910100, 1910100, 1970200, 1970200, 2032300, 2032300, 2096300, 2096300, 2162300, 2162300, 2230400, 2230400, 2300700, 2300700, 2373100, 2373100, 2447900, 2447900, 2525000, 2525000, 2604500, 2604500, 2686500}
            },
            // Golongan II
            {
                    {2022200, 2054100, 2054100, 2118800, 2118800, 2185500, 2185500, 2254300, 2254300, 2325300, 2325300, 2398600, 2398600, 2474100, 2474100, 2552000, 2552000, 2632400, 2632400, 2715300, 2715300, 2800800, 2800800, 2889100, 2889100, 2980000, 2980000, 3073900, 3073900, 3170700, 3170700, 3270600, 3270600, 3373600},
                    {2022200, 2054100, 2054100, 2208400, 2208400, 2277900, 2277900, 2349700, 2349700, 2423700, 2423700, 2500000, 2500000, 2578800, 2578800, 2660000, 2660000, 2743800, 2743800, 2830200, 2830200, 2919300, 2919300, 3011200, 3011200, 3106100, 3106100, 3203900, 3203900, 3304800, 3304800, 3408900, 3408900, 3516300},
                    {2022200, 2054100, 2054100, 2301800, 2301800, 2374300, 2374300, 2449100, 2449100, 2526200, 2526200, 2605800, 2605800, 2687800, 2687800, 2772500, 2772500, 2859800, 2859800, 2949900, 2949900, 3042800, 3042800, 3138600, 3138600, 3237500, 3237500, 3339400, 3339400, 3444600, 3444600, 3553100, 3553100, 3665000},
                    {2022200, 2054100, 2054100, 2399200, 2399200, 2474700, 2474700, 2552700, 2552700, 2633100, 2633100, 2716000, 2716000, 2801500, 2801500, 2889800, 2889800, 2980800, 2980800, 3074700, 3074700, 3171500, 3171500, 3271400, 3271400, 3374400, 3374400, 3480700, 3480700, 3590300, 3590300, 3703400, 3703400, 3820000}
            },
            // Golongan III
            {
                    {2579400, 2579400, 2660700, 2660700, 2744500, 2744500, 2830900, 2830900, 2920100, 2920100, 3012000, 3012000, 3106900, 3106900, 3204700, 3204700, 3305700, 3305700, 3409800, 3409800, 3517200, 3517200, 3627900, 3627900, 3742200, 3742200, 3860100, 3860100, 3981600, 3981600, 4107000, 4107000, 4236400},
                    {2688500, 2688500, 2773200, 2773200, 2860500, 2860500, 2950600, 2950600, 3043600, 3043600, 3139400, 3139400, 3238300, 3238300, 3340300, 3340300, 3445500, 3445500, 3554000, 3554000, 3665900, 3665900, 3781400, 3781400, 3900500, 3900500, 4023300, 4023300, 4150100, 4150100, 4280800, 4280800, 4415600},
                    {2802300, 2802300, 2890500, 2890500, 2981500, 2981500, 3075500, 3075500, 3172300, 3172300, 3272200, 3272200, 3375300, 3375300, 3481600, 3481600, 3591200, 3591200, 3704300, 3704300, 3821000, 3821000, 3941400, 3941400, 4065500, 4065500, 4193500, 4193500, 4325600, 4325600, 4461800, 4461800, 4602400},
                    {2920800, 2920800, 3012800, 3012800, 3107700, 3107700, 3205500, 3205500, 3306500, 3306500, 3410600, 3410600, 3518100, 3518100, 3628900, 3628900, 3743100, 3743100, 3861000, 3861000, 3982600, 3982600, 4108100, 4108100, 4237500, 4237500, 4370900, 4370900, 4508600, 4508600, 4650600, 4650600, 4797000}
            },
            // Golongan IV
            {
                    {3044300, 3044300, 3140200, 3140200, 3239100, 3239100, 3341100, 3341100, 3446400, 3446400, 3554900, 3554900, 3666900, 3666900, 3782400, 3782400, 3901500, 3901500, 4024400, 4024400, 4151100, 4151100, 4281800, 4281800, 4416700, 4416700, 4555800, 4555800, 4699300, 4699300, 4847300, 4847300, 5000000},
                    {3173100, 3173100, 3272100, 3272100, 3376100, 3376100, 3482500, 3482500, 3592100, 3592100, 3705300, 3705300, 3822000, 3822000, 3942400, 3942400, 4066500, 4066500, 4194600, 4194600, 4326700, 4326700, 4463000, 4463000, 4603500, 4603500, 4748500, 4748500, 4898100, 4898100, 5052300, 5052300, 5211500},
                    {3307300, 3307300, 3411500, 3411500, 3518900, 3518900, 3629800, 3629800, 3744100, 3744100, 3862000, 3862000, 3983600, 3983600, 4109100, 4109100, 4238500, 4238500, 4372000, 4372000, 4509700, 4509700, 4651800, 4651800, 4798300, 4798300, 4949400, 4949400, 5105300, 5105300, 5266100, 5266100, 5431900},
                    {3447200, 3447200, 3555800, 3555800, 3667800, 3667800, 3783300, 3783300, 3902500, 3902500, 4025400, 4025400, 4152200, 4152200, 4282900, 4282900, 4417800, 4417800, 4557000, 4557000, 4700500, 4700500, 4848500, 4848500, 5001200, 5001200, 5158700, 5158700, 5321200, 5321200, 5488800, 5488800, 5661700},
                    {3593100, 3593100, 3706200, 3706200, 3822900, 3822900, 3943300, 3943300, 4067500, 4067500, 4195700, 4195700, 4327800, 4327800, 4462100, 4462100, 4604700, 4604700, 4749700, 4749700, 4899300, 4899300, 5053600, 5053600, 5212800, 5212800, 5377000, 5377000, 5546300, 5546300, 5721000, 5721000, 5901200}
            }
    };

    static final int[] tunjanganUmumJabatan = {175000, 180000, 185000, 190000};
    static final int[] potonganTaperum = {3000, 5000, 7000, 10000};
    static final String[] statusPernikahanOptions = {"Kawin", "Belum Kawin", "Cerai"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Pegawai: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Golongan Pangkat (1-4): ");
        int golonganPangkat = scanner.nextInt();
        golonganPangkat = validasiGolonganPangkat(golonganPangkat);
        scanner.nextLine();

        System.out.print("Masukkan Golongan Ruang Kerja (A-E): ");
        String tipeGolongan = scanner.nextLine();
        tipeGolongan = validasiTipeGolongan(golonganPangkat, tipeGolongan);

        System.out.print("Masukkan Masa Kerja: ");
        int masaKerja = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Status Pernikahan (Kawin/Belum Kawin/Cerai): ");
        String statusPernikahan = scanner.nextLine();
        statusPernikahan = validasiStatusPernikahan(statusPernikahan);
        if (statusPernikahan == null) {
            return;
        }

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = scanner.nextInt();
        
        int gajiPokok = kalkulasiGajiPokok(masaKerja, tipeGolongan, golonganPangkat);
        int tunjanganKeluarga = kalkulasiTunjanganKeluarga(statusPernikahan, gajiPokok);
        int tunjanganAnak = kalkulasiTunjanganAnak(jumlahAnak, gajiPokok);
        int tunjanganBeras = kalkulasiTunjanganBeras(statusPernikahan, jumlahAnak);
        int tunjanganUmumJabatan = kalkulasiTunjanganUmumJabatan(golonganPangkat);
        int gajiKotor = kalkulasiGajiKotor(gajiPokok, tunjanganAnak, tunjanganKeluarga, tunjanganUmumJabatan, tunjanganBeras);
        int potonganPPH = kalkulasiPotonganPPH(gajiPokok, statusPernikahan, gajiKotor, jumlahAnak, tunjanganKeluarga, tunjanganAnak);
        int potonganIWP = kalkulasiPotonganIWP(gajiPokok, tunjanganAnak, tunjanganKeluarga);
        int potonganTaperum = kalkulasiPotonganTaperum(golonganPangkat);
        int gajiBersih = kalkulasiGajiBersih(gajiKotor, potonganPPH, potonganIWP, potonganTaperum);

        displayOutput(nama, gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganUmumJabatan, gajiKotor, potonganPPH, potonganIWP, potonganTaperum, gajiBersih);
    }

    public static int validasiGolonganPangkat(int golonganPangkat) {
        Scanner scanner = new Scanner(System.in);
        while (golonganPangkat < 1 || golonganPangkat > 4) {
            System.out.println("Golongan Tidak Teridentifikasi");
            System.out.print("Masukkan Golongan Pangkat (1-4): ");
            golonganPangkat = scanner.nextInt();
        }
        return golonganPangkat;
    }

    public static String validasiTipeGolongan(int golonganPangkat, String tipeGolongan) {
        Scanner scanner = new Scanner(System.in);
        while ((golonganPangkat == 4 && (tipeGolongan.length() != 1 || tipeGolongan.charAt(0) < 'A' || tipeGolongan.charAt(0) > 'E')) ||
                (golonganPangkat >= 1 && golonganPangkat <= 3 && (tipeGolongan.length() != 1 || tipeGolongan.charAt(0) < 'A' || tipeGolongan.charAt(0) > 'D'))) {
            System.out.println("Pangkat Tidak Teridentifikasi");
            System.out.print("Masukkan Golongan Ruang Kerja (A-E): ");
            tipeGolongan = scanner.nextLine();
        }
        return tipeGolongan;
    }   

    public static String validasiStatusPernikahan(String statusPernikahan) {
        while (true) {
            boolean isValid = false;
            for (String option : statusPernikahanOptions) {
                if (statusPernikahan.equalsIgnoreCase(option)) {
                    isValid = true;
                    break;
                }
            }
            if (isValid) {
                return statusPernikahan;
            } else {
                System.out.println("Status Pernikahan Tidak Terdefinisi");
                System.out.print("Masukkan Status Pernikahan (Kawin/Belum Kawin/Cerai): ");
                Scanner scanner = new Scanner(System.in);
                statusPernikahan = scanner.nextLine();
            }
        }
    }
    

    public static int kalkulasiGajiPokok(int masaKerja, String tipeGolongan, int golonganPangkat) {
        int indeksTipe = tipeGolongan.charAt(0) - 'A';
        int indeksGolongan = golonganPangkat - 1;
        int masaKerjaMaxIndex = gajiPokok[indeksGolongan][indeksTipe].length - 1;
        int indeksMasaKerja = Math.min(masaKerja, masaKerjaMaxIndex);
    
        return (int) gajiPokok[indeksGolongan][indeksTipe][indeksMasaKerja];
    }
    

    public static int kalkulasiTunjanganKeluarga(String statusPernikahan, int gajiPokok) {
        if (statusPernikahan.equalsIgnoreCase("Kawin")) {
            return (int) (0.1 * gajiPokok);
        } else {
            return 0;
        }
    }

    public static int kalkulasiTunjanganAnak(int jumlahAnak, int gajiPokok) {
        return (int) (0.02 * gajiPokok * Math.min(jumlahAnak, 2));
    }

    public static int kalkulasiTunjanganBeras(String statusPernikahan, int jumlahAnak) {
        int jumlahAnggotaKeluarga = 1 + (statusPernikahan.equalsIgnoreCase("Kawin") ? 1 : 0) + Math.min(jumlahAnak, 2);
        return jumlahAnggotaKeluarga * 10 * 15000;
    }

    public static int kalkulasiTunjanganUmumJabatan(int golonganPangkat) {
        if (golonganPangkat >= 1 && golonganPangkat <= 4) {
            return tunjanganUmumJabatan[golonganPangkat - 1];
        } else {
            return 0;
        }
    }

    public static int kalkulasiGajiKotor(int gajiPokok, int tunjanganAnak, int tunjanganKeluarga, int tunjanganUmumJabatan, int tunjanganBeras) {
        return gajiPokok + tunjanganAnak + tunjanganKeluarga + tunjanganUmumJabatan + tunjanganBeras;
    }

    public static int kalkulasiPotonganPPH(int gajiPokok, String statusPernikahan, int gajiKotor, int jumlahAnak, int tunjanganKeluarga, int tunjanganAnak) {
        if (gajiKotor <= 4500000) {
            return 0;
        }

        int biayaJabatan = (int) (0.05 * gajiKotor);
        int iuranPensiun = (int) (0.0475 * (gajiPokok + tunjanganKeluarga + tunjanganAnak));
        int gajiNeto = gajiKotor - biayaJabatan - iuranPensiun;

        int ptkp = 36000000;
        if (statusPernikahan.equalsIgnoreCase("Kawin")) {
            ptkp += 3000000;
        }
        ptkp += Math.min(jumlahAnak, 3) * 3000000;

        int pkp = Math.max(0, (gajiNeto * 12) - ptkp);
        int pph21Tahunan = (int) (0.05 * pkp);
        return pph21Tahunan / 12;
    }

    public static int kalkulasiPotonganIWP(int gajiPokok, int tunjanganAnak, int tunjanganKeluarga) {
        return (int) (0.1 * (gajiPokok + tunjanganAnak + tunjanganKeluarga));
    }

    public static int kalkulasiPotonganTaperum(int golonganPangkat) {
        if (golonganPangkat >= 1 && golonganPangkat <= 4) {
            return potonganTaperum[golonganPangkat - 1];
        } else {
            return 0;
        }
    }
    

    public static int kalkulasiGajiBersih(int gajiKotor, int potonganPPH, int potonganIWP, int potonganTaperum) {
        return gajiKotor - potonganPPH - potonganIWP - potonganTaperum;
    }

    public static void displayOutput(String nama, int gajiPokok, int tunjanganKeluarga, int tunjanganAnak, int tunjanganBeras, int tunjanganUmumJabatan, int gajiKotor, int potonganPPH, int potonganIWP, int potonganTaperum, int gajiBersih) {
        System.out.println("==========================================");
        System.out.println("Nama PNS: " + nama);
        System.out.printf("Gaji Pokok: %,d\n", gajiPokok);
        System.out.printf("Tunjangan Keluarga: %,d\n", tunjanganKeluarga);
        System.out.printf("Tunjangan Anak: %,d\n", tunjanganAnak);
        System.out.printf("Tunjangan Beras: %,d\n", tunjanganBeras);
        System.out.printf("Tunjangan Umum Jabatan: %,d\n", tunjanganUmumJabatan);
        System.out.printf("Gaji Bruto: %,d\n", gajiKotor);
        System.out.printf("Pph: %,d\n", potonganPPH);
        System.out.printf("Potongan IWP: %,d\n", potonganIWP);
        System.out.printf("Potongan Taperum: %,d\n", potonganTaperum);
        System.out.printf("Gaji Take Home Pay: %,d\n", gajiBersih);
    }
}
