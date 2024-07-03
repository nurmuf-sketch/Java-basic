import java.util.Scanner;

public class KonversiBinerKeDesimal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String biner = scanner.nextLine();

        int desimal = konversiBinerKeDesimal(biner);
        System.out.println(desimal);
        
        scanner.close();
    }

    private static int konversiBinerKeDesimal(String biner) {
        int desimal = 0;
        int pangkat = 0;
        
        for (int i = biner.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(biner.charAt(i));
            desimal += digit * Math.pow(2, pangkat);
            pangkat++;
        }
        
        return desimal;
    }
}