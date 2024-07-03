import java.util.Arrays;
import java.util.Scanner;

public class UrutanTerbesarAngka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.println("Masukkan tiga bilangan bulat:");
        int[] data = new int[3];
        for (int i = 0; i < 3; i++) {
            data[i] = scanner.nextInt();
        }

        // Mengurutkan data secara descending
        sortDescending(data);

        // Menampilkan hasil
        System.out.println("Bilangan setelah diurutkan:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    // Method untuk mengurutkan data secara descending
    private static void sortDescending(int[] data) {
        Arrays.sort(data);
        int temp;
        // Swap the elements
        temp = data[2];
        data[2] = data[0];
        data[0] = temp;
    }
}
