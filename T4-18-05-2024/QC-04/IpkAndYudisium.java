import java.util.Scanner;

public class IpkAndYudisium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Arrays for harkat and corresponding values
        String[] harkatList = {"A", "B", "C", "D", "E"};
        int[] nilaiList = {4, 3, 2, 1, 0};
        
        // Arrays for yudisium and corresponding thresholds
        String[] yudisiumList = {"Cum Laude", "Sangat Memuaskan", "Memuaskan", "Pending"};
        double[] ipkThresholds = {3.5, 2.75, 2, 0}; // descending order for easier comparison

        System.out.print("Masukkan jumlah modul: ");
        int banyakModule = Integer.parseInt(input.nextLine());
        
        String[] arrNamaModule = new String[banyakModule];
        String[] arrHarkat = new String[banyakModule];
        int[] arrSks = new int[banyakModule];
        int[] arrScore = new int[banyakModule];
        
        for (int i = 0; i < banyakModule; i++) {
            System.out.print("Masukkan nama modul: ");
            arrNamaModule[i] = input.nextLine();
            
            System.out.print("Masukkan jumlah SKS: ");
            arrSks[i] = Integer.parseInt(input.nextLine());
            
            System.out.print("Masukkan harkat (A, B, C, D, E): ");
            arrHarkat[i] = input.nextLine().toUpperCase();
            
            arrScore[i] = convertHarkat(arrHarkat[i], harkatList, nilaiList) * arrSks[i];
        }
        
        int totalScore = calculateTotalValue(arrScore);
        int totalSks = calculateTotalValue(arrSks);
        double ipk = calculateIpk(totalSks, totalScore);
        boolean isPending = isPendingValidation(arrHarkat);
        String statusYudisium = getYudisium(isPending, ipk, yudisiumList, ipkThresholds);
        
        printHasil("Talent", ipk, totalSks, statusYudisium, arrNamaModule, arrHarkat);
    }
    
    public static int convertHarkat(String harkat, String[] harkatList, int[] nilaiList) {
        for (int i = 0; i < harkatList.length; i++) {
            if (harkat.equals(harkatList[i])) {
                return nilaiList[i];
            }
        }
        throw new IllegalArgumentException("Harkat tidak valid: " + harkat);
    }

    public static String getYudisium(boolean isPending, double ipk, String[] yudisiumList, double[] ipkThresholds) {
        if (isPending) {
            return yudisiumList[yudisiumList.length - 1];
        }

        for (int i = 0; i < ipkThresholds.length; i++) {
            if (ipk >= ipkThresholds[i]) {
                return yudisiumList[i];
            }
        }

        return yudisiumList[yudisiumList.length - 1];
    }
    
    public static double calculateIpk(int totalSks, int totalScore) {
        return (double) totalScore / totalSks;
    }
    
    public static boolean isPendingValidation(String[] arrHarkat) {
        for (String harkat : arrHarkat) {
            if (harkat.equals("E")) {
                return true;
            }
        }
        return false;
    }
    
    public static int calculateTotalValue(int[] arrValue) {
        int total = 0;
        for (int value : arrValue) {
            total += value;
        }
        return total;
    }
    
    public static void printHasil(String namaTalent, double ipk, int totalSks, String statusYudisium, String[] arrModule, String[] arrHarkat) {
        System.out.println("Yudisium: " + statusYudisium);
        System.out.printf("IPK: %.2f\n", ipk);
        System.out.printf("Total SKS: %.1f\n", (double) totalSks);
        System.out.println("Total Module: " + arrModule.length);
        
        for (int i = 0; i < arrModule.length; i++) {
            System.out.println((i + 1) + ". " + arrModule[i] + " (" + arrHarkat[i] + ")");
        }
    }
}
