import java.util.Scanner;

public class DiBawahRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // Banyaknya murid
        int[] nilai = new int[N];
        
        // Membaca nilai-nilai murid
        for (int i = 0; i < N; i++) {
            nilai[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Menghitung rata-rata
        double total = 0;
        for (int i = 0; i < N; i++) {
            total += nilai[i];
        }
        double rataRata = total / N;
        
        // Menghitung jumlah murid yang nilai nya di bawah rata-rata
        int countBelowAverage = 0;
        for (int i = 0; i < N; i++) {
            if (nilai[i] < rataRata) {
                countBelowAverage++;
            }
        }
        
        // Output jumlah murid yang nilai nya di bawah rata-rata
        System.out.println(countBelowAverage);
    }
}
