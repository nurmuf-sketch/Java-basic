import java.util.Scanner;

public class DesimalKeHexadesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input bilangan desimal
        int decimal = scanner.nextInt();
        
        // Mengonversi bilangan desimal ke heksadesimal
        String hexadecimal = decimalToHexadecimal(decimal);
        
        // Menampilkan hasil konversi
        System.out.println(hexadecimal);
        
        scanner.close();
    }
    
    // Fungsi untuk mengonversi bilangan desimal ke heksadesimal
    private static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal.insert(0, remainder); // Masukkan digit 0-9 ke depan (prepend)
            } else {
                char hexChar = (char) ('A' + (remainder - 10));
                hexadecimal.insert(0, hexChar); // Masukkan digit A-F ke depan (prepend)
            }
            decimal = decimal / 16;
        }
        
        return hexadecimal.toString();
    }
}
