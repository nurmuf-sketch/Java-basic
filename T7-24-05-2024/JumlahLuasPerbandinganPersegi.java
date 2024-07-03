import java.util.Scanner;

public class JumlahLuasPerbandinganPersegi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input
        System.out.println("Masukkan nilai R1, R2, R3, dan panjang sisi S:");
        int R1 = scanner.nextInt();
        int R2 = scanner.nextInt();
        int R3 = scanner.nextInt();
        double S = scanner.nextDouble();
        
        // Menghitung jumlah luas
        double totalLuas = hitungJumlahLuas(R1, R2, R3, S);
        
        // Menampilkan hasil dengan dua angka di belakang koma
        System.out.printf("%.2f\n", totalLuas);
        
        scanner.close();
    }

    // Method untuk menghitung jumlah luas 3 persegi dengan perbandingan R1 : R2 : R3
    private static double hitungJumlahLuas(int R1, int R2, int R3, double S) {
        // Menghitung panjang sisi masing-masing persegi
        double sisi1 = S * R1;
        double sisi2 = S * R2;
        double sisi3 = S * R3;
        
        // Menghitung luas masing-masing persegi
        double luas1 = sisi1 * sisi1;
        double luas2 = sisi2 * sisi2;
        double luas3 = sisi3 * sisi3;
        
        // Menghitung jumlah luas
        double totalLuas = luas1 + luas2 + luas3;
        
        return totalLuas;
    }
}
