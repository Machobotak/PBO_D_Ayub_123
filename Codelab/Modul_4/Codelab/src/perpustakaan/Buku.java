package perpustakaan;

public abstract class Buku {
    String judul;
    String penulis;

    public Buku(String penulis, String judul) {
        this.penulis = penulis;
        this.judul = judul;
    }

    public abstract void displayInfo();
}
