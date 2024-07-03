import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KarakteristikHewan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca nilai N (persentase minimal kesamaan)
        System.out.print("Masukkan nilai N (dalam persentase): ");
        double N = Double.parseDouble(input.nextLine());

        // Membaca ciri-ciri hewan A
        System.out.print("Masukkan ciri-ciri hewan A: ");
        String ciriHewanA = input.nextLine();

        // Membaca ciri-ciri hewan B
        System.out.print("Masukkan ciri-ciri hewan B: ");
        String ciriHewanB = input.nextLine();

        // Hitung persentase kesamaan
        double persentaseKesamaan = hitungPersentaseKesamaan(ciriHewanA, ciriHewanB);

        // Tentukan apakah hewan A dan B sama atau tidak
        String hasilPerbandingan = (persentaseKesamaan >= N) ? "sama" : "tidak sama";

        // Output hasil
        System.out.println("Hasil perbandingan: " + hasilPerbandingan);
    }

    public static double hitungPersentaseKesamaan(String ciriHewanA, String ciriHewanB) {
        Set<Character> setA = toCharacterSet(ciriHewanA);
        Set<Character> setB = toCharacterSet(ciriHewanB);

        // Menggunakan intersection size untuk menghitung kesamaan
        Set<Character> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // Menggunakan union size untuk menghitung total karakter unik
        Set<Character> union = new HashSet<>(setA);
        union.addAll(setB);

        double persentaseKesamaan = ((double) intersection.size() / union.size()) * 100;
        return persentaseKesamaan;
    }

    public static Set<Character> toCharacterSet(String ciriHewan) {
        Set<Character> set = new HashSet<>();
        for (char c : ciriHewan.toCharArray()) {
            if (c != ' ') {  // Mengabaikan spasi
                set.add(c);
            }
        }
        return set;
    }
}
