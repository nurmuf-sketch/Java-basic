public class Comic extends CommercialBook {
    private boolean volumeSeries;

    public Comic(String bookCode, String title, Mangaka author, Publisher publisher, double cost, boolean volumeSeries) {
        super(bookCode, title, author, publisher, cost);
        this.volumeSeries = volumeSeries;
        calculatePrice();
    }

    // Getters and Setters
    public boolean isVolumeSeries() {
        return volumeSeries;
    }

    public void setVolumeSeries(boolean volumeSeries) {
        this.volumeSeries = volumeSeries;
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        Mangaka mangaka = (Mangaka) getAuthor();
        double productionCost = getCost();
        double price;

        switch (mangaka.getRating()) {
            case "New Comer":
                price = volumeSeries ? productionCost * 1.35 : productionCost * 1.25;
                break;
            case "Good":
                price = volumeSeries ? productionCost * 1.45 : productionCost * 1.30;
                break;
            case "Best Seller":
                price = volumeSeries ? productionCost * 1.50 : productionCost * 1.40;
                break;
            default:
                throw new IllegalStateException("Unexpected rating: " + mangaka.getRating());
        }
        setPrice(price);
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "volumeSeries=" + volumeSeries +
                "} " + super.toString();
    }
}
