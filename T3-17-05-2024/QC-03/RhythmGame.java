import java.util.Scanner;

public class RhythmGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan nama pemain: ");
        String namaPemain = scanner.nextLine();

        System.out.print("Masukkan jumlah Sempurna: ");
        int jumSempurna = scanner.nextInt();

        System.out.print("Masukkan jumlah Hebat: ");
        int jumHebat = scanner.nextInt();

        System.out.print("Masukkan jumlah Bagus: ");
        int jumBagus = scanner.nextInt();

        System.out.print("Masukkan jumlah Salah: ");
        int jumSalah = scanner.nextInt();

        // Nilai-nilai untuk menghitung skor
        int[] nilaiSkor = {100, 80, 60, 0};
        // Nilai-nilai untuk mendapatkan peringkat
        String[] peringkat = {"S (Super)", "A (Amazing)", "B (Brilliant)", "C (Cool)", "D (Decent)"};
        int[] ambangBatas = {90, 80, 70, 60, 0};

        int totalSkor = hitungSkor(jumSempurna, jumHebat, jumBagus, jumSalah, nilaiSkor);
        int totalSkorMaksimal = hitungTotalSkorMaksimal();

        double persentase = (double) totalSkor / totalSkorMaksimal * 100;
        String pangkat = dapatkanPangkat(persentase, peringkat, ambangBatas);

        tampilHasil(namaPemain, totalSkor, totalSkorMaksimal, pangkat);

        scanner.close();
    }

    // Method untuk menghitung skor berdasarkan jumlah ketepatan
    private static int hitungSkor(int jumSempurna, int jumHebat, int jumBagus, int jumSalah, int[] nilaiSkor) {
        return (jumSempurna * nilaiSkor[0]) + (jumHebat * nilaiSkor[1]) + (jumBagus * nilaiSkor[2]) + (jumSalah * nilaiSkor[3]);
    }

    // Method untuk menghitung total maksimal skor yang bisa dicapai pada lagu tertentu
    private static int hitungTotalSkorMaksimal() {
        return 10000; // Max score yang dapat dicapai yaitu 100% Perfect = 10000 poin
    }

    // Method untuk mendapatkan peringkat berdasarkan persentase skor yang diperoleh
    private static String dapatkanPangkat(double persentase, String[] peringkat, int[] ambangBatas) {
        for (int i = 0; i < ambangBatas.length; i++) {
            if (persentase >= ambangBatas[i]) {
                return peringkat[i];
            }
        }
        return peringkat[peringkat.length - 1]; // Return rank terakhir jika tidak memenuhi threshold manapun
    }

    // Method untuk menampilkan hasil perhitungan skor dan peringkat pemain
    private static void tampilHasil(String namaPemain, int totalSkor, int totalSkorMaksimal, String pangkat) {
        System.out.println(totalSkor);
        System.out.println(namaPemain + " peringkat " + pangkat);
    }
}