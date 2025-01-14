public class Novelis extends Author {
    private boolean serial;
    private String rating;

    public Novelis(String firstName, String lastName, String country, int age, boolean serial, String rating) {
        super(firstName, lastName, country, age);
        this.serial = serial;
        this.rating = rating;
    }

    // Getters and Setters
    public boolean isSerial() {
        return serial;
    }

    public void setSerial(boolean serial) {
        this.serial = serial;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Novelis{" +
                "serial=" + serial +
                ", rating='" + rating + '\'' +
                "} " + super.toString();
    }
}
