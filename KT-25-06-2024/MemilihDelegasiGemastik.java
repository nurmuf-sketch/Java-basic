import java.util.Scanner;

public class MemilihDelegasiGemastik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca nilai N (jumlah mahasiswa) dan M (jumlah delegasi yang harus dipilih)
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        scanner.close();
        
        // Menghitung jumlah cara memilih M mahasiswa dari N mahasiswa
        int result = combinations(N, M);
        
        // Menampilkan hasil
        System.out.println(result);
    }
    
    // Fungsi untuk menghitung kombinasi C(N, M)
    public static int combinations(int N, int M) {
        int numerator = factorial(N);
        int denominator = factorial(M) * factorial(N - M);
        
        return numerator / denominator;
    }
    
    // Fungsi untuk menghitung faktorial dari suatu bilangan
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
