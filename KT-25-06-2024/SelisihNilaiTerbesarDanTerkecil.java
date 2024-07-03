import java.util.Scanner;
import java.util.Arrays;

public class SelisihNilaiTerbesarDanTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input 10 bilangan integer
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Menemukan nilai terbesar dan terkecil dalam array
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        
        // Menghitung selisih terbesar dan terkecil
        int selisih = max - min;
        
        // Menampilkan hasil
        System.out.println(selisih);
        
        scanner.close();
    }
}
