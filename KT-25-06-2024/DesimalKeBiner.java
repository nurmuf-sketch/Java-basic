import java.util.Scanner;

public class DesimalKeBiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input bilangan desimal
        int decimal = scanner.nextInt();
        
        // Mengonversi bilangan desimal ke biner
        String binary = decimalToBinary(decimal);
        
        // Menampilkan hasil konversi
        System.out.println(binary);
        
        scanner.close();
    }
    
    // Fungsi untuk mengonversi bilangan desimal ke biner
    private static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Masukkan sisa pembagian ke depan (prepend)
            decimal = decimal / 2;
        }
        
        return binary.toString();
    }
}
