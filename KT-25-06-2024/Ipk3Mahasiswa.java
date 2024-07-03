import java.util.Scanner;

public class Ipk3Mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array untuk menyimpan nama mahasiswa dan nilai-nilai mata kuliah
        String[] names = new String[3];
        String[][] grades = new String[3][4];
        
        // Membaca input nama dan nilai mata kuliah untuk 3 mahasiswa
        for (int i = 0; i < 3; i++) {
            names[i] = scanner.nextLine(); // Membaca nama mahasiswa
            grades[i] = scanner.nextLine().split(" "); // Membaca nilai mata kuliah
        }
        
        // Bobot sks untuk setiap mata kuliah
        int[] sks = {4, 3, 3, 2};
        
        // Array untuk menyimpan nilai numerik dari nilai A-E
        int[] numericValues = {4, 3, 2, 1, 0};
        
        // Array untuk menyimpan total nilai dan total sks untuk setiap mahasiswa
        double[] totalScore = new double[3];
        int[] totalSks = new int[3];
        
        // Menghitung total nilai dan total sks untuk setiap mahasiswa
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int index = grades[i][j].charAt(0) - 'A'; // Konversi karakter nilai ke indeks
                totalScore[i] += numericValues[index] * sks[j];
                totalSks[i] += sks[j];
            }
        }
        
        // Menghitung IPK untuk setiap mahasiswa
        double[] ipk = new double[3];
        for (int i = 0; i < 3; i++) {
            ipk[i] = totalScore[i] / totalSks[i];
        }
        
        // Menampilkan hasil IPK setiap mahasiswa
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s %.2f\n", names[i], ipk[i]);
        }
        
        scanner.close();
    }
}
