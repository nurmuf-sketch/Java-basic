import java.util.Scanner;

public class BinerToDesimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input bilangan biner
        System.out.print("Masukkan bilangan biner: ");
        String biner = scanner.nextLine();
        
        // Mengonversi bilangan biner ke desimal
        int desimal = konversiBinerKeDesimal(biner);
        
        // Menampilkan hasil
        System.out.println("Hasil konversi ke desimal: " + desimal);
        
        scanner.close();
    }
    
    // Method untuk mengonversi bilangan biner ke desimal
    private static int konversiBinerKeDesimal(String biner) {
        // Menggunakan metode perulangan untuk menghitung nilai desimal
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
