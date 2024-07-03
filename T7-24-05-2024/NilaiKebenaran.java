import java.util.Scanner;

public class NilaiKebenaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bilangan = scanner.nextInt();
        int cek = 0;
        
        if (isKelipatanTigaDanEmpat(bilangan)) {
            cek = 1;
        }
        
        System.out.println(cek);
    }
    
    // Method untuk mengecek apakah suatu bilangan merupakan kelipatan 3 dan 4
    public static boolean isKelipatanTigaDanEmpat(int bilangan) {
        return bilangan % 3 == 0 && bilangan % 4 == 0;
    }
}
