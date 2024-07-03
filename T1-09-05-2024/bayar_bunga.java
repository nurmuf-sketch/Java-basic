import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca biaya awal dan persen bunga
        double biayaAwal = scanner.nextDouble();
        double persenBunga = scanner.nextDouble();
        
        // Menghitung total biaya yang harus dibayar
        double totalBiaya = biayaAwal + (biayaAwal * persenBunga / 100);
        
        // Menampilkan total biaya dengan dua angka di belakang koma
        System.out.printf("%.2f\n", totalBiaya);
        
        // Menutup scanner
        scanner.close();
    }
}
