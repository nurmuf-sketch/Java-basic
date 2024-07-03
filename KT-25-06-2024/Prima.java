import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input bilangan X
        int X = scanner.nextInt();
        
        // Memeriksa apakah X merupakan bilangan prima
        boolean isPrime = isPrime(X);
        
        // Menampilkan hasil
        if (isPrime) {
            System.out.println("prima");
        } else {
            System.out.println("bukan prima");
        }
        
        scanner.close();
    }
    
    // Fungsi untuk memeriksa apakah suatu bilangan adalah bilangan prima
    private static boolean isPrime(int number) {
        // Bilangan prima harus lebih besar dari 1
        if (number <= 1) {
            return false;
        }
        
        // Untuk memeriksa bilangan prima, kita cek faktor dari 2 sampai akar dari number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Jika ditemukan faktor selain 1 dan number itu sendiri, bukan bilangan prima
            }
        }
        
        return true; // Jika tidak ditemukan faktor selain 1 dan number itu sendiri, bilangan prima
    }
}
