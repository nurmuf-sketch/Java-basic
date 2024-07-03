import java.util.Scanner;

public class MenentukanNilaiTerbesarDanTerkecilDariDuaVariabel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua bilangan bulat
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        scanner.close();
        
        // Memanggil fungsi untuk menentukan nilai terbesar dan terkecil
        int max = getMax(num1, num2);
        int min = getMin(num1, num2);
        
        // Menampilkan hasil
        System.out.println(max + " " + min);
    }
    
    // Fungsi untuk mendapatkan nilai terbesar dari dua bilangan
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }
    
    // Fungsi untuk mendapatkan nilai terkecil dari dua bilangan
    public static int getMin(int a, int b) {
        return Math.min(a, b);
    }
}
