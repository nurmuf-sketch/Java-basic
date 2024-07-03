import java.util.Scanner;

public class HurufVokalArray2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array 2D
        char[][] array = new char[3][3];
        System.out.println("Masukkan array 2D berordo 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.next().charAt(0);
            }
        }
        
        // Mencari dan menampilkan posisi huruf vokal
        findAndDisplayVowels(array);
        
        scanner.close();
    }

    // Method untuk mencari dan menampilkan posisi huruf vokal
    private static void findAndDisplayVowels(char[][] array) {
        boolean foundVowel = false;
        
        // Array untuk menyimpan posisi huruf vokal
        String[] positions = new String[9];
        int count = 0;
        
        // Memeriksa setiap elemen dalam array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char ch = array[i][j];
                if (isVowel(ch)) {
                    foundVowel = true;
                    positions[count] = ch + ": (" + (i + 1) + "," + (j + 1) + ")";
                    count++;
                }
            }
        }
        
        // Menampilkan hasil
        if (foundVowel) {
            for (int k = 0; k < count; k++) {
                System.out.println(positions[k]);
            }
        } else {
            System.out.println("tidak ada huruf vokal");
        }
    }

    // Method untuk memeriksa apakah sebuah karakter adalah huruf vokal
    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
