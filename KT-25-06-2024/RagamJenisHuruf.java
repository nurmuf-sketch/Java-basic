import java.util.Scanner;

public class RagamJenisHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input berupa string
        String input = scanner.nextLine();
        
        // Menggunakan array boolean untuk melacak keberadaan huruf
        boolean[] hurufAda = new boolean[26]; // karena hanya alfabet (a-z)
        
        // Menghitung ragam jenis huruf dalam string
        int ragamJenis = countDistinctLetters(input, hurufAda);
        
        // Menampilkan jumlah ragam jenis huruf
        System.out.println(ragamJenis);
    }
    
    // Method untuk menghitung ragam jenis huruf dalam string
    public static int countDistinctLetters(String input, boolean[] hurufAda) {
        int count = 0;
        
        // Iterasi setiap karakter dalam string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Mengabaikan huruf besar atau kecil dengan mengubahnya menjadi huruf kecil
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                // Menandai huruf dalam array boolean jika belum ditandai sebelumnya
                if (!hurufAda[ch - 'a']) {
                    hurufAda[ch - 'a'] = true;
                    count++;
                }
            }
        }
        
        return count;
    }
}
