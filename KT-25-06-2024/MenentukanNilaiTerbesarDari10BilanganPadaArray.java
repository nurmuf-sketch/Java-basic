import java.util.Scanner;

public class MenentukanNilaiTerbesarDari10BilanganPadaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca sepuluh bilangan bulat untuk array pertama
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = scanner.nextInt();
        }
        
        // Membaca sepuluh bilangan bulat untuk array kedua
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Memanggil fungsi untuk menentukan nilai terbesar dari masing-masing array
        int max1 = getMaxFromArray(array1);
        int max2 = getMaxFromArray(array2);
        
        // Menampilkan hasil
        System.out.println(max1 + " " + max2);
    }
    
    // Fungsi untuk menentukan nilai terbesar dari sebuah array
    public static int getMaxFromArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
