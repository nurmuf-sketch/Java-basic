import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca jumlah elemen array N
        int N = scanner.nextInt();
        
        // Membaca elemen-elemen array yang terurut ascending
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Menghitung nilai median
        double median = calculateMedian(array);
        
        // Menampilkan nilai median dengan format satu angka di belakang koma
        System.out.printf("%.1f\n", median);
    }
    
    // Method untuk menghitung nilai median dari array yang terurut ascending
    public static double calculateMedian(int[] array) {
        int N = array.length;
        if (N % 2 == 1) {
            // Jika N ganjil, median adalah elemen tengah
            return array[N / 2];
        } else {
            // Jika N genap, median adalah rata-rata dari dua elemen tengah
            int mid1 = N / 2 - 1;
            int mid2 = N / 2;
            return (array[mid1] + array[mid2]) / 2.0;
        }
    }
}
