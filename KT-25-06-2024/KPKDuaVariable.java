import java.util.Scanner;

public class KPKDuaVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        scanner.close();
        
        // Menghitung FPB menggunakan fungsi yang sudah dibuat sebelumnya
        int fpb = calculateGCD(A, B);
        
        // Menghitung KPK
        int kpk = (A * B) / fpb;
        
        // Menampilkan hasil KPK
        System.out.println(kpk);
    }
    
    // Fungsi untuk menghitung FPB (Faktor Persekutuan Terbesar)
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
