import java.util.Scanner;

public class Pola1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai N:");
        int N = scanner.nextInt();

        printPattern(N);

        scanner.close();
    }

    // Method untuk mencetak pola berdasarkan nilai N
    private static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            // Cetak '*' sebanyak i kali, diikuti spasi
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
