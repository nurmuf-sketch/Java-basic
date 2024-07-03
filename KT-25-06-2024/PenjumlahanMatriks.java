import java.util.Scanner;

public class PenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input untuk matriks A
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        // Membaca input untuk matriks B
        int[][] B = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        
        // Memanggil method untuk menghitung hasil penjumlahan matriks A + B
        int[][] hasil = tambahMatriks(A, B);
        
        // Menampilkan hasil penjumlahan matriks A + B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Method untuk menghitung penjumlahan dua matriks A dan B
    public static int[][] tambahMatriks(int[][] A, int[][] B) {
        int[][] hasil = new int[3][3];
        
        // Melakukan penjumlahan elemen per elemen matriks A dan B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil[i][j] = A[i][j] + B[i][j];
            }
        }
        
        return hasil;
    }
}
