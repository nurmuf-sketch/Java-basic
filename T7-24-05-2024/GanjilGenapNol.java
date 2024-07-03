import java.util.Scanner;

public class GanjilGenapNol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input bilangan X
        System.out.print("Masukkan bilangan X (0 ≤ X ≤ 100): ");
        int X = scanner.nextInt();
        
        // Menentukan apakah bilangan ganjil, genap, atau nol
        String result = determineOddEvenZero(X);
        
        // Menampilkan hasil
        System.out.println(result);
        
        scanner.close();
    }

    // Method untuk menentukan apakah bilangan ganjil, genap, atau nol
    private static String determineOddEvenZero(int X) {
        if (X == 0) {
            return "nol";
        } else if (X % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }
    }
}
