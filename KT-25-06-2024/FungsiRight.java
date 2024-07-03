import java.util.Scanner;

public class FungsiRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input string S
        String S = scanner.nextLine();
        
        // Membaca input bilangan bulat N
        int N = scanner.nextInt();
        
        // Mengambil N karakter terkanan dari string S
        String result = rightFunction(S, N);
        
        // Menampilkan hasil
        System.out.println(result);
        
        scanner.close();
    }
    
    // Fungsi untuk mengambil N karakter terkanan dari sebuah string
    private static String rightFunction(String S, int N) {
        int length = S.length();
        // Jika N lebih besar dari panjang string S, ambil seluruh string S
        if (N > length) {
            return S;
        }
        // Ambil N karakter terkanan dari string S
        return S.substring(length - N);
    }
}
