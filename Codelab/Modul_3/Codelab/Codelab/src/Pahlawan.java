public class Pahlawan extends KarakterGame {//mendeklarasikan class Pahlawan yang merupakan anak/subclass dari super class  yaitu KarakterGame
    public Pahlawan (String nama, int kesehatan){//memanggil constructor dari Class KarakterGame
        super(nama,kesehatan);//digunakan untuk mengakses atribut nama dan kesehatan dari superclass
    }

    @Override//digunakan untuk memanggil method serang yang ada di superclass Karaktergame untuk diubah pada class ini tanpa mengubahnya di superclass KarakterGame
    public void serang(KarakterGame target) {//memanggil method serang yang digunakan untuk menyerang musuh menggunakan orbital strike
        System.out.println(getNama()+" menyerang "+target.getNama()+" menggunakan Orbital Strike!");//output untuk menampilkan teks nama pahlawan menyerang namamusuh menggunakan orbital strike
        target.setKesehatan(target.getKesehatan()-20);//digunakan untuk mengurangi kesehatan dari musuh/target sebesar 20
        System.out.println(target.getNama()+ " sekarang memiliki kesehatan "+target.getKesehatan());//output untuk menampilkan sisa kesehatan yang dimiliki oleh musuh yang terkena serangan
    }
}
