import java.util.Scanner;

public class FPBTigaVariabel {

    // Fungsi untuk mencari FPB dari dua bilangan
    public static int fpb(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Fungsi untuk mencari FPB dari tiga bilangan
    public static int fpbTiga(int a, int b, int c) {
        // FPB dari A dan B
        int fpbAB = fpb(a, b);
        // FPB dari FPB_AB dan C
        return fpb(fpbAB, c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input A, B, C
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        // Hitung FPB dari tiga bilangan
        int result = fpbTiga(A, B, C);
        
        // Output hasil FPB
        System.out.println(result);
        
        scanner.close();
    }
}
