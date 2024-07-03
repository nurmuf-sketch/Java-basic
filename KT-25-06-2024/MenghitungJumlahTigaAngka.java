import java.util.Scanner;

public class MenghitungJumlahTigaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca tiga bilangan bulat
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        scanner.close();
        
        // Memanggil fungsi untuk menjumlahkan tiga bilangan
        int result = sumThreeNumbers(num1, num2, num3);
        
        // Menampilkan hasil jumlah
        System.out.println(result);
    }
    
    // Fungsi untuk menjumlahkan tiga bilangan bulat
    public static int sumThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }
}
