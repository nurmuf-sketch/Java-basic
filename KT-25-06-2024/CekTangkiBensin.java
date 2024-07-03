import java.util.Scanner;

public class CekTangkiBensin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uang = scanner.nextInt();
        double kapasitas = scanner.nextDouble();

        final double HARGA_BENSIN = 7600;
        double jumlahBensin = uang / HARGA_BENSIN;

        System.out.printf("%.2f\n", jumlahBensin);

        if (jumlahBensin >= kapasitas) {
            System.out.println("Bensin Berlebih");
        }
    }
}
