public class Pena {
    private String merek;
    private String warna;
    private double ukuranUjung;

    // Konstruktor
    public Pena(String merek, String warna, double ukuranUjung) {
        this.merek = merek;
        this.warna = warna;
        this.ukuranUjung = ukuranUjung;
    }

    // Metode Getter
    public String getMerek() {
        return merek;
    }

    public String getWarna() {
        return warna;
    }

    public double getUkuranUjung() {
        return ukuranUjung;
    }
}
