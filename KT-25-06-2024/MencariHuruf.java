import java.util.Scanner;

public class MencariHuruf {
    public static void main(String[] args) {
        // Array X dengan 10 elemen
        char[] X = {'J', 'T', 'K', 'P', 'o', 'l', 'b', 'a', 'n'};
        
        // Membaca input huruf yang ingin dicari
        Scanner scanner = new Scanner(System.in);
        char huruf = scanner.next().charAt(0);
        
        // Mengubah huruf menjadi huruf kecil untuk memudahkan pencarian
        huruf = Character.toLowerCase(huruf);
        
        // Memanggil method untuk memeriksa apakah huruf ada di dalam array X
        boolean found = searchLetter(X, huruf);
        
        // Menampilkan hasil berdasarkan hasil pencarian
        if (found) {
            System.out.println("ada");
        } else {
            System.out.println("tidak ada");
        }
    }
    
    // Method untuk mencari huruf di dalam array X
    public static boolean searchLetter(char[] array, char target) {
        // Mengubah target menjadi huruf kecil untuk membandingkan dengan elemen array
        target = Character.toLowerCase(target);
        
        // Iterasi untuk mencari target di dalam array
        for (char element : array) {
            if (Character.toLowerCase(element) == target) {
                return true; // Jika target ditemukan di dalam array, mengembalikan true
            }
        }
        return false; // Jika target tidak ditemukan di dalam array, mengembalikan false
    }
}
