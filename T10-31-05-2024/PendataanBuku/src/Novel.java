public class Novel extends CommercialBook {
    private String genre;

    public Novel(String bookCode, String title, Novelis author, Publisher publisher, double cost, String genre) {
        super(bookCode, title, author, publisher, cost);
        this.genre = genre;
        calculatePrice();
    }

    // Getters and Setters
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void calculatePrice() {
        Novelis novelis = (Novelis) getAuthor();
        double productionCost = getCost();

        switch (novelis.getRating()) {
            case "New Comer":
                setPrice(productionCost * 1.25);
                break;
            case "Good":
                setPrice(productionCost * 1.35);
                break;
            case "Best Seller":
                setPrice(productionCost * 1.50);
                break;
            default:
                throw new IllegalStateException("Unexpected rating: " + novelis.getRating());
        }
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
