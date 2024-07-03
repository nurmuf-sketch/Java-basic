public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Buku
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 400);
        Buku buku2 = new Buku("Sherlock Holmes", "Arthur Conan Doyle", 300);
        Buku buku3 = new Buku("Lord of the Rings", "J.R.R. Tolkien", 500);

        // Membuat objek dari kelas Pena
        Pena pena1 = new Pena("Pilot", "Hitam", 0.5);
        Pena pena2 = new Pena("Uni-ball", "Biru", 0.7);
        Pena pena3 = new Pena("Faber-Castell", "Merah", 0.8);

        // Membuat objek dari kelas Meja
        Meja meja1 = new Meja("Kayu", "Coklat", 120, 60, 75);
        Meja meja2 = new Meja("Plastik", "Putih", 100, 50, 70);
        Meja meja3 = new Meja("Besi", "Hitam", 150, 70, 80);

        // Menampilkan informasi buku
        System.out.println("Buku 1: " + buku1.getJudul() + " - " + buku1.getPenulis() + ", Halaman: " + buku1.getHalaman());
        System.out.println("Buku 2: " + buku2.getJudul() + " - " + buku2.getPenulis() + ", Halaman: " + buku2.getHalaman());
        System.out.println("Buku 3: " + buku3.getJudul() + " - " + buku3.getPenulis() + ", Halaman: " + buku3.getHalaman());
        System.out.println();

        // Menampilkan informasi pena
        System.out.println("Pena 1: " + pena1.getMerek() + " - " + pena1.getWarna() + ", Ukuran Ujung: " + pena1.getUkuranUjung());
        System.out.println("Pena 2: " + pena2.getMerek() + " - " + pena2.getWarna() + ", Ukuran Ujung: " + pena2.getUkuranUjung());
        System.out.println("Pena 3: " + pena3.getMerek() + " - " + pena3.getWarna() + ", Ukuran Ujung: " + pena3.getUkuranUjung());
        System.out.println();

        // Menampilkan informasi meja
        System.out.println("Meja 1: " + meja1.getBahan() + ", Warna: " + meja1.getWarna() + ", Panjang: " + meja1.getPanjang() + ", Lebar: " + meja1.getLebar() + ", Tinggi: " + meja1.getTinggi());
        System.out.println("Meja 2: " + meja2.getBahan() + ", Warna: " + meja2.getWarna() + ", Panjang: " + meja2.getPanjang() + ", Lebar: " + meja2.getLebar() + ", Tinggi: " + meja2.getTinggi());
        System.out.println("Meja 3: " + meja3.getBahan() + ", Warna: " + meja3.getWarna() + ", Panjang: " + meja3.getPanjang() + ", Lebar: " + meja3.getLebar() + ", Tinggi: " + meja3.getTinggi());
    }
}
