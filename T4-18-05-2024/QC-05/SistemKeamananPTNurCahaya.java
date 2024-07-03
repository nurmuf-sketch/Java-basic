import java.util.Scanner;

public class SistemKeamananPTNurCahaya {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input kata/kalimat dari pengguna
        System.out.print("Masukkan kata/kalimat: ");
        String kalimat = input.nextLine();

        // Menghapus spasi dari kata/kalimat
        String kalimatTanpaSpasi = hapusSpasi(kalimat);

        // Pengecekan apakah kata/kalimat adalah palindrom
        boolean palindrom = isPalindrom(kalimatTanpaSpasi);

        // Menghitung jumlah huruf dalam kata/kalimat
        int jumlahHuruf = hitungJumlahHuruf(kalimatTanpaSpasi);

        // Menampilkan hasil
        System.out.println(kalimatTanpaSpasi);
        System.out.println(palindrom);
        System.out.println(jumlahHuruf);

        if (palindrom) {
            System.out.println("Silahkan Masuk");
        } else {
            System.out.println("Akses Ditolak");
        }
    }

    public static String hapusSpasi(String kalimat) {
        // Menghapus spasi dari kalimat dan mengembalikan hasilnya
        return kalimat.replaceAll("\\s+", "");
    }

    public static boolean isPalindrom(String kalimat) {
        // Mengubah kalimat menjadi lowercase untuk menghindari perbedaan huruf besar kecil
        kalimat = kalimat.toLowerCase();
        int panjang = kalimat.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kalimat.charAt(i) != kalimat.charAt(panjang - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int hitungJumlahHuruf(String kalimat) {
        // Menghitung jumlah huruf dalam kalimat
        return kalimat.length();
    }
}
