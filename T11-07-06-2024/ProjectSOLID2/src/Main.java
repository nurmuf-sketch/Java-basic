import java.util.List;
import java.util.Scanner;

public class Main {
    private static EmployeeRepository repository = new EmployeeRepository();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("\nSelamat Datang di Aplikasi Pendataan Karyawan PT. Secret Semut 79");
            System.out.println("1. Tambah Employee");
            System.out.println("2. Edit Employee");
            System.out.println("3. Data Employee");
            System.out.println("4. Data Payroll");
            System.out.println("5. Hapus Employee");
            System.out.println("6. Cari Employee by Placement");
            System.out.println("0. Keluar");
            System.out.print("\nPilih Menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    tambahEmployee();
                    break;
                case 2:
                    editEmployee();
                    break;
                case 3:
                    dataEmployees();
                    break;
                case 4:
                    dataPayroll();
                    break;
                case 5:
                    hapusEmployee();
                    break;
                case 6:
                    cariEmployee();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        } while (menu != 0);
    }

    private static void tambahEmployee() {
        System.out.println("\nTambah Employee:");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Alamat: ");
        String address = scanner.nextLine();
        System.out.print("Umur: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Pilih Posisi (Programmer, Project Leader, Analyst, General Employee): ");
        String jobDesc = scanner.nextLine();

        System.out.print("Jobdesk: ");
        String jobDesk = scanner.nextLine();

        System.out.print("Pilih Kota Penempatan (Garut, Bandung, Jakarta, Bekasi, Bogor): ");
        String cityName = scanner.nextLine();
        Placement placement = repository.getPlacementByCity(cityName);

        Employee employee;
        switch (jobDesc.toLowerCase()) {
            case "programmer":
                System.out.print("Bahasa Pemrograman: ");
                String programmingLanguage = scanner.nextLine();
                System.out.print("Pengalaman (tahun): ");
                int experiences = scanner.nextInt();
                scanner.nextLine();
                employee = new Programmer(name, address, age, generateUniqueId("Prog"), jobDesk, placement, programmingLanguage, experiences);
                break;
            case "project leader":
                System.out.print("Jumlah Project: ");
                int totalProject = scanner.nextInt();
                scanner.nextLine();
                employee = new ProjectLeader(name, address, age, generateUniqueId("PL"), jobDesk, placement, totalProject);
                break;
            case "analyst":
                employee = new Analyst(name, address, age, generateUniqueId("AL"), jobDesk, placement);
                break;
            default:
                employee = new GeneralEmployee(name, address, age, generateUniqueId("Emp"), jobDesk, placement);
                break;
        }

        repository.addEmployee(employee);
        System.out.println("Employee berhasil ditambahkan dengan ID: " + employee.getEmployeeId());
        kembaliKeMenuUtama();
    }

    private static void editEmployee() {
        System.out.println("\nEdit Employee:");
        System.out.print("Masukkan Employee ID: ");
        String employeeId = scanner.nextLine();
        Employee employee = repository.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee dengan ID tersebut tidak ditemukan.");
            kembaliKeMenuUtama();
            return;
        }

        System.out.println("Data saat ini:");
        System.out.println("Nama: " + employee.getName());
        System.out.println("Alamat: " + employee.getAddress());
        System.out.println("Umur: " + employee.getAge());
        System.out.println("Posisi: " + employee.getJobDesc());
        System.out.println("Penempatan: " + employee.getPlacement().getCityName());

        System.out.print("\nUpdate penempatan ke Kota: ");
        String cityName = scanner.nextLine();
        Placement placement = repository.getPlacementByCity(cityName);
        if (placement == null) {
            System.out.println("Kota penempatan tidak valid.");
            kembaliKeMenuUtama();
            return;
        }

        employee.updatePlacement(placement);
        System.out.println("Penempatan berhasil diperbarui.");
        kembaliKeMenuUtama();
    }

    private static void dataEmployees() {
        List<Employee> employees = repository.getAllEmployees();
        System.out.println("\nData Employee:");
        System.out.printf("%-4s %-10s %-15s %-15s %-5s %-20s %-10s\n",
                "No", "Employee Id", "Name", "Address", "Age", "Job Desc", "Placement");
        int i = 1;
        for (Employee employee : employees) {
            System.out.printf("%-4d %-10s %-15s %-15s %-5d %-20s %-10s\n",
                    i++, employee.getEmployeeId(), employee.getName(), employee.getAddress(),
                    employee.getAge(), employee.getJobDesc(), employee.getPlacement().getCityName());
        }
        System.out.println("0. Kembali ke Main Menu");
        System.out.print("\nPilih Menu: ");
        int pilihan = scanner.nextInt();
        if (pilihan == 0) {
            kembaliKeMenuUtama();
        } else {
            dataEmployees();
        }
    }

    private static void dataPayroll() {
        List<Employee> employees = repository.getAllEmployees();
        System.out.println("\nData Payroll:");
        System.out.printf("%-4s %-10s %-15s %-15s %-5s %-20s %-10s\n",
                "No", "Employee Id", "Name", "Job Desc", "Placement", "Allowance", "Salary");
        int i = 1;
        int totalPayroll = 0;
        for (Employee employee : employees) {
            int allowance = employee.getAllowance();
            int salary = employee.getSalary();
            System.out.printf("%-4d %-10s %-15s %-15s %-5s %-20s %-10d\n",
                    i++, employee.getEmployeeId(), employee.getName(), employee.getJobDesc(),
                    employee.getPlacement().getCityName(), allowance, salary);
            totalPayroll += (allowance + salary);
        }
        System.out.printf("%-4s %-10s %-15s %-15s %-5s %-20s %-10d\n",
                "Total Payroll", "", "", "", "", "", totalPayroll);
        System.out.println("0. Kembali ke Main Menu");
        System.out.print("\nPilih Menu: ");
        int pilihan = scanner.nextInt();
        if (pilihan == 0) {
            kembaliKeMenuUtama();
        } else {
            dataPayroll();
        }
    }

    private static void hapusEmployee() {
        System.out.print("\nMasukkan Employee ID yang akan dihapus: ");
        String employeeId = scanner.nextLine();
        repository.deleteEmployee(employeeId);
        System.out.println("Employee dengan ID " + employeeId + " berhasil dihapus.");
        kembaliKeMenuUtama();
    }

    private static void cariEmployee() {
        System.out.print("\nCari Employee by Placement - Masukkan Nama Kota: ");
        String cityName = scanner.nextLine();
        List<Employee> employees = repository.getEmployeesByPlacement(cityName);
        if (employees.isEmpty()) {
            System.out.println("Tidak ada employee yang ditemukan di kota " + cityName);
        } else {
            System.out.println("\nData Employee di Kota " + cityName + ":");
            System.out.printf("%-4s %-10s %-15s %-15s %-5s %-20s %-10s\n",
                    "No", "Employee Id", "Name", "Address", "Age", "Job Desc", "Placement");
            int i = 1;
            for (Employee employee : employees) {
                System.out.printf("%-4d %-10s %-15s %-15s %-5d %-20s %-10s\n",
                        i++, employee.getEmployeeId(), employee.getName(), employee.getAddress(),
                        employee.getAge(), employee.getJobDesc(), employee.getPlacement().getCityName());
            }
        }
        kembaliKeMenuUtama();
    }

    private static void kembaliKeMenuUtama() {
        System.out.println("\nTekan enter untuk kembali ke menu utama...");
        scanner.nextLine();
    }

    private static String generateUniqueId(String prefix) {
        List<Employee> employees = repository.getAllEmployees();
        int prefixCount = 0;
        for (Employee emp : employees) {
            if (emp.getEmployeeId().startsWith(prefix)) {
                prefixCount++;
            }
        }
        return prefix + "-" + String.format("%03d", prefixCount + 1);
    }
}
