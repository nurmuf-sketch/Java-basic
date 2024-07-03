import java.util.Scanner;

public class CheckHurufVokal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array huruf vokal
        char[] vowels = {'a', 'i', 'u', 'e', 'o'};

        // Meminta pengguna memasukkan karakter
        System.out.println("Masukkan sebuah karakter:");
        char karakter = scanner.nextLine().charAt(0);

        // Memeriksa apakah karakter merupakan huruf vokal
        boolean isVowel = isVowel(karakter, vowels);

        // Menampilkan hasil
        System.out.println(isVowel);

        scanner.close();
    }

    // Method untuk memeriksa apakah karakter merupakan huruf vokal
    private static boolean isVowel(char c, char[] vowels) {
        // Mengubah karakter menjadi huruf kecil untuk memeriksa
        char ch = Character.toLowerCase(c);

        // Memeriksa apakah karakter merupakan huruf vokal
        for (char vowel : vowels) {
            if (ch == vowel) {
                return true;
            }
        }
        return false;
    }
}
