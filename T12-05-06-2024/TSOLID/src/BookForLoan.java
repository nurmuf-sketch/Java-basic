public class BookForLoan extends Book {
    private double bookLoanPrice;
    private int stock;

    public BookForLoan(String bookId, String title, String author, double bookPrice, double bookLoanPrice, int stock) {
        super(bookId, title, author, bookPrice);
        this.bookLoanPrice = bookLoanPrice;
        this.stock = stock;
    }

    public double calculateBookLoanPrice() {
        double rateStockPercentage = (stock < 10) ? 0.05 : 0.03;
        double rateBookType = (this instanceof Comic) ? 0.10 : 0.05;
        return (rateStockPercentage + rateBookType) * getBookPrice();
    }

    public double getBookLoanPrice() {
        return bookLoanPrice;
    }

    public void setBookLoanPrice(double bookLoanPrice) {
        this.bookLoanPrice = bookLoanPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
