import java.util.Scanner;

public class PerkalianDuaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua bilangan bulat
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        scanner.close();
        
        // Memanggil fungsi untuk menghitung perkalian dan menampilkan hasilnya
        int result = multiplyNumbers(num1, num2);
        System.out.println(result);
    }
    
    // Fungsi untuk menghitung hasil perkalian dua bilangan
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}
