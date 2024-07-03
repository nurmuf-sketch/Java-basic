import java.util.Scanner;

public class BarisanBilangan {
    public static void main(String[] args) {
        int sukuPertama = bacaInput();
        int[] barisanBilangan = buatBarisan(sukuPertama);
        cetakBarisan(barisanBilangan);
    }

    private static int bacaInput() {
        Scanner scanner = new Scanner(System.in);
        int sukuPertama = scanner.nextInt();
        scanner.close();
        return sukuPertama;
    }

    private static int[] buatBarisan(int sukuPertama) {
        int[] barisanBilangan = new int[15];
        barisanBilangan[0] = sukuPertama;

        int[] polaSelisih = {3, 4, 5};
        
        for (int i = 1; i < barisanBilangan.length; i++) {
            barisanBilangan[i] = barisanBilangan[i - 1] + polaSelisih[(i - 1) % 3];
        }
        
        return barisanBilangan;
    }

    private static void cetakBarisan(int[] barisanBilangan) {
        for (int i = 0; i < barisanBilangan.length; i++) {
            System.out.print(barisanBilangan[i]);
            if (i < barisanBilangan.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
