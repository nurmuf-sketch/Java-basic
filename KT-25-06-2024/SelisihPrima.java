import java.util.Scanner;

public class SelisihPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input X dan Y
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        // Mencari bilangan prima terkecil di antara X dan Y
        int smallestPrime = findSmallestPrime(X, Y);
        
        // Mencari bilangan prima terbesar di antara X dan Y
        int largestPrime = findLargestPrime(X, Y);
        
        // Menghitung selisih
        int difference = largestPrime - smallestPrime;
        
        // Menampilkan hasil
        System.out.println(difference);
        
        scanner.close();
    }
    
    // Fungsi untuk mencari bilangan prima terkecil di antara X dan Y
    private static int findSmallestPrime(int X, int Y) {
        for (int i = X; i <= Y; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1; // Jika tidak ada bilangan prima di rentang X sampai Y (sesuai spesifikasi, ini tidak akan terjadi)
    }
    
    // Fungsi untuk mencari bilangan prima terbesar di antara X dan Y
    private static int findLargestPrime(int X, int Y) {
        for (int i = Y; i >= X; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1; // Jika tidak ada bilangan prima di rentang X sampai Y (sesuai spesifikasi, ini tidak akan terjadi)
    }
    
    // Fungsi untuk memeriksa apakah sebuah bilangan adalah bilangan prima
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
