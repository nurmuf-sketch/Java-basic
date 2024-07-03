public class Buku {
    private String judul;
    private String penulis;
    private int halaman;

    // Konstruktor
    public Buku(String judul, String penulis, int halaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.halaman = halaman;
    }

    // Metode Getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHalaman() {
        return halaman;
    }
}
