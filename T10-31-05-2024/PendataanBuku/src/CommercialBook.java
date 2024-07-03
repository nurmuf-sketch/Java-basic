public abstract class CommercialBook {
    private String bookCode;
    private String title;
    private Author author;
    private Publisher publisher;
    private double cost;
    private double price;

    public CommercialBook(String bookCode, String title, Author author, Publisher publisher, double cost) {
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.cost = cost;
    }

    // Getters and Setters
    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
        calculatePrice();
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public abstract void calculatePrice();  // Abstract method to calculate price

    @Override
    public String toString() {
        return "CommercialBook{" +
                "bookCode='" + bookCode + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}
