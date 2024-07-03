import java.util.Scanner;

public class BarisanBilangan {
    public static void main(String[] args) {
        int sukuPertama = bacaInput();
        int[] barisanBilangan = buatBarisan(sukuPertama);
        cetakBarisan(barisanBilangan);
    }

    // Metode untuk membaca input dari pengguna
    private static int bacaInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suku pertama (S): ");
        int sukuPertama = scanner.nextInt();
        scanner.close();
        return sukuPertama;
    }

    // Metode untuk membuat barisan bilangan dengan pola yang diberikan
    private static int[] buatBarisan(int sukuPertama) {
        int[] barisanBilangan = new int[15];
        barisanBilangan[0] = sukuPertama;
        
        // Pola selisih: 3, 4, 5 berulang
        int[] polaSelisih = {3, 4, 5};
        
        for (int i = 1; i < barisanBilangan.length; i++) {
            barisanBilangan[i] = barisanBilangan[i - 1] + polaSelisih[(i - 1) % 3];
        }
        
        return barisanBilangan;
    }

    // Metode untuk mencetak barisan bilangan
    private static void cetakBarisan(int[] barisanBilangan) {
        for (int i = 0; i < barisanBilangan.length; i++) {
            System.out.print(barisanBilangan[i]);
            if (i < barisanBilangan.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
