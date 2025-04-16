public class Mahasiswa extends User{
    public Mahasiswa() {
        super("Muhammad Ibrahim Al Ayubi","202410370110123");
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
