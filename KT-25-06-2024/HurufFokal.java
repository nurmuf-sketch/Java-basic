import java.util.Scanner;

public class HurufFokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        boolean isVowel = isVowel(input.charAt(0));

        System.out.println(isVowel);
    }

    public static boolean isVowel(char ch) {
        char lowerCase = Character.toLowerCase(ch);

        switch (lowerCase) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
