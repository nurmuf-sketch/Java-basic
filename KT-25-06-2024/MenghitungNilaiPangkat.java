import java.util.Scanner;

public class MenghitungNilaiPangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua bilangan bulat
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        
        scanner.close();
        
        // Memanggil fungsi untuk menghitung pangkat dan menampilkan hasilnya
        int result = power(base, exponent);
        System.out.println(result);
    }
    
    // Fungsi untuk menghitung pangkat dari base^exponent secara iteratif
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
