public class Meja {
    private String bahan;
    private String warna;
    private double panjang;
    private double lebar;
    private double tinggi;

    // Konstruktor
    public Meja(String bahan, String warna, double panjang, double lebar, double tinggi) {
        this.bahan = bahan;
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Metode Getter
    public String getBahan() {
        return bahan;
    }

    public String getWarna() {
        return warna;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }
}
