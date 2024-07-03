import java.util.*;

public class KomposisiKue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double N = scanner.nextDouble();
        int P = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Set<String> kueK = new HashSet<>();
        for (int i = 0; i < P; i++) {
            kueK.add(scanner.nextLine().trim());
        }
        
        int Q = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Set<String> kueL = new HashSet<>();
        for (int i = 0; i < Q; i++) {
            kueL.add(scanner.nextLine().trim());
        }
        
        scanner.close();
        
        // Hitung jumlah bahan yang sama
        Set<String> intersection = new HashSet<>(kueK);
        intersection.retainAll(kueL);
        
        int sameCount = intersection.size();
        
        // Jumlah bahan maksimal
        int maxIngredients = Math.max(P, Q);
        
        // Hitung persentase kesamaan
        double similarityPercentage = (double) sameCount / maxIngredients * 100;
        
        // Tentukan hasil
        if (similarityPercentage >= N) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
    }
}
