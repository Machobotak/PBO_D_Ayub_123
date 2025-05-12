package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    Scanner input = new Scanner(System.in);
    public Mahasiswa() {
        super("Muhammad Ibrahim Al Ayubi","202410370110123");
    }

    @Override
    public void reportItem() {
        System.out.println("Laporan Barang");
        System.out.println("Nama Barang: ");
        String namaBarang = input.nextLine();
        System.out.println("Deskripsi Barang: ");
        String deskripsiBarang = input.nextLine();
        System.out.println("Lokasi Terakhir/Ditemukan: ");
        String lokasi = input.nextLine();
        System.out.println("Laporan Telah Diterima, Terimakasih!");
    }

    @Override
    public void displayAppMenu() {
        int pilihan;
        do{
            System.out.println("\nMenu Mahasiswa: ");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.println("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout Berhasil");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }while (pilihan != 0);
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">>Fitur Lihat Laporan Belum Tersedia<<");
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equalsIgnoreCase(inputNama)&&getNim().equalsIgnoreCase(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa Berhasil");
        System.out.println("Nama: "+getNama());
        System.out.println("NIM: "+getNim());
    }
}
