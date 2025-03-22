public class Main {//deklarasi kelas main
    public static void main(String[] args) {//method main pada method inilah program akan di eksekusi
        RekeningBank rekening1 = new RekeningBank("202410370110123","Muhammad Ibrahim Al Ayubi",500000);//membuat objek sekaligus kita akan memasukkan nilai yang diperlukan
        RekeningBank rekening2 = new RekeningBank("202410370110123","Muhammad Tegar Budi Wicaksono",1000000);//membuat objek sekaligus kita akan memasukkan nilai yang diperlukan

        rekening1.tampilkanInfo();//memanggil method tampilkanInfo yang kita udah buat di class RekeningBank untuk menampilkan no rek, nama, saldo pada rekening1
        rekening2.tampilkanInfo();//memanggil method tampilkanInfo yang kita udah buat di class RekeningBank untuk menampilkan no rek, nama, saldo pada rekening2

        rekening1.setorUang(200000);//memanggil method setorUang untuk menambah saldo pada parameter kita masukkan angka yang ingin diinpukan
        rekening2.setorUang(500000);//memanggil method setorUang untuk menambah saldo pada parameter kita masukkan angka yang ingin diinpukan

        System.out.println();//untuk memberi space pada baris

        rekening1.tarikUang(800000);//memanggil method tarikUang untuk menarik uang dari rekening kita pada parameter kita masukkan jumlah uang yang ingin kita tarik
        rekening2.tarikUang(300000);//memanggil method tarikUang untuk menarik uang dari rekening kita pada parameter kita masukkan jumlah uang yang ingin kita tarik

        System.out.println();//untuk memberi space pada baris

        rekening1.tampilkanInfo();//memanggil method tampilkanInfo untuk menampilkan saldo rek,nama,dan saldo yang sudah terupdate
        rekening2.tampilkanInfo();//memanggil method tampilkanInfo untuk menampilkan saldo rek,nama,dan saldo yang sudah terupdate
    }
}