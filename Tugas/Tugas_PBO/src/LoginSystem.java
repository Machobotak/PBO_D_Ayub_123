import  java.util.Scanner;
class LoginSystem {
    public static void main(String[] args) {
        Scanner objinput = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Masukkan pilihan login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukkan pilihan (1/2): ");

        int pilihan = objinput.nextInt();
        objinput.nextLine();


        switch (pilihan){
            case 1:
                System.out.println("Masukkan username: ");
                String username = objinput.nextLine();
                System.out.println("Masukkan password: ");
                String password = objinput.nextLine();

                if(admin.login(username, password)){
                    admin.displayInfo();
                }else{
                    System.out.println("Login gagal! username atau Password salah");
                }
                break;

            case 2:
                System.out.println("Masukkan nama: ");
                String nama = objinput.nextLine();
                System.out.println("Masukkan NIM: ");
                String nim = objinput.nextLine();

                if(mahasiswa.login(nama,nim)){
                    mahasiswa.displayInfo();
                }else{
                    System.out.println("Login gagal! Nama atau NIM salah!");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }

        objinput.close();
    }
}
