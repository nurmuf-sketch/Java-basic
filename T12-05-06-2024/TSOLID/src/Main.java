import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<BookForLoan> booksForLoan = RepositoryBookForLoan.getAllBookForLoan();
    private static List<Member> members = RepositoryMember.getAllMember();
    private static List<LoanBookOrder> loanBookOrders = new ArrayList<>();
    private static int loanIdCounter = 1;

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        int choice;
        do {
            System.out.println("\nAplikasi Rental Buku Cucux 79");
            System.out.println("1. Data All Book For Loan");
            System.out.println("2. Loan");
            System.out.println("3. Return");
            System.out.println("4. Data All Loan Book Order");
            System.out.println("0. Exit");
            System.out.print("\nMasukkan pilihan Anda: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    menuListAllBook();
                    break;
                case 2:
                    menuLoanBook();
                    break;
                case 3:
                    menuReturnBook();
                    break;
                case 4:
                    menuListLoanOrder();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);  // Menghentikan program saat memilih "0. Exit"
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 0);
    }

    private static void menuListAllBook() {
        System.out.println("\nMenu Data Book For Loan");
        System.out.println("No\tBook ID\t\tTitle\t\t\t\t\t\tAuthor\t\tStock");
        System.out.println("========================================================================================");
        int i = 1;
        for (BookForLoan book : booksForLoan) {
            System.out.printf("%-2d\t%-8s\t%-40s\t%-15s\t%d\n", i, book.getBookId(), book.getTitle(), book.getAuthor(), book.getStock());
            i++;
        }
        System.out.println("0\tKembali ke Main Menu");
        handleUserChoice();
    }

    private static void menuLoanBook() {
        System.out.println("\nMenu Loan");

        // Display list of members
        System.out.println("List Member:");
        System.out.println("No\tMember ID\tMember Name\t\tAddress");
        System.out.println("============================================================");
        int i = 1;
        for (Member member : members) {
            System.out.printf("%-2d\t%-8s\t%-15s\t%-20s\n", i, member.getMemberId(), member.getMemberName(), member.getAddress());
            i++;
        }
        System.out.println("0\tKembali ke Main Menu");

        // Select member
        System.out.print("\nMasukan Member Id: ");
        String memberId = scanner.nextLine();
        if (memberId.equals("0")) {
            displayMainMenu();
            return;
        }
        Member selectedMember = null;
        for (Member member : members) {
            if (member.getMemberId().equalsIgnoreCase(memberId)) {
                selectedMember = member;
                break;
            }
        }
        if (selectedMember == null) {
            System.out.println("Member tidak ditemukan.");
            displayMainMenu();
            return;
        }

        // Display list of books for loan
        System.out.println("\nList Buku yang Tersedia untuk Dipinjam:");
        System.out.println("No\tBook ID\t\tTitle\t\t\t\t\t\tAuthor\t\tStock");
        System.out.println("========================================================================================");
        i = 1;
        List<BookForLoan> availableBooks = new ArrayList<>();
        for (BookForLoan book : booksForLoan) {
            if (book.getStock() > 0) {
                System.out.printf("%-2d\t%-8s\t%-40s\t%-15s\t%d\n", i, book.getBookId(), book.getTitle(), book.getAuthor(), book.getStock());
                availableBooks.add(book);
                i++;
            }
        }
        System.out.println("0\tKembali ke Main Menu");

        // Select book
        System.out.print("\nMasukan Book Id: ");
        String bookId = scanner.nextLine();
        if (bookId.equals("0")) {
            displayMainMenu();
            return;
        }
        BookForLoan selectedBook = null;
        for (BookForLoan book : availableBooks) {
            if (book.getBookId().equalsIgnoreCase(bookId)) {
                selectedBook = book;
                break;
            }
        }
        if (selectedBook == null) {
            System.out.println("Buku tidak ditemukan.");
            displayMainMenu();
            return;
        }

        // Input loan duration
        System.out.print("Lama Peminjaman (hari): ");
        int loanDuration = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        // Calculate loan fee
        double bookLoanPrice = selectedBook.calculateBookLoanPrice();
        double loanFee = loanDuration * bookLoanPrice;

        // Create loan book order
        String loanId = "Ord-" + loanIdCounter;
        LoanBookOrder loanBookOrder = new LoanBookOrder(loanId, selectedMember, selectedBook, loanDuration, loanFee);
        loanBookOrders.add(loanBookOrder);
        loanIdCounter++;

        // Decrease stock
        selectedBook.setStock(selectedBook.getStock() - 1);

        System.out.println("\nLoan Success!");

        handleUserChoice();
    }

    private static void menuReturnBook() {
        System.out.println("\nMenu Return");

        // Display list of loan book orders
        System.out.println("List Loan Book Order:");
        System.out.println("No\tLoan ID\t\tMember Name\t\tBook ID\t\tTitle\t\t\t\t\t\tLoan Book Price\tLoan Duration\tLoan Fee");
        System.out.println("================================================================================================================================");
        int i = 1;
        for (LoanBookOrder loan : loanBookOrders) {
            System.out.printf("%-2d\t%-8s\t%-15s\t%-8s\t%-40s\t%-15.2f\t%-14d\t%.2f\n", i, loan.getLoanId(), loan.getMember().getMemberName(), loan.getLoanBook().getBookId(), loan.getLoanBook().getTitle(), loan.getBookLoanPrice(), loan.getLoanDuration(), loan.getLoanFee());
            i++;
        }
        System.out.println("0\tKembali ke Main Menu");

        // Select loan book order to return
        System.out.print("\nMasukkan Loan ID: ");
        String loanId = scanner.nextLine();
        if (loanId.equals("0")) {
            displayMainMenu();
            return;
        }
        LoanBookOrder selectedLoan = null;
        for (LoanBookOrder loan : loanBookOrders) {
            if (loan.getLoanId().equalsIgnoreCase(loanId)) {
                selectedLoan = loan;
                break;
            }
        }
        if (selectedLoan == null) {
            System.out.println("Loan ID tidak ditemukan.");
            displayMainMenu();
            return;
        }

        // Increase stock
        selectedLoan.getLoanBook().setStock(selectedLoan.getLoanBook().getStock() + 1);

        // Remove loan book order from list
        loanBookOrders.remove(selectedLoan);

        System.out.println("\nReturn Book Success!");

        handleUserChoice();
    }

    private static void menuListLoanOrder() {
        System.out.println("\nMenu Data Loan Book Order");
        System.out.println("No\tLoan ID\t\tMember Name\t\tBook ID\t\tTitle\t\t\t\t\t\tLoan Book Price\tLoan Duration\tLoan Fee");
        System.out.println("================================================================================================================================");
        int i = 1;
        for (LoanBookOrder loan : loanBookOrders) {
            System.out.printf("%-2d\t%-8s\t%-15s\t%-8s\t%-40s\t%-15.2f\t%-14d\t%.2f\n", i, loan.getLoanId(), loan.getMember().getMemberName(), loan.getLoanBook().getBookId(), loan.getLoanBook().getTitle(), loan.getBookLoanPrice(), loan.getLoanDuration(), loan.getLoanFee());
            i++;
        }
        System.out.println("0\tKembali ke Main Menu");
        handleUserChoice();
    }

    private static void handleUserChoice() {
        System.out.print("\nMasukkan pilihan Anda: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline character
        switch (choice) {
            case 0:
                displayMainMenu();
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                handleUserChoice();
        }
    }
}
