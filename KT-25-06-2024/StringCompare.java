import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua kata yang akan dibandingkan
        String K1 = scanner.nextLine();
        String K2 = scanner.nextLine();
        
        // Memanggil method untuk melakukan perbandingan dan mendapatkan hasil
        StringCompareResult result = compareStrings(K1, K2);
        
        // Menampilkan hasil
        System.out.println(result.compareTo);
        System.out.println(result.positionOfDifference);
    }
    
    // Method untuk membandingkan dua kata dan mengembalikan hasilnya
    public static StringCompareResult compareStrings(String K1, String K2) {
        int minLength = Math.min(K1.length(), K2.length());
        int positionOfDifference = 0;
        
        // Iterasi untuk mencari posisi karakter pertama yang berbeda
        for (int i = 0; i < minLength; i++) {
            if (K1.charAt(i) != K2.charAt(i)) {
                positionOfDifference = i + 1; // posisi dimulai dari 1
                int diff = K1.charAt(i) - K2.charAt(i);
                if (diff < 0) {
                    return new StringCompareResult("-" + Math.abs(diff), positionOfDifference);
                } else {
                    return new StringCompareResult("+" + diff, positionOfDifference);
                }
            }
        }
        
        // Jika kedua kata identik sampai ke posisi minLength
        if (K1.length() == K2.length()) {
            return new StringCompareResult("0", 0);
        } else {
            // Jika ada perbedaan panjang, kata yang lebih panjang dianggap lebih besar
            int diffLength = K1.length() - K2.length();
            if (diffLength < 0) {
                return new StringCompareResult("-" + Math.abs(diffLength), minLength + 1);
            } else {
                return new StringCompareResult("+" + diffLength, minLength + 1);
            }
        }
    }
    
    // Kelas untuk menyimpan hasil perbandingan
    static class StringCompareResult {
        String compareTo;
        int positionOfDifference;
        
        public StringCompareResult(String compareTo, int positionOfDifference) {
            this.compareTo = compareTo;
            this.positionOfDifference = positionOfDifference;
        }
    }
}
