import java.util.Scanner;

public class PerkalianMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca ukuran matriks pertama (A x B)
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Membaca matriks pertama
        int[][] matrix1 = new int[A][B];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Membaca ukuran matriks kedua (C x D) yang harus sama dengan B
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        // Membaca matriks kedua
        int[][] matrix2 = new int[C][D];
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < D; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Matriks hasil perkalian (A x D)
        int[][] resultMatrix = new int[A][D];
        
        // Perkalian matriks
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < D; j++) {
                int sum = 0;
                for (int k = 0; k < B; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }
        
        // Menampilkan hasil matriks hasil perkalian
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < D; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
