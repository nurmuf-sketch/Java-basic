import java.util.Scanner;

public class MenghitungJumlahKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input kalimat
        String sentence = scanner.nextLine();
        
        // Menghitung jumlah kata
        int wordCount = countWords(sentence);
        
        // Menampilkan hasil
        System.out.println(wordCount);
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung jumlah kata dalam kalimat
    private static int countWords(String sentence) {
        // Menggunakan split dengan regex \s+ untuk memisahkan kata berdasarkan whitespace
        String[] words = sentence.split("\\s+");
        
        // Mengembalikan jumlah kata
        return words.length;
    }
}
