public class Musuh extends KarakterGame {//mendeklarasikan class Musuh yang merupakan anak/subclass dari superclass Karaktergame
    public Musuh(String nama, int kesehatan){//memanggil constructor dari Class KarakterGame
        super(nama,kesehatan);//digunakan untuk mengakses atribut nama dan kesehatan dari superclass
    }

    @Override//digunakan untuk memanggil method serang yang ada di superclass Karaktergame untuk diubah pada class ini tanpa mengubahnya di superclass KarakterGame
    public void serang(KarakterGame target) {//memanggil method serang yang digunakan untuk menyerang pahlawan menggunakan snake bite
        System.out.println(getNama()+ " menyerang "+target.getNama()+" menggunakan Snake Bite!");;//output untuk menampilkan teks namamusuh menyerang namapahlawan menggunakan snake bite
        target.setKesehatan(target.getKesehatan()-15);//digunakan untuk mengurangi kesehatan dari pahlawan/target sebesar 15
        System.out.println(target.getNama()+ " sekarang memiliki kesehatan "+target.getKesehatan());//output untuk menampilkan sisa kesehatan yang dimiliki oleh pahlawan yang terkena serangan
    }
}
