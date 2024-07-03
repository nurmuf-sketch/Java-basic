import java.util.Scanner;

public class HurufLubang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kata = scanner.nextLine();

        int[] lubang = new int[128];
        lubang['a'] = 1;
        lubang['b'] = 1;
        lubang['d'] = 1;
        lubang['e'] = 1;
        lubang['g'] = 1;
        lubang['o'] = 1;
        lubang['p'] = 1;
        lubang['q'] = 1;
        lubang['A'] = 1;
        lubang['B'] = 2;
        lubang['D'] = 1;
        lubang['O'] = 1;
        lubang['P'] = 1;
        lubang['Q'] = 1;
        lubang['R'] = 1;
        lubang['0'] = 1;
        lubang['4'] = 1;
        lubang['6'] = 1;
        lubang['8'] = 2;
        lubang['9'] = 1;

        int jumlahLubang = hitungLubang(kata, lubang);
        System.out.println(jumlahLubang);
    }

    public static int hitungLubang(String kata, int[] lubang) {
        int totalLubang = 0;

        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            if (karakter < 128) {
                totalLubang += lubang[karakter];
            }
        }

        return totalLubang;
    }
}
