import  java.util.Scanner;
class loginmahasiswa {
    public static void main(String[] args) {
        Scanner objinput = new Scanner(System.in);
        System.out.println("Masukkan pilihan login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukkan pilihan (1/2): ");

        int pilihan = objinput.nextInt();
        objinput.nextLine();

        if (pilihan == 1) {
            System.out.println("Masukkan username: ");
            String username = objinput.nextLine();

            System.out.println("Masukkan password: ");
            String password = objinput.nextLine();

            String nimakhir = "069";
            String validusername = "Admin" + nimakhir;
            String validpassword = "Password" + nimakhir;

            if (username.equals(validusername) && password.equals(validpassword)) {
                System.out.println("Login Admin Berhasil");
            } else {
                System.out.println("Login gagal! Username atau Password Salah.");
            }
        } else if (pilihan == 2) {
            System.out.println("Masukkan nama: ");
            String nama = objinput.nextLine();

            System.out.println("Masukkan NIM: ");
            String nim = objinput.nextLine();

            String namaberhasil = "Muhammad Ibrahim Al Ayubi";
            String nimberhasil = "202410370110123";

            if (nama.equals(namaberhasil) && nim.equals(nimberhasil)) {
                System.out.println("Login Mahasiswa Berhasil.");
                System.out.println("Nama:"+ nama);
                System.out.println("NIM:"+ nim);
            }else{
                System.out.println("Login gagal! Nama atau NIM salah!");
            }
        }else{
            System.out.println("Pilihan Tidak Valid");
        }
        objinput.close();
    }
}
