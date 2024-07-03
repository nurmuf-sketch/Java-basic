import java.util.Scanner;

public class DetikConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input detik
        System.out.print("Masukkan jumlah detik: ");
        int detik = scanner.nextInt();

        // Konversi detik ke hari, jam, menit, dan detik
        int[] hasil = konversiDetik(detik);

        // Menampilkan hasil
        for (int i = 0; i < hasil.length; i++) {
            System.out.println(hasil[i]);
        }

        scanner.close();
    }

    // Method untuk konversi detik ke hari, jam, menit, dan detik
    private static int[] konversiDetik(int detik) {
        int[] hasil = new int[4];

        // Menghitung hari
        hasil[0] = detik / (24 * 3600);
        detik = detik % (24 * 3600);

        // Menghitung jam
        hasil[1] = detik / 3600;
        detik %= 3600;

        // Menghitung menit
        hasil[2] = detik / 60;

        // Sisa detik
        hasil[3] = detik % 60;

        return hasil;
    }
}
