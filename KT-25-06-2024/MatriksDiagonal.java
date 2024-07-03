import java.util.Scanner;

public class MatriksDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input untuk matriks 3x3
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Memeriksa apakah matriks adalah matriks diagonal
        boolean isDiagonal = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Memeriksa elemen di luar diagonal utama
                if (i != j && matrix[i][j] != 0) {
                    isDiagonal = false;
                    break;
                }
                // Memeriksa elemen pada diagonal utama
                if (i == j && matrix[i][j] == 0) {
                    isDiagonal = false;
                    break;
                }
            }
            if (!isDiagonal) {
                break;
            }
        }
        
        // Menampilkan hasil
        if (isDiagonal) {
            System.out.println("matriks diagonal");
        } else {
            System.out.println("bukan matriks diagonal");
        }
        
        scanner.close();
    }
}
