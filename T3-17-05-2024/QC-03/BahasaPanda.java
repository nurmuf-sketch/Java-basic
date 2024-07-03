import java.util.Scanner;

public class BahasaPanda {
    public static void main(String[] args) {
        // Menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String input = scanner.nextLine().toUpperCase();

        // Memanggil fungsi untuk mengubah teks menjadi sandi
        int[] sandi = encodeToSandi(input);

        // Menghasilkan string sandi dari array sandi
        String sandiString = generateSandiString(sandi);

        // Menampilkan hasil sandi
        System.out.println("Sandi: " + sandiString);

        scanner.close();
    }

    // Fungsi untuk mengambil angka berdasarkan karakter
    private static int getSandiNumber(char c) {
        if (c == ' ') {
            return -1; // Mengembalikan -1 untuk spasi yang akan digantikan dengan tanda minus (-)
        } else {
            return c - 'A' + 1;
        }
    }

    // Fungsi untuk mengubah input menjadi array sandi
    private static int[] encodeToSandi(String input) {
        int[] sandi = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            sandi[i] = getSandiNumber(input.charAt(i));
        }
        return sandi;
    }

    // Fungsi untuk menghasilkan string sandi dari array sandi
    private static String generateSandiString(int[] sandi) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sandi.length; i++) {
            if (sandi[i] == -1) {
                sb.append("-");
            } else {
                sb.append(sandi[i]);
            }
            if (i < sandi.length - 1 && sandi[i] != -1 && sandi[i + 1] != -1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
