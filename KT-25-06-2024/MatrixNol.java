import java.util.Scanner;

public class MatrixNol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input untuk elemen-elemen matriks M
        int[][] M = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M[i][j] = scanner.nextInt();
            }
        }
        
        // Memanggil method untuk memeriksa apakah matriks M adalah matriks nol
        boolean isZeroMatrix = isZeroMatrix(M);
        
        // Menampilkan hasil berdasarkan pengecekan
        if (isZeroMatrix) {
            System.out.println("matriks nol");
        } else {
            System.out.println("bukan matriks nol");
        }
    }
    
    // Method untuk memeriksa apakah matriks M adalah matriks nol
    public static boolean isZeroMatrix(int[][] matrix) {
        // Memeriksa setiap elemen matriks
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    return false; // Jika ditemukan elemen yang bukan nol, bukan matriks nol
                }
            }
        }
        return true; // Jika semua elemen adalah nol, matriks nol
    }
}
