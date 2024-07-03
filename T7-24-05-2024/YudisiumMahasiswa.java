import java.util.Scanner;

public class YudisiumMahasiswa {

    private static final int[] POINTS = {4, 3, 2, 1, 0}; // Poin untuk nilai A, B, C, D, E
    private static final char[] GRADES = {'A', 'B', 'C', 'D', 'E'}; // Karakter nilai
    private static final double[] IPK_BOUNDS = {2, 2.75, 3.5}; // Batas IPK untuk yudisium
    private static final String[] YUDISIUM_RESULTS = {"Pending", "Memuaskan", "Sangat Memuaskan", "Cum Laude"}; // Hasil yudisium

    public static void main(String[] args) {
        int numCourses = readNumberOfCourses();
        char[] grades = readGrades(numCourses);
        double ipk = calculateIPK(grades);
        String yudisium = determineYudisium(grades, ipk);
        System.out.println(yudisium);
    }

    // Metode untuk membaca jumlah mata kuliah dari input pengguna
    private static int readNumberOfCourses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah mata kuliah:");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        return numCourses;
    }

    // Metode untuk membaca nilai-nilai mata kuliah dari input pengguna
    private static char[] readGrades(int numCourses) {
        Scanner scanner = new Scanner(System.in);
        char[] grades = new char[numCourses];
        System.out.println("Masukkan nilai mata kuliah (A, B, C, D, E):");
        for (int i = 0; i < numCourses; i++) {
            grades[i] = scanner.next().charAt(0);
        }
        return grades;
    }

    // Metode untuk menghitung IPK berdasarkan nilai-nilai mata kuliah
    private static double calculateIPK(char[] grades) {
        int totalPoints = 0;
        for (char grade : grades) {
            totalPoints += getPoint(grade);
        }
        return (double) totalPoints / grades.length;
    }

    // Metode untuk menentukan yudisium berdasarkan nilai-nilai mata kuliah dan IPK
    private static String determineYudisium(char[] grades, double ipk) {
        for (char grade : grades) {
            if (grade == 'E') {
                return "Pending";
            }
        }
        return getYudisium(ipk);
    }

    // Metode untuk mendapatkan poin dari nilai mata kuliah
    private static int getPoint(char grade) {
        for (int i = 0; i < GRADES.length; i++) {
            if (GRADES[i] == grade) {
                return POINTS[i];
            }
        }
        throw new IllegalArgumentException("Nilai tidak valid: " + grade);
    }

    // Metode untuk menentukan yudisium berdasarkan IPK
    private static String getYudisium(double ipk) {
        for (int i = IPK_BOUNDS.length - 1; i >= 0; i--) {
            if (ipk >= IPK_BOUNDS[i]) {
                return YUDISIUM_RESULTS[i + 1];
            }
        }
        return YUDISIUM_RESULTS[0];
    }
}
