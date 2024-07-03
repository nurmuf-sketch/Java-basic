import java.util.Scanner;

public class ProgramSatpam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nomor kasus dan banyaknya kasus:");
        int nomorKasus = scanner.nextInt();
        int banyakKasus = scanner.nextInt();

        handleViolation(nomorKasus, banyakKasus);

        scanner.close();
    }

    // Method untuk menangani pelanggaran berdasarkan nomor kasus dan banyaknya kasus
    private static void handleViolation(int nomorKasus, int banyakKasus) {
        if (nomorKasus == 1) {
            if (banyakKasus < 4) {
                System.out.println("Serahkan KTP anda !!!");
            } else {
                System.out.println("Bayar Denda 10000 !!!");
            }
        } else if (nomorKasus == 2) {
            System.out.println("Ambil STNK dulu !!!");
        } else {
            System.out.println("Kasus tidak dikenali");
        }
    }
}
