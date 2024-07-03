import java.util.Scanner;

public class PrintBilBulKeBawah {
    public static void main(String[] args) {
        int[] inputNumbers = readInput();
        int x = inputNumbers[0];
        int y = inputNumbers[1];
        int[] range = generateRange(x, y);
        printOutput(range);
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
    private static int[] generateRange(int x, int y) {
        int[] range = new int[y - x + 1];
        for (int i = 0; i < range.length; i++) {
            range[i] = x + i;
        }
        return range;
    }

    // Metode untuk mencetak hasil ke layar
    private static void printOutput(int[] range) {
        for (int number : range) {
            System.out.println(number);
        }
    }
}
