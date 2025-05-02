package perpustakaan;

public class Fiksi extends Buku {
    String genre;

    public Fiksi(String penulis, String judul, String genre) {
        super(penulis, judul);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi: "+judul+ " oleh "+penulis+ "(Genre: "+genre+")");
    }

}
