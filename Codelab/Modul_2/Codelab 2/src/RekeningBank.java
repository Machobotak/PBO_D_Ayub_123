public class RekeningBank {//menbuat class Rekening bank untuk menampilkan saldo,setor tunai, dan menarik uang
    String nomorRekening;//mendeklarasi atribut untuk menyimpan nomer rekening
    String namaPemilik;//mendeklarasi atribut untuk menyimpan nama pemilik
    double saldo;//mendeklarasi untuk menyimpan saldo dalam tipe double

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo){//membuat konstruktor yang nanti akan di panggil saat membuat objek
        this.nomorRekening = nomorRekening;//digunakan untuk membedakan antara atribut yang kita buat dengan parameter sehingga ketika memasukkan nilai pada paramater maka akan langsung masuk ke atribut yang kita sudah buat
        this.namaPemilik = namaPemilik;//digunakan untuk membedakan antara atribut yang kita buat dengan parameter sehingga ketika memasukkan nilai pada paramater maka akan langsung masuk ke atribut yang kita sudah buat
        this.saldo = saldo;//digunakan untuk membedakan antara atribut yang kita buat dengan parameter sehingga ketika memasukkan nilai pada paramater maka akan langsung masuk ke atribut yang kita sudah buat
    }
    void tampilkanInfo(){//mendeklarasikan method void yang digunakan untuk menampilkan nomer rek, nama pemiliki, dan jumlah saldonya
        System.out.println("Nomor Rekening: "+nomorRekening);//untuk menampilkan output nomer rekening yang kita sudah simpan di dalam atribut
        System.out.println("Nama Pemiliki: "+namaPemilik);//untuk menampilkan output nama pemilik yang kita sudah simpan di dalam atribut
        System.out.println("Saldo: Rp."+String.format("%.0f",saldo));//untuk menampilkan output saldo pemilik yang kita sudah simpan di dalam atribut dengan format %.0f sehingga angka desimalnya hilang
        System.out.println();//untuk memberikan space antar baris
    }
    public void setorUang (double jumlah){//mendeklarasikan method void yang digunakan untuk menambah jumlah saldo pemilik
        saldo += jumlah;//operasi untuk menambah saldo
        System.out.println(namaPemilik +" menyetor Rp" + String.format("%,.0f",jumlah) + ".Saldo sekarang: Rp" + String.format("%,.0f",saldo));//untuk menampilan output ke user kalau setoran berhasil dan menampilan saldo baru
    }
    public void tarikUang (double jumlah){//deklarasi method void untuk menarik uang lalu menguranginya jika saldo cukup
        if(jumlah>saldo){//pecabangan umtuk mengecek apakah saldo,kalau tidak maka, output gagal
            System.out.println(namaPemilik +" menarik Rp"+String.format("%,.0f",jumlah)+". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp"+String.format("%,.0f",saldo));//output jika saldo tidak cukup
        }else{//baris ini akan dijalankan ketika jumlah untuk menarik uang lebih kecil dari saldo
            saldo -= jumlah;//operasi untuk mengurangi saldo setelah penarikan uang
            System.out.println(namaPemilik+" Menarik Rp" + String.format("%,.0f",jumlah)+". (berhasil) Saldo saat ini: Rp"+String.format("%,.0f",saldo));//output jika saldo cukup untuk menarik uang
        }
    }
}

