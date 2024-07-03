import java.util.Scanner;

public class bilanga_bulat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input X dan Y
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        // Menampilkan semua bilangan bulat dari X hingga Y
        for (int i = X; i <= Y; i++) {
            // Jika i adalah bilangan pertama, tidak perlu spasi sebelumnya
            if (i == X) {
                System.out.print(i);
            } else {
                System.out.print(" " + i);
            }
        }
        
        // Mengakhiri baris
        System.out.println();
        
        // Menutup scanner
        scanner.close();
    }
}
