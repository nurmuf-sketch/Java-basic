import java.util.Scanner;

public class TigaHurufBerpasangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input teks
        String text = scanner.nextLine().toLowerCase(); // Ubah ke huruf kecil untuk konsistensi
        char firstChar = scanner.nextLine().toLowerCase().charAt(0);
        char secondChar = scanner.nextLine().toLowerCase().charAt(0);
        char thirdChar = scanner.nextLine().toLowerCase().charAt(0);
        
        // Menghitung jumlah kemunculan tiga huruf berpasangan
        int count = countTripleLetterPairs(text, firstChar, secondChar, thirdChar);
        
        // Menampilkan hasil
        System.out.println(count);
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung jumlah kemunculan tiga huruf berpasangan
    private static int countTripleLetterPairs(String text, char firstChar, char secondChar, char thirdChar) {
        int count = 0;
        int len = text.length();
        
        // Iterasi dari awal sampai len-2 untuk memastikan tiga huruf berpasangan
        for (int i = 0; i < len - 2; i++) {
            char char1 = text.charAt(i);
            char char2 = text.charAt(i + 1);
            char char3 = text.charAt(i + 2);
            
            // Memeriksa tiga huruf berpasangan
            if (char1 == firstChar && char2 == secondChar && char3 == thirdChar) {
                count++;
            }
        }
        
        return count;
    }
}
