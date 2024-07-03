public class Mangaka extends Author {
    private String rating;

    public Mangaka(String firstName, String lastName, String country, int age, String rating) {
        super(firstName, lastName, country, age);
        this.rating = rating;
    }

    // Getters and Setters
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Mangaka{" +
                "rating='" + rating + '\'' +
                "} " + super.toString();
    }
}
