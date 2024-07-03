import java.util.Scanner;

public class TeksAlay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menentukan substitusi huruf
        char[] huruf = {'a', 'i', 'z', 'e', 'g', 'j', 'b'};
        char[] alay = {'4', '1', '2', '3', '6', '7', '8'};

        // Meminta pengguna memasukkan kalimat
        System.out.println("Masukkan kalimat:");
        String kalimat = scanner.nextLine();

        // Mengubah kalimat menjadi alay
        String kalimatAlay = ubahKeAlay(kalimat, huruf, alay);

        // Menampilkan kalimat alay
        System.out.println("Kalimat alay:");
        System.out.println(kalimatAlay);

        scanner.close();
    }

    // Method untuk mengubah kalimat menjadi alay
    private static String ubahKeAlay(String kalimat, char[] huruf, char[] alay) {
        StringBuilder kalimatAlay = new StringBuilder();

        // Mengubah setiap karakter di kalimat
        for (int i = 0; i < kalimat.length(); i++) {
            char currentChar = kalimat.charAt(i);
            boolean hurufBesar = Character.isUpperCase(currentChar);

            // Mengecek setiap huruf dan mengganti ke alay
            boolean found = false;
            for (int j = 0; j < huruf.length; j++) {
                if (Character.toLowerCase(currentChar) == huruf[j]) {
                    if (hurufBesar) {
                        kalimatAlay.append(Character.toUpperCase(alay[j]));
                    } else {
                        kalimatAlay.append(alay[j]);
                    }
                    found = true;
                    break;
                }
            }

            // Jika tidak ditemukan, tambahkan karakter aslinya
            if (!found) {
                kalimatAlay.append(currentChar);
            }
        }

        return kalimatAlay.toString();
    }
}
