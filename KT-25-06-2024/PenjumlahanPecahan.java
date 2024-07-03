import java.util.Scanner;

public class PenjumlahanPecahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca pecahan pertama A/B
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Membaca pecahan kedua C/D
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        scanner.close();
        
        // Langkah 1: Menghitung penjumlahan pecahan
        // A/B + C/D = (A*D + C*B) / (B*D)
        int numerator = A * D + C * B;
        int denominator = B * D;
        
        // Langkah 2: Menyederhanakan pecahan ke bentuk paling sederhana
        int gcd = calculateGCD(numerator, denominator);
        
        int E = numerator / gcd;
        int F = denominator / gcd;
        
        // Output hasil dalam bentuk paling sederhana
        System.out.println(E + " " + F);
    }
    
    // Fungsi untuk menghitung FPB (Faktor Persekutuan Terbesar)
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
