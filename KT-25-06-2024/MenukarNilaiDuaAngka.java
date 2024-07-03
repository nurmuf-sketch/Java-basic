import java.util.Scanner;

public class MenukarNilaiDuaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua bilangan bulat
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        scanner.close();
        
        // Memanggil fungsi untuk menukar nilai
        swapNumbers(num1, num2);
    }
    
    // Fungsi untuk menukar nilai dua variabel
    public static void swapNumbers(int a, int b) {
        System.out.println(b + " " + a);
    }
}
