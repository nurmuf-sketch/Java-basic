import java.util.Scanner;

public class WujudBenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan suhu benda:");
        double suhu = scanner.nextDouble();

        String wujud = determinateWujud(suhu);
        System.out.println(wujud);

        scanner.close();
    }

    // Method untuk menentukan wujud benda
    private static String determinateWujud(double suhu) {
        if (suhu >= 0 && suhu <= 100) {
            return "berwujud cair";
        } else {
            return "berwujud non cair";
        }
    }
}
