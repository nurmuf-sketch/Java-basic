import java.util.Scanner;

public class PrintBilBul {
    public static void main(String[] args) {
        int[] inputNumbers = readInput();
        int x = inputNumbers[0];
        int y = inputNumbers[1];
        String result = generateRange(x, y);
        printOutput(result);
    }

    // Metode untuk membaca input dari pengguna
    private static int[] readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan dua bilangan bulat (X Y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        return new int[]{x, y};
    }

    // Metode untuk menghasilkan rentang bilangan dari X hingga Y
    private static String generateRange(int x, int y) {
        StringBuilder range = new StringBuilder();
        for (int i = x; i <= y; i++) {
            if (i != x) {
                range.append(" ");
            }
            range.append(i);
        }
        return range.toString();
    }

    // Metode untuk mencetak hasil ke layar
    private static void printOutput(String result) {
        System.out.println(result);
    }
}
