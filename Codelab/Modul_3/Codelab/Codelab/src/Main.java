public class Main {//deklarasi class main pada kelas inilah program akan dieksekusi
    public static void main(String[] args) {//method main pada method inilah program akan diekseuksi sesuai dengan urutan
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum",100);//membuat objek bernama karakterUmum sekaligus kita memasukkan nama dan kesehatan yang mau kita set/masukkan
        Pahlawan brimstone = new Pahlawan("Brimstone",150);//membuat objek bernama brimstone sekaligus kita memasukkan nama dan kesehatan dari karakter yang berada didalam class Pahlawan
        Musuh viper = new Musuh("Viper",200);//membuat objek bernama brimtine sekaligus kita memasukkan nama dan kesehatan dari karakter yang berada didalam class Musuh

        System.out.println("Status awal:");//untuk menampilkan output Status awal:
        System.out.println(brimstone.getNama()+" memiliki kesehatan: "+brimstone.getKesehatan());//untuk menampilkan kesehatan brimstone sebelum mereka bertarung satu sama lain
        System.out.println(viper.getNama()+" memiliki kesehatan: "+viper.getKesehatan());//untuk menampilkan kesehatan viper sebelum mereka bertarung satu sama lain

        brimstone.serang(viper);//memanggil method serang yang mana brimstone akan menyerang viper menggunakan orbital strike
        viper.serang(brimstone);//memaggil methos serang yang mana viper akan menyerang brimstone menggunakan snake bite
    }
}