import java.util.Scanner;

public class BiayaSetelahBunga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input biaya awal
        System.out.print("Masukkan biaya awal: ");
        double biayaAwal = scanner.nextDouble();

        // Input persen bunga
        System.out.print("Masukkan persen bunga: ");
        double persenBunga = scanner.nextDouble();

        // Menghitung total biaya yang harus dibayar
        double totalBiaya = hitungTotalBiaya(biayaAwal, persenBunga);

        // Menampilkan hasil dengan format dua angka di belakang koma
        System.out.printf("Total biaya yang harus dibayar: %.2f\n", totalBiaya);

        scanner.close();
    }

    // Method untuk menghitung total biaya setelah bunga
    private static double hitungTotalBiaya(double biayaAwal, double persenBunga) {
        double bunga = biayaAwal * (persenBunga / 100);
        double totalBiaya = biayaAwal + bunga;
        return totalBiaya;
    }
}
