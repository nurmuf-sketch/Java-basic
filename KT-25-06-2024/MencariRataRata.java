import java.util.Scanner;

public class MencariRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah data
        int N = scanner.nextInt();
        
        // Input data-data
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Hitung rata-rata menggunakan fungsi rerata
        float average = rerata(data, N);
        
        // Cetak hasil dengan dua angka di belakang koma
        System.out.printf("%.2f\n", average);
    }
    
    public static float rerata(int data[], int N) {
        // Inisialisasi total untuk menghitung jumlah seluruh data
        int total = 0;
        
        // Menghitung jumlah seluruh data
        for (int i = 0; i < N; i++) {
            total += data[i];
        }
        
        // Menghitung rata-rata
        float average = (float) total / N;
        
        return average;
    }
}
