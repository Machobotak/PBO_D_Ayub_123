import java.time.LocalDate;//mengimpor API yang digunakan untuk menghitung umur dengan cara tahun ini dikurangi dengan tahun lahir
import java.util.Scanner;//mengimpor kelas Scanner yang akan digunakan untuk membaca input dari pengguna

public class Main {//kelas utama

    public static void main(String[] args) {//method atau fungsi main yang nanti akan dieksekusi pada saat program berjalan
        Scanner scanner = new Scanner(System.in);//membuat objek scanner yang digunakan untuk membaca input dari pengguna

        // Input data diri
        System.out.print("Masukkan nama: ");//menampilkan output untuk meminta pengguna memasukkan nama
        String nama = scanner.nextLine();//membaca input nama sebagai string yang akan disimpan dalam variable nama

        System.out.print("Masukkan jenis kelamin (P/L): ");//menampilkan output untuk pengguna memasukkan jenis kelamin
        char jenisKelaminInput = scanner.next().charAt(0);//membaca input pengguna, membaca input pertama sebagai karakter

        System.out.print("Masukkan tahun lahir: ");//menampilkan output untuk memasukkan tahun lahir
        int tahun = scanner.nextInt();// membaca input pengguna sebagai bilangan bulat

        // Hitung umur
        LocalDate today = LocalDate.now();//untuk mendapatkan tanggal hari ini
        int tahunSekarang = today.getYear();// mengambil tahun dari tanggal yang kita dapatkan
        int umur = tahunSekarang - tahun;//operasi untuk menghitung umur berdasarkan selisih tahun sekarang dan tahun lahir

        // Konversi jenis kelamin
        String jenisKelamin;//variable untuk menyimpan jenis kelamin
        if (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') {//untuk memeriska input pengguna L(huruf besar) atau l(huruf kecil)
            jenisKelamin = "Laki-laki";//jika statement benar maka isi dari variable jenis kelamin menjadi "laki laki"
        } else if (jenisKelaminInput == 'P' || jenisKelaminInput == 'p') {//untuk memeriska input pengguna P(huruf besar) atau p(huruf kecil)
            jenisKelamin = "Perempuan";//jika statement benar maka isi dari variable jenis kelamin menjadi "perempuan"
        } else {
            jenisKelamin = "Tidak valid"; //jika inputan dari pengguna bukan L/l atau P/p, maka isi dari variable jenis kelamin menjadi tidak valid
        }

        // Tampilkan data diri
        System.out.println("\nData Diri:");//untuk menampilan output "Data Diri" pada layar
        System.out.println("Nama\t\t\t: " + nama);//untuk menampilan output Nama dan variable yang telah dimasukkan pengguna ex:(Nama: Ayub)
        System.out.println("Jenis Kelamin\t: " + jenisKelamin);//untuk menampilakan Jenis Kelamin dan variable jenisKelamin yang telah dimasukkan pengguna ex:(Jenis Kelamin: Laki-laki)
        System.out.println("Umur\t\t\t: " + umur + " tahun");//untuk menampilan Umur dan variable umur yang telah dioperasikan sebelumnya serta tahun ex:(Umur : 19 tahun)

        scanner.close(); // untuk menutup Scanner
    }
}