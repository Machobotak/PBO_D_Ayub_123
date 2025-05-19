import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean loop = true;


        Barang barangBaru1 = new Barang("Tas",12);
        daftarBarang.add(barangBaru1);
        for(Barang a : daftarBarang){
            System.out.println(a.getNama()+a.getStok());
        }


        while (loop){
            System.out.println("===== Menu Manajemen Stok ====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");

            int pilihan;
            try{
                pilihan = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                continue;
            }

            switch (pilihan){
                case 1:
                    try {
                        System.out.print("Masukkan nama barang: ");
                        String namaBarang = input.nextLine();
                        System.out.print("Masukkan Stok Awal:");
                        int stokAwal = input.nextInt();
                        input.nextLine();

                        Barang barangBaru = new Barang(namaBarang,stokAwal);
                        daftarBarang.add(barangBaru);
                        System.out.println("Barang '"+namaBarang+"' berhasil ditambahkan.");
                    }catch(InputMismatchException e){
                        System.out.println("Input stok harus berupa angka");
                        input.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("--- Daftar Barang ---");
                    if(daftarBarang.isEmpty()){
                        System.out.println("Stok Barang Kosong");
                    }else{
                        int idx = 0;
                        for (Barang b : daftarBarang){
                            System.out.println(idx + ". Nama: "+b.getNama()+", Stok: "+b.getStok());
                            idx++;
                        }
                    }
                    System.out.println("-------------------");
                    break;
                case 3:
                    try{
                        if (daftarBarang.isEmpty()){
                            System.out.println("Tidak ada barang untuk dikurangi stoknya");
                            break;
                        }
                        System.out.println("--- Daftar Barang (Pilih untuk Kurangi Stok) ---");
                        for(int i = 0;i<daftarBarang.size();i++){
                            Barang b = daftarBarang.get(i);
                            System.out.println(i+". "+b.getNama()+" (Stok: "+ b.getStok()+")");
                        }

                        System.out.print("Masukkan nomor indeks barang: ");
                        int indeks = input.nextInt();
                        Barang barang = daftarBarang.get(indeks);
                        System.out.print("Masukkan jumlah stok yang akan diambil: ");
                        int ambil = input.nextInt();

                        if(ambil> barang.getStok()){
                            throw new StokTidakCukupException("Stok untuk '"+barang.getNama()+"' hanya tersisa "+barang.getStok());
                        }

                        if(ambil<0){
                            System.out.println("Inputan tidak boleh minus");
                            continue;
                        }
                        barang.setStok(barang.getStok()-ambil);
                        System.out.println("Stok barang '"+barang.getNama()+"' berhasil dikurangi. sisa stok: "+barang.getStok());
                    }catch (InputMismatchException e){
                        System.out.println("Input indeks harus berupa angka!");
                        input.nextLine();
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Indeks tidak valid untuk mendaftar barang.");
                    }catch (StokTidakCukupException e){
                        System.out.println("Gagal mengurangi stok: "+e.getMessage());
                    }
                    break;
                case 0:
                    loop = false;
                    System.out.println("Terimakasih! Program berakhir");
                    break;
                default:
                    System.out.println("Opsi tidak valid");
            }

        }
        input.close();


    }
}