import java.util.Scanner;

public class TerbanyakMuncul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Baca jumlah obrolan
        int N = scanner.nextInt();
        
        // Array untuk menghitung frekuensi masing-masing ID card (0-99)
        int[] count = new int[100];
        
        // Baca ID card dari setiap obrolan dan hitung frekuensinya
        for (int i = 0; i < N; i++) {
            int idCard = scanner.nextInt();
            count[idCard]++;
        }
        
        scanner.close();
        
        // Temukan ID card dengan frekuensi obrolan tertinggi
        int maxFrequency = 0;
        int mostFrequentId = 0;
        
        for (int id = 0; id < 100; id++) {
            if (count[id] > maxFrequency) {
                maxFrequency = count[id];
                mostFrequentId = id;
            }
        }
        
        // Cetak ID card yang paling sering muncul
        System.out.println(mostFrequentId);
    }
}
