import java.util.Scanner;

public class HargaTermurah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int harga1 = scanner.nextInt();
        int harga2 = scanner.nextInt();

        int hargaTermurah = findMinPrice(harga1, harga2);

        System.out.println(hargaTermurah);
    }

    public static int findMinPrice(int price1, int price2) {
        return (price1 < price2) ? price1 : price2;
    }
}
