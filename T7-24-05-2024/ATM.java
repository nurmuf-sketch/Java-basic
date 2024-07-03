import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah uang yang akan diambil dan saldo rekening Eva
        System.out.println("Masukkan jumlah uang yang akan diambil dan saldo rekening Eva:");
        int amountToWithdraw = scanner.nextInt();
        double currentBalance = scanner.nextDouble();

        // Memanggil method untuk menghitung saldo setelah transaksi
        double newBalance = calculateNewBalance(amountToWithdraw, currentBalance);

        // Menampilkan saldo rekening Eva setelah transaksi
        System.out.printf("%.2f\n", newBalance);

        scanner.close();
    }

    // Method untuk menghitung saldo rekening setelah transaksi
    private static double calculateNewBalance(int amountToWithdraw, double currentBalance) {
        // Jika saldo tidak mencukupi untuk melakukan transaksi
        if (currentBalance < amountToWithdraw + 0.5 || amountToWithdraw % 5 != 0) {
            return currentBalance;
        }

        // Menghitung biaya transaksi
        double transactionFee = 0.5;

        // Menghitung saldo setelah transaksi
        double newBalance = currentBalance - amountToWithdraw - transactionFee;

        return newBalance;
    }
}
