import java.util.*;

public class SangJuara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca jumlah pemenang catur dan nama-namanya
        int N = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character
        Set<String> chessWinners = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String winnerName = scanner.nextLine().trim();
            chessWinners.add(winnerName);
        }
        
        // Membaca jumlah pemenang badminton dan nama-namanya
        int M = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character
        Set<String> badmintonWinners = new HashSet<>();
        for (int i = 0; i < M; i++) {
            String winnerName = scanner.nextLine().trim();
            badmintonWinners.add(winnerName);
        }
        
        // Mencari nama yang menjadi juara di kedua cabang lomba
        List<String> dualChampions = new ArrayList<>();
        for (String name : chessWinners) {
            if (badmintonWinners.contains(name)) {
                dualChampions.add(name);
            }
        }
        
        // Jika tidak ada yang menjadi juara di kedua cabang lomba
        if (dualChampions.isEmpty()) {
            System.out.println("tidak ada sang juara");
        } else {
            // Mengurutkan nama-nama dual champion secara descending
            Collections.sort(dualChampions, Collections.reverseOrder());
            
            // Menampilkan hasil
            for (String name : dualChampions) {
                System.out.println(name);
            }
        }
        
        scanner.close();
    }
}
