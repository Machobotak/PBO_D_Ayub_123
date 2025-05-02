package app;

import perpustakaan.Anggota;
import perpustakaan.Buku;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Buku bukufiksi = new Fiksi("Leila Salikha Chudori","Laut Bercerita","Fiksi Sejarah");
        Buku bukunonfiksi = new NonFiksi("Albert Einstein","Relativitas: Teori Khusus dan Umum","Fisika");

        bukunonfiksi.displayInfo();
        bukufiksi.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Ayub","D123");
        Anggota anggota2 = new Anggota("Dhito","D134");

        anggota1.displayInfo();
        anggota2.displayInfo();
        System.out.println();

        anggota1.pinjamBuku("Laut Bercerita");
        anggota2.pinjamBuku("Relativitas: Teori Khusus dan Umum",7);
        System.out.println();

        anggota1.kembalikanBuku("Laut Bercerita");
        anggota2.kembalikanBuku("Relativitas: Teori Khusus dan Umum");
    }
}