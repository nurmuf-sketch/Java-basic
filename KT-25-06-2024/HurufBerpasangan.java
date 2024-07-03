import java.util.Scanner;

public class HurufBerpasangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input huruf yang berpasangan
        String input = scanner.nextLine();
        char firstChar = input.charAt(0);
        char secondChar = input.charAt(2); // index 2 karena ada spasi di antara
        
        // Array X yang diberikan
        char[] X = {'J', 'T', 'K', 'P', 'o', 'l', 'b', 'a', 'n'};
        
        // Memeriksa keberadaan pasangan huruf
        boolean found = false;
        for (int i = 0; i < X.length - 1; i++) {
            // Mengabaikan perbedaan huruf besar-kecil dengan toLowerCase()
            if (Character.toLowerCase(X[i]) == Character.toLowerCase(firstChar) &&
                Character.toLowerCase(X[i+1]) == Character.toLowerCase(secondChar)) {
                found = true;
                break;
            }
        }
        
        // Menampilkan hasil
        if (found) {
            System.out.println("tidak ada");
        } else {
            System.out.println("ada");
        }
        
        scanner.close();
    }
}
