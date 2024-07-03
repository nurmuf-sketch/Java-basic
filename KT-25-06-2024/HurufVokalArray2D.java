import java.util.Scanner;

public class HurufVokalArray2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] array = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.next().charAt(0);
            }
        }

        findAndDisplayVowels(array);
        
        scanner.close();
    }

    private static void findAndDisplayVowels(char[][] array) {
        boolean foundVowel = false;

        String[] positions = new String[9];
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char ch = array[i][j];
                if (isVowel(ch)) {
                    foundVowel = true;
                    positions[count] = ch + ": (" + (i + 1) + "," + (j + 1) + ")";
                    count++;
                }
            }
        }

        if (foundVowel) {
            for (int k = 0; k < count; k++) {
                System.out.println(positions[k]);
            }
        } else {
            System.out.println("tidak ada huruf vokal");
        }
    }

    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
