import java.util.Scanner;

public class MenyusunBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca jumlah buku (M) dan jumlah slot rak (N)
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        scanner.close();
        
        // Menghitung jumlah cara untuk menyusun buku
        int result = permutations(N, M);
        
        // Menampilkan hasil
        System.out.println(result);
    }
    
    // Fungsi untuk menghitung permutasi N P M (N! / (N-M)!)
    public static int permutations(int N, int M) {
        int numerator = factorial(N);
        int denominator = factorial(N - M);
        
        return numerator / denominator;
    }
    
    // Fungsi untuk menghitung faktorial
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
