import java.util.*;

public class KomposisiKue1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca nilai N
        double N = scanner.nextDouble();
        scanner.nextLine(); // Membaca newline setelah nilai N
        
        // Membaca komposisi kue K
        String[] kueK = scanner.nextLine().split(" ");
        
        // Membaca komposisi kue L
        String[] kueL = scanner.nextLine().split(" ");
        
        // Menghitung jumlah bahan yang sama antara kue K dan kue L
        int jumlahSama = countSameIngredients(kueK, kueL);
        
        // Menghitung total bahan dari kue K dan kue L
        int totalBahanK = kueK.length;
        int totalBahanL = kueL.length;
        
        // Menghitung minimum bahan yang harus sama untuk dikategorikan sebagai "sama"
        double threshold = N / 100.0 * Math.max(totalBahanK, totalBahanL);
        
        // Menentukan hasil berdasarkan jumlahSama dan threshold
        if (jumlahSama >= threshold) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung jumlah bahan yang sama antara dua komposisi kue
    private static int countSameIngredients(String[] kueK, String[] kueL) {
        Set<String> setK = new HashSet<>(Arrays.asList(kueK));
        Set<String> setL = new HashSet<>(Arrays.asList(kueL));
        
        // Intersection of sets to find common elements
        setK.retainAll(setL);
        
        return setK.size();
    }
}
