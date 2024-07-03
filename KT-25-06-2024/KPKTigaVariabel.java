import java.util.Scanner;

public class KPKTigaVariabel {

    // Fungsi untuk mencari FPB dari dua bilangan
    public static int fpb(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Fungsi untuk mencari KPK dari dua bilangan
    public static int kpk(int a, int b) {
        return (a * b) / fpb(a, b);
    }

    // Fungsi untuk mencari KPK dari tiga bilangan
    public static int kpkTiga(int a, int b, int c) {
        int kpkAB = kpk(a, b); // KPK dari A dan B
        int kpkABC = kpk(kpkAB, c); // KPK dari KPK_AB dan C
        return kpkABC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input A, B, C
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // Hitung KPK dari tiga bilangan
        int result = kpkTiga(A, B, C);

        // Output hasil KPK
        System.out.println(result);

        scanner.close();
    }
}
