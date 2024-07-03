import java.util.Scanner;

public class MemeriksaBlokSudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca tiga baris input untuk blok Sudoku
        int[][] block = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                block[i][j] = scanner.nextInt();
            }
        }
        
        // Memeriksa keunikan angka dalam blok Sudoku
        boolean[] used = new boolean[10]; // indeks 1-9, indeks 0 tidak digunakan
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = block[i][j];
                if (num < 1 || num > 9 || used[num]) {
                    // Jika angka tidak valid atau sudah digunakan
                    System.out.println("tidak valid");
                    scanner.close();
                    return;
                }
                used[num] = true;
            }
        }
        
        // Jika semua angka valid dan unik
        System.out.println("valid");
        
        scanner.close();
    }
}
