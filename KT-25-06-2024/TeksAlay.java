import java.util.Scanner;

public class TeksAlay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] huruf = {'a', 'i', 'z', 'e', 'g', 'j', 'b'};
        char[] alay = {'4', '1', '2', '3', '6', '7', '8'};

        String kalimat = scanner.nextLine();

        String kalimatAlay = ubahKeAlay(kalimat, huruf, alay);
        System.out.println(kalimatAlay);

        scanner.close();
    }

    private static String ubahKeAlay(String kalimat, char[] huruf, char[] alay) {
        StringBuilder kalimatAlay = new StringBuilder();
        for (int i = 0; i < kalimat.length(); i++) {
            char currentChar = kalimat.charAt(i);
            boolean hurufBesar = Character.isUpperCase(currentChar);

            boolean found = false;
            for (int j = 0; j < huruf.length; j++) {
                if (Character.toLowerCase(currentChar) == huruf[j]) {
                    if (hurufBesar) {
                        kalimatAlay.append(Character.toUpperCase(alay[j]));
                    } else {
                        kalimatAlay.append(alay[j]);
                    }
                    found = true;
                    break;
                }
            }

            if (!found) {
                kalimatAlay.append(currentChar);
            }
        }

        return kalimatAlay.toString();
    }
}
