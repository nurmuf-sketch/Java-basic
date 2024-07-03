import java.util.Scanner;

public class GanjilGenapNol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        String result = determineOddEvenZero(X);
        System.out.println(result);
        
        scanner.close();
    }

    private static String determineOddEvenZero(int X) {
        if (X == 0) {
            return "nol";
        } else if (X % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }
    }
}
