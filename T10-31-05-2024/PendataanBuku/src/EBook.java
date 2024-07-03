public class EBook extends CommercialBook {

    public EBook(String bookCode, String title, Author author, Publisher publisher, double cost) {
        super(bookCode, title, author, publisher, cost);
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        double productionCost = getCost();
        setPrice(productionCost * 1.20);
    }

    @Override
    public String toString() {
        return "EBook{} " + super.toString();
    }
}
