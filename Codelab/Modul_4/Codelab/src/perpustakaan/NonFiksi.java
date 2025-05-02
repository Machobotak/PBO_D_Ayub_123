package perpustakaan;

public class NonFiksi extends Buku{
    String bidang;

    public NonFiksi(String penulis, String judul, String bidang) {
        super(penulis, judul);
        this.bidang = bidang;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Non-Fiksi: "+judul+" oleh "+penulis+"(Bidang: "+bidang+")");
    }
}
