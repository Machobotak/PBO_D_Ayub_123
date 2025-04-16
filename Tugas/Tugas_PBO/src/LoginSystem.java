import  java.util.Scanner;
class LoginSystem {
    public static void main(String[] args) {
        Scanner objinput = new Scanner(System.in);

        System.out.println("Masukkan pilihan login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukkan pilihan (1/2): ");

        int pilihan = objinput.nextInt();
        objinput.nextLine();

        User user = null;

        switch (pilihan){
            case 1:
                user = new Admin();
                System.out.println("Masukkan username: ");
                String username = objinput.nextLine();
                System.out.println("Masukkan password: ");
                String password = objinput.nextLine();

                if(user.login(username, password)){
                    user.displayInfo();
                }else{
                    System.out.println("Login gagal! username atau Password salah");
                }
                break;

            case 2:
                user = new Mahasiswa();
                System.out.println("Masukkan nama: ");
                String nama = objinput.nextLine();
                System.out.println("Masukkan NIM: ");
                String nim = objinput.nextLine();

                if(user.login(nama,nim)){
                    user.displayInfo();
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
