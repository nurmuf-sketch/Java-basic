import java.util.Scanner;

public class SandiPramuka {

    // Deklarasi array untuk menyimpan nilai sandi
    private static final int[] sandiValues = {
        1,    // A
        11,   // B
        111,  // C
        1111, // D
        2,    // E
        22,   // F
        222,  // G
        2222, // H
        3,    // I
        33,   // J
        333,  // K
        3333, // L
        4,    // M
        44,   // N
        444,  // O
        4444, // P
        5,    // Q
        55,   // R
        555,  // S
        5555, // T
        6,    // U
        66,   // V
        666,  // W
        6666, // X
        7,    // Y
        77    // Z
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String input = scanner.nextLine().toUpperCase();

        if (isValidInput(input)) {
            int[] sandiArray = encodeToSandi(input);
            String sandiString = generateSandiString(sandiArray);
            System.out.println("Hasil sandi: " + sandiString);
        } else {
            System.out.println("Input tidak valid. Masukkan hanya huruf kapital dan spasi.");
        }
        
        scanner.close();
    }

    private static boolean isValidInput(String input) {
        return input.matches("[A-Z ]+");
    }

    private static int[] encodeToSandi(String input) {
        int[] sandiArray = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            sandiArray[i] = getSandiNumber(input.charAt(i));
        }
        return sandiArray;
    }

    private static int getSandiNumber(char c) {
        if (c == ' ') {
            return 0; // untuk spasi
        } else {
            return sandiValues[c - 'A'];
        }
    }

    private static String generateSandiString(int[] sandi) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sandi.length; i++) {
            if (i > 0 && sandi[i] == sandi[i - 1] && sandi[i] != 0) {
                sb.append("-");
            }
            sb.append(sandi[i]);
        }
        return sb.toString();
    }
}
