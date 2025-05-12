package com.praktikum.users;

import com.praktikum.actions.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {
    Scanner input = new Scanner(System.in);
    private String username;
    private  String password;

    public Admin(){
        super("Admin","000");
        this.username = "Admin123";
        this.password = "Password123";
    }

    @Override
    public void manageItems() {
        System.out.println(">>Fitur Kelola Barang Belum Tersedia<<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">>Fitur Kelola Mahasiswa Belum Tersedia<<");
    }

    @Override
    public void displayAppMenu() {
        int pilihan;
        do{
            System.out.println("\nMenu Admin:");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.println("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    System.out.println("logout Berhasil");
                    break;
                default:
                    System.out.println("Pilihan Tidak valid");
            }
        }while (pilihan !=0);
    }



    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin Berhasil.");
    }
}
