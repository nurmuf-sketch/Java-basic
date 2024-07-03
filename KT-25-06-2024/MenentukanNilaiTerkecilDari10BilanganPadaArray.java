import java.util.Scanner;

public class MenentukanNilaiTerkecilDari10BilanganPadaArray {
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
        
        // Memanggil fungsi untuk menentukan nilai terkecil dari masing-masing array
        int min1 = getMinFromArray(array1);
        int min2 = getMinFromArray(array2);
        
        // Menampilkan hasil
        System.out.println(min1 + " " + min2);
    }
    
    // Fungsi untuk menentukan nilai terkecil dari sebuah array
    public static int getMinFromArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
