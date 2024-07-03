import java.util.Scanner;

public class BilanganTanpaAkhiran4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input X dan Y
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        // Inisialisasi jumlah bilangan tanpa akhiran 4
        int count = 0;
        
        // Iterasi dari X+1 sampai Y-1
        for (int i = X + 1; i < Y; i++) {
            if (!hasEnding4(i)) {
                count++;
            }
        }
        
        // Menampilkan hasil
        System.out.println(count);
        
        scanner.close();
    }
    
    // Fungsi untuk memeriksa apakah sebuah bilangan memiliki akhiran angka 4
    private static boolean hasEnding4(int number) {
        // Ubah bilangan menjadi string untuk memeriksa karakter terakhir
        String numStr = Integer.toString(number);
        char lastChar = numStr.charAt(numStr.length() - 1);
        return lastChar == '4';
    }
}
