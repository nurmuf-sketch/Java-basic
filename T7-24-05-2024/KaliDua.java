import java.util.Scanner;

public class KaliDua {
    public static void main(String[] args) {
        int inputNumber = readInput();
        int doubledNumber = calculateDouble(inputNumber);
        printOutput(doubledNumber);
    }

    // Metode untuk membaca input dari pengguna
    private static int readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat (0 ≤ X ≤ 100): ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        return inputNumber;
    }

    // Metode untuk menghitung dua kali lipat dari bilangan yang diinputkan
    private static int calculateDouble(int number) {
        return number * 2;
    }

    // Metode untuk mencetak hasil ke layar
    private static void printOutput(int result) {
        System.out.println(result);
    }
}
