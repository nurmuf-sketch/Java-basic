import java.util.Scanner;

public class JumlahPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input kalimat
        String sentence = scanner.nextLine();
        
        // Memisahkan kalimat menjadi kata-kata
        String[] words = sentence.split("\\s+");
        
        // Menghitung jumlah kata palindrom
        int palindromeCount = 0;
        
        // Iterasi untuk setiap kata dalam array words
        for (String word : words) {
            if (isPalindrome(word)) {
                palindromeCount++;
            }
        }
        
        // Menampilkan jumlah kata palindrom
        System.out.println(palindromeCount);
        
        scanner.close();
    }
    
    // Fungsi untuk mengecek apakah sebuah kata adalah palindrom
    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
