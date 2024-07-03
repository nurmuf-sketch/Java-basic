import java.util.Scanner;

public class AdaBerapaPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input berupa array A dengan 10 elemen
        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        
        // Menghitung jumlah bilangan prima dalam array A
        int countPrimes = countPrimesInArray(A);
        
        // Menampilkan hasil jumlah bilangan prima
        System.out.println(countPrimes);
    }
    
    // Method untuk menghitung jumlah bilangan prima dalam array
    public static int countPrimesInArray(int[] array) {
        int count = 0;
        
        // Iterasi setiap elemen dalam array
        for (int num : array) {
            // Panggil method isPrime untuk mengecek apakah num adalah bilangan prima
            if (isPrime(num)) {
                count++;
            }
        }
        
        return count;
    }
    
    // Method untuk mengecek apakah suatu bilangan adalah bilangan prima
    public static boolean isPrime(int num) {
        // Bilangan 0 dan 1 bukan prima
        if (num <= 1) {
            return false;
        }
        
        // Iterasi untuk mencari pembagi dari 2 sampai akar dari num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Jika ditemukan pembagi selain 1 dan num sendiri, bukan prima
            }
        }
        
        return true; // Jika tidak ditemukan pembagi lain, bilangan tersebut adalah prima
    }
}
