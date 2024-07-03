import java.util.Scanner;

public class MenghitungFaktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca bilangan bulat N
        int N = scanner.nextInt();
        
        scanner.close();
        
        // Memanggil fungsi untuk menghitung faktorial dan menampilkan hasilnya
        int result = factorial(N);
        System.out.println(result);
    }
    
    // Fungsi untuk menghitung faktorial dari bilangan N
    public static int factorial(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        
        int result = 1;
        for (int i = 2; i <= N; i++) {
            result *= i;
        }
        
        return result;
    }
}
