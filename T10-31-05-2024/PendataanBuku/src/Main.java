import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    private static List<Author> authors = new ArrayList<>();
    private static List<Publisher> publishers = new ArrayList<>();
    private static List<CommercialBook> books = new ArrayList<>();

    private static void initData() {
        // Create dummy authors
        Author haidar = new Author("Haidar", "Musyafa", "Indonesia", 30);
        Author bert = new Author("Bert", "Bates", "United States", 50);
        Author barry = new Author("Barry", "Burd", "United States", 52);
        Author mark = new Author("Mark", "Manson", "United States", 38);
        Author andi = new Author("Andi", "Susanto", "Indonesia", 32);
        Author adi = new Author("Adi", "Susanto", "Indonesia", 27);
        authors.add(haidar);
        authors.add(bert);
        authors.add(barry);
        authors.add(mark);
        authors.add(andi);
        authors.add(adi);

        // Create dummy publishers
        Publisher bloomsbury = new Publisher("Bloomsbury", "United Kingdom", 30.0);
        Publisher gramedia = new Publisher("Gramedia", "Indonesia", 50.0);
        Publisher mizan = new Publisher("Mizan", "Indonesia", 25.0);
        Publisher shueisha = new Publisher("Shueisha", "Japan", 50.0);
        Publisher elexMed = new Publisher("Elex Media Komputindo", "Indonesia", 12.0);
        Publisher gramPus = new Publisher("Gramedia Pustaka Utama", "Indonesia", 15.0);
        Publisher lionHud = new Publisher("Lion Hudson", "England", 15.0);
        Publisher oReily = new Publisher("O Reilly Media", "United States", 30.0);
        Publisher harperOn = new Publisher("Harper One", "United States", 25.0);
        publishers.add(bloomsbury);
        publishers.add(gramedia);
        publishers.add(mizan);
        publishers.add(shueisha);
        publishers.add(elexMed);
        publishers.add(gramPus);
        publishers.add(lionHud);
        publishers.add(oReily);
        publishers.add(harperOn);

        // Create dummy mangakas
        Mangaka masashi = new Mangaka("Masashi", "Kishimoto", "Japan", 48, "Best Seller");
        Mangaka yoshihiro = new Mangaka("Yoshihiro", "Togashi", "Japan", 56, "Good");
        Mangaka eiichiro = new Mangaka("Eiichiro", "Oda", "Japan", 57, "Best Seller");
        Mangaka rizki = new Mangaka("Rizki", "Anwar", "Indonesia", 25, "New Comer");
        Mangaka yusuf = new Mangaka("Yusuf", "Fadli", "Indonesia", 32, "New Comer");
        authors.add(masashi);
        authors.add(yoshihiro);
        authors.add(eiichiro);
        authors.add(rizki);
        authors.add(yusuf);

        // Create dummy novelists
        Novelis jk = new Novelis("J.K", "Rowling", "England", 45, true, "Best Seller");
        Novelis tere = new Novelis("Tere", "Liye", "Indonesia", 35, true, "Best Seller");
        Novelis dee = new Novelis("Dee", "Lestari", "Indonesia", 30, false, "Good");
        Novelis faisal = new Novelis("Faisal", "Syahreza", "Indonesia", 40, false, "New Comer");
        Novelis julia = new Novelis("Julia", "Golding", "England", 41, false, "Best Seller");
        authors.add(jk);
        authors.add(tere);
        authors.add(dee);
        authors.add(faisal);
        authors.add(julia);

        // Create dummy books
        CommercialBook comic1 = new Comic("Comic-001", "Uzumaki Naruto", masashi, shueisha, 25.0, true);
        CommercialBook comic2 = new Comic("Comic-002", "The Worst Client", masashi, shueisha, 25.0, true);
        CommercialBook comic3 = new Comic("Comic-003", "For the Sake of Dreams...!!", masashi, shueisha, 25.0, true);
        CommercialBook comic4 = new Comic("Comic-004", "Hunter X Hunter : The Day of Departure", yoshihiro, shueisha, 25.0, true);
        CommercialBook comic5 = new Comic("Comic-005", "Hunter X Hunter : A Struggle in the Mist", yoshihiro, shueisha, 25.0, true);
        CommercialBook comic6 = new Comic("Comic-006", "One Piece", eiichiro, gramedia, 50.0, true);
        CommercialBook comic7 = new Comic("Comic-007", "Petualangan di Indonesia", rizki, gramPus, 15.0, false);
        CommercialBook comic8 = new Comic("Comic-008", "Petualangan di Jakarta", yusuf, elexMed, 12.0, false);
        books.add(comic1);
        books.add(comic2);
        books.add(comic3);
        books.add(comic4);
        books.add(comic5);
        books.add(comic6);
        books.add(comic7);
        books.add(comic8);

        CommercialBook nov1 = new Novel("Novel-001", "Harry Potter and the Philosopher's Stone", jk, bloomsbury, 30.0, "Fantasy");
        CommercialBook nov2 = new Novel("Novel-002", "Harry Potter and the Chamber of Secrets", jk, bloomsbury, 30.0, "Fantasy");
        CommercialBook nov3 = new Novel("Novel-003", "Harry Potter and the Prisoner of Azkaban", jk, bloomsbury, 30.0, "Fantasy");
        CommercialBook nov4 = new Novel("Novel-004", "Ayah Aku Berbeda", tere, gramedia, 50.0, "Drama");
        CommercialBook nov5 = new Novel("Novel-005", "Madre", dee, gramedia, 50.0, "Drama");
        CommercialBook nov6 = new Novel("Novel-006", "Lagu untuk Renjana", faisal, mizan, 25.0, "Drama");
        CommercialBook nov7 = new Novel("Novel-007", "Semoga Lekas Lega", faisal, mizan, 25.0, "Drama");
        CommercialBook nov8 = new Novel("Novel-008", "The Abbey Mystery", julia, lionHud, 15.0, "Fiction");
        books.add(nov1);
        books.add(nov2);
        books.add(nov3);
        books.add(nov4);
        books.add(nov5);
        books.add(nov6);
        books.add(nov7);
        books.add(nov8);

        CommercialBook ebook1 = new EBook("Book-001", "Memahami Hamka", haidar, mizan, 25.0);
        CommercialBook ebook2 = new EBook("Book-002", "Head First Java: Your Brain on Java - A Learner's Guide", bert, oReily, 30.0);
        CommercialBook ebook3 = new EBook("Book-003", "Java For Dummies", barry, oReily, 30.0);
        CommercialBook ebook4 = new EBook("Book-004", "Flutter For Dummies", barry, oReily, 30.0);
        CommercialBook ebook5 = new EBook("Book-005", "The Subtle Art of Not Giving", mark, harperOn, 25.0);
        CommercialBook ebook6 = new EBook("Book-006", "Will", mark, harperOn, 25.0);
        CommercialBook ebook7 = new EBook("Book-007", "Sejarah Indonesia", andi, gramPus, 15.0);
        CommercialBook ebook8 = new EBook("Book-008", "Teknologi Baru", adi, elexMed, 12.0);
        books.add(ebook1);
        books.add(ebook2);
        books.add(ebook3);
        books.add(ebook4);
        books.add(ebook5);
        books.add(ebook6);
        books.add(ebook7);
        books.add(ebook8);
    }

    private static void bookMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nBook Menu Searching\n");
            System.out.println("\t1. Cari data book yang memiliki price paling Murah.");
            System.out.println("\t2. Cari data book yang memiliki price paling Mahal.");
            System.out.println("\t3. Cari data book berdasarkan range Price. (Lebih Kecil, C/ masukan price 50. Maka akan menampilkan Book dengan harga 50 Kebawah)");
            System.out.println("\t4. Cari Comic Berdasarkan Rating mangaka.");
            System.out.println("\t5. Cari Book berdasarkan Country dari Publishernya.");
            System.out.println("\t6. Cari Book berdasarkan Country dari Authornya.");
            System.out.println("\t7. Cari data Comic yang memiliki price paling Mahal.");
            System.out.println("\t0. Back to Main Menu\n");

            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    CommercialBook cheapestBook = findCheapestBook();
                    if (cheapestBook != null) {
                        System.out.println("\nBook dengan price paling murah:");
                        System.out.println(cheapestBook);
                    } else {
                        System.out.println("\nTidak ada book yang ditemukan.");
                    }
                    break;
                case 2:
                    CommercialBook mostExpensiveBook = findMostExpensiveBook();
                    if (mostExpensiveBook != null) {
                        System.out.println("\nBook dengan price paling mahal:");
                        System.out.println(mostExpensiveBook);
                    } else {
                        System.out.println("\nTidak ada book yang ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan harga maksimal yang diinginkan: ");
                    double maxPrice = scanner.nextDouble();
                    List<CommercialBook> booksWithinPriceRange = findBooksByPriceRange(maxPrice);
                    if (!booksWithinPriceRange.isEmpty()) {
                        System.out.println("\nBook dengan harga di bawah " + maxPrice + ":");
                        for (CommercialBook book : booksWithinPriceRange) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("\nTidak ada book yang ditemukan dalam rentang harga tersebut.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan rating mangaka yang diinginkan: ");
                    String rating = scanner.nextLine();
                    List<CommercialBook> comicsByMangakaRating = findComicsByMangakaRating(rating);
                    if (!comicsByMangakaRating.isEmpty()) {
                        System.out.println("\nComic dengan rating mangaka " + rating + ":");
                        for (CommercialBook comic : comicsByMangakaRating) {
                            System.out.println(comic);
                        }
                    } else {
                        System.out.println("\nTidak ada comic yang ditemukan dengan rating mangaka tersebut.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan country dari publishernya: ");
                    String publisherCountry = scanner.nextLine();
                    List<CommercialBook> booksByPublisherCountry = findBooksByPublisherCountry(publisherCountry);
                    if (!booksByPublisherCountry.isEmpty()) {
                        System.out.println("\nBook dengan publisher dari " + publisherCountry + ":");
                        for (CommercialBook book : booksByPublisherCountry) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("\nTidak ada book yang ditemukan dengan publisher dari negara tersebut.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan country dari authornya: ");
                    String authorCountry = scanner.nextLine();
                    List<CommercialBook> booksByAuthorCountry = findBooksByAuthorCountry(authorCountry);
                    if (!booksByAuthorCountry.isEmpty()) {
                        System.out.println("\nBook dengan author dari " + authorCountry + ":");
                        for (CommercialBook book : booksByAuthorCountry) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("\nTidak ada book yang ditemukan dengan author dari negara tersebut.");
                    }
                    break;
                case 7:
                    CommercialBook mostExpensiveComic = findMostExpensiveComic();
                    if (mostExpensiveComic != null) {
                        System.out.println("\nComic dengan price paling mahal:");
                        System.out.println(mostExpensiveComic);
                    } else {
                        System.out.println("\nTidak ada comic yang ditemukan.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static CommercialBook findCheapestBook() {
        if (books.isEmpty()) {
            return null;
        }
        CommercialBook cheapestBook = books.get(0);
        for (CommercialBook book : books) {
            if (book.getPrice() < cheapestBook.getPrice()) {
                cheapestBook = book;
            }
        }
        return cheapestBook;
    }

    private static CommercialBook findMostExpensiveBook() {
        if (books.isEmpty()) {
            return null;
        }
        CommercialBook mostExpensiveBook = books.get(0);
        for (CommercialBook book : books) {
            if (book.getPrice() > mostExpensiveBook.getPrice()) {
                mostExpensiveBook = book;
            }
        }
        return mostExpensiveBook;
    }

    private static List<CommercialBook> findBooksByPriceRange(double maxPrice) {
        List<CommercialBook> result = new ArrayList<>();
        for (CommercialBook book : books) {
            if (book.getPrice() <= maxPrice) {
                result.add(book);
            }
        }
        return result;
    }

    private static List<CommercialBook> findComicsByMangakaRating(String rating) {
        List<CommercialBook> result = new ArrayList<>();
        for (CommercialBook book : books) {
            if (book instanceof Comic) {
                Comic comic = (Comic) book;
                if (comic.getMangaka().getRating().equalsIgnoreCase(rating)) {
                    result.add(comic);
                }
            }
        }
        return result;
    }

    private static List<CommercialBook> findBooksByPublisherCountry(String country) {
        List<CommercialBook> result = new ArrayList<>();
        for (CommercialBook book : books) {
            if (book.getPublisher().getCountry().equalsIgnoreCase(country)) {
                result.add(book);
            }
        }
        return result;
    }

    private static List<CommercialBook> findBooksByAuthorCountry(String country) {
        List<CommercialBook> result = new ArrayList<>();
        for (CommercialBook book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getCountry().equalsIgnoreCase(country)) {
                    result.add(book);
                    break; // Avoid duplicates
                }
            }
        }
        return result;
    }

    private static CommercialBook findMostExpensiveComic() {
        CommercialBook mostExpensiveComic = null;
        for (CommercialBook book : books) {
            if (book instanceof Comic) {
                if (mostExpensiveComic == null || book.getPrice() > mostExpensiveComic.getPrice()) {
                    mostExpensiveComic = book;
                }
            }
        }
        return mostExpensiveComic;
    }

    public static void main(String[] args) {
        initData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMain Menu\n");
            System.out.println("\t1. Book");
            System.out.println("\t2. Author");
            System.out.println("\t3. Publisher");
            System.out.println("\t0. Exit\n");

            System.out.print("Masukkan pilihan Anda: ");
            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (mainChoice) {
                case 1:
                    bookMenu(scanner);
                    break;
                case 2:
                    authorMenu(scanner);
                    break;
                case 3:
                    publisherMenu(scanner);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void authorMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nAuthor Menu Searching\n");
            System.out.println("\t1. Cari Data semua Mangaka.");
            System.out.println("\t2. Cari Data semua Author.");
            System.out.println("\t3. Cari Data semua Novelis.");
            System.out.println("\t4. Cari author berdasarkan Range umur.");
            System.out.println("\t5. Cari author berdasarkan Country.");
            System.out.println("\t0. Back to Main Menu\n");

            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    List<Mangaka> mangakas = findAllMangakas();
                    if (!mangakas.isEmpty()) {
                        System.out.println("\nDaftar semua Mangaka:");
                        for (Mangaka mangaka : mangakas) {
                            System.out.println(mangaka);
                        }
                    } else {
                        System.out.println("\nTidak ada Mangaka yang ditemukan.");
                    }
                    break;
                case 2:
                    List<Author> allAuthors = findAllAuthors();
                    if (!allAuthors.isEmpty()) {
                        System.out.println("\nDaftar semua Author:");
                        for (Author author : allAuthors) {
                            System.out.println(author);
                        }
                    } else {
                        System.out.println("\nTidak ada Author yang ditemukan.");
                        break;
                    }
                case 3:
                    List<Novelis> novelists = findAllNovelists();
                    if (!novelists.isEmpty()) {
                        System.out.println("\nDaftar semua Novelis:");
                        for (Novelis novelist : novelists) {
                            System.out.println(novelist);
                        }
                    } else {
                        System.out.println("\nTidak ada Novelis yang ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan range umur awal: ");
                    int startAge = scanner.nextInt();
                    System.out.print("Masukkan range umur akhir: ");
                    int endAge = scanner.nextInt();
                    List<Author> authorsInRange = findAuthorsByAgeRange(startAge, endAge);
                    if (!authorsInRange.isEmpty()) {
                        System.out.println("\nAuthor dengan umur antara " + startAge + " dan " + endAge + ":");
                        for (Author author : authorsInRange) {
                            System.out.println(author);
                        }
                    } else {
                        System.out.println("\nTidak ada Author yang ditemukan dalam range umur tersebut.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan country dari authornya: ");
                    String authorCountry = scanner.nextLine();
                    List<Author> authorsByCountry = findAuthorsByCountry(authorCountry);
                    if (!authorsByCountry.isEmpty()) {
                        System.out.println("\nAuthor dengan negara " + authorCountry + ":");
                        for (Author author : authorsByCountry) {
                            System.out.println(author);
                        }
                    } else {
                        System.out.println("\nTidak ada Author yang ditemukan dengan negara tersebut.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
    
    private static void publisherMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nPublisher Menu Searching\n");
            System.out.println("\t1. Cari Data semua Publisher.");
            System.out.println("\t2. Cari Publisher berdasarkan Range umur.");
            System.out.println("\t3. Cari Publisher berdasarkan Country.");
            System.out.println("\t0. Back to Main Menu\n");

            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    List<Publisher> allPublishers = findAllPublishers();
                    if (!allPublishers.isEmpty()) {
                        System.out.println("\nDaftar semua Publisher:");
                        for (Publisher publisher : allPublishers) {
                            System.out.println(publisher);
                        }
                    } else {
                        System.out.println("\nTidak ada Publisher yang ditemukan.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan range umur awal: ");
                    int startAge = scanner.nextInt();
                    System.out.print("Masukkan range umur akhir: ");
                    int endAge = scanner.nextInt();
                    List<Publisher> publishersInRange = findPublishersByAgeRange(startAge, endAge);
                    if (!publishersInRange.isEmpty()) {
                        System.out.println("\nPublisher dengan umur antara " + startAge + " dan " + endAge + ":");
                        for (Publisher publisher : publishersInRange) {
                            System.out.println(publisher);
                        }
                    } else {
                        System.out.println("\nTidak ada Publisher yang ditemukan dalam range umur tersebut.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan country dari publishernya: ");
                    String publisherCountry = scanner.nextLine();
                    List<Publisher> publishersByCountry = findPublishersByCountry(publisherCountry);
                    if (!publishersByCountry.isEmpty()) {
                        System.out.println("\nPublisher dengan negara " + publisherCountry + ":");
                        for (Publisher publisher : publishersByCountry) {
                            System.out.println(publisher);
                        }
                    } else {
                        System.out.println("\nTidak ada Publisher yang ditemukan dengan negara tersebut.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}

        
                   

