import java.util.Scanner;

public class BalikKata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan teks untuk dibalik:");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);
        System.out.println(reversedString);

        scanner.close();
    }

    // Method untuk membalikkan string
    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }
}
