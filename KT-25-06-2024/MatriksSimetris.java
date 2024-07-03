import java.util.Scanner;

public class MatriksSimetris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input untuk elemen-elemen matriks M
        int[][] M = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M[i][j] = scanner.nextInt();
            }
        }
        
        // Memanggil method untuk memeriksa apakah matriks M adalah matriks simetris
        boolean isSymmetric = isSymmetricMatrix(M);
        
        // Menampilkan hasil berdasarkan pengecekan
        if (isSymmetric) {
            System.out.println("matriks simetris");
        } else {
            System.out.println("bukan matriks simetris");
        }
    }
    
    // Method untuk memeriksa apakah matriks M adalah matriks simetris
    public static boolean isSymmetricMatrix(int[][] matrix) {
        // Memeriksa apakah matriks sama dengan transposenya
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // Jika ditemukan elemen yang tidak simetris, bukan matriks simetris
                }
            }
        }
        return true; // Jika semua elemen memenuhi syarat simetris, matriks simetris
    }
}
