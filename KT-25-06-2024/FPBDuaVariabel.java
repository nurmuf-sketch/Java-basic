import java.util.Scanner;

public class FPBDuaVariabel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        scanner.close();
        
        // Memanggil fungsi untuk menghitung FPB
        int fpb = calculateGCD(A, B);
        
        // Menampilkan hasil FPB
        System.out.println(fpb);
    }
    
    // Fungsi rekursif untuk menghitung FPB
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
