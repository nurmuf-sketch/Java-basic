import java.util.Scanner;

public class DesimalKeOktadesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input bilangan desimal
        int decimal = scanner.nextInt();
        
        // Mengonversi bilangan desimal ke oktadesimal
        String octal = decimalToOctal(decimal);
        
        // Menampilkan hasil konversi
        System.out.println(octal);
        
        scanner.close();
    }
    
    // Fungsi untuk mengonversi bilangan desimal ke oktadesimal
    private static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder); // Masukkan sisa pembagian ke depan (prepend)
            decimal = decimal / 8;
        }
        
        return octal.toString();
    }
}
