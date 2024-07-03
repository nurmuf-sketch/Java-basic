import java.util.Arrays;
import java.util.Scanner;

public class MengurutkanDataInterger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = new int[3];
        for (int i = 0; i < 3; i++) {
            data[i] = scanner.nextInt();
        }

        sortDescending(data);
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    private static void sortDescending(int[] data) {
        Arrays.sort(data);
        int temp;
        temp = data[2];
        data[2] = data[0];
        data[0] = temp;
    }
}
