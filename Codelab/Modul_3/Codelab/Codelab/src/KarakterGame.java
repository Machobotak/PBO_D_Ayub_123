public class KarakterGame {//mendeklarasi kelas KarakterGame yang nanti akan diwarisi ke Class Pahlawan dan Musuh
    private String nama;//mendeklarasi atribut yang digunakan untuk menyimpan nama karakter menggunakan modifier private
    private int kesehatan;//mendeklarasi atribut yang digunakan untuk menyimpan kesehatan (darah karakter) dalam bentuk integer menggunakan modifier private

    public KarakterGame(String nama, int kesehatan) {//membuat constructor untuk menginisialisasi nama dan kesehatan pada saat membuat objek
        this.nama = nama;//digunakan untuk membedakan antara atribut yang kita buat dengan paramater yamg nanti akan kita panggil saat membuat objek, sehingga saat kita memasukkan nilai pada parameter maka akan langsung masuk ke atribut
        this.kesehatan = kesehatan;//digunakan untuk membedakan antara atribut yang kita buat dengan paramater yamg nanti akan kita panggil saat membuat objek, sehingga saat kita memasukkan nilai pada parameter maka akan langsung masuk ke atribut
    }

    public String getNama() {//membuat method getter yang nanti digunakan untuk mengambil nilai nama karakter
        return nama;//ketika kita memanggil method ini maka akan langsung mengembalikan nilai nama
    }

    public int getKesehatan() {//membuat method getter yang nanti digunakan untuk mengambil nilai kesehatan
        return kesehatan;//ketika kita memanggil method ini maka akan langsung mengembalikan nilai kesehatan
    }

    public void setKesehatan(int kesehatan) {//membuat method setter yang digunakan untuk mengganti nilai kesehatan karakter
        this.kesehatan = kesehatan;//digunakan untuk mengupdate nilai kesehatan
    }

    public void serang (KarakterGame target){//mendeklarasikan method serang yang nanti akan digunakan pada subclass
        System.out.println(nama+ " menyerang" + target.getNama() +"!");//menampilkan teks serangan dasar nanti ini bisa diubah disubclass sesuai dengan keingingan
    }
}
