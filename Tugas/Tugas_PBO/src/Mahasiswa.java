public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(){
        this.nama = "Muhammad Ibrahim Al Ayubi";
        this.nim = "202410370110123";
    }

    public boolean login(String inputNama,String inputNim){
        return inputNama.equalsIgnoreCase(nama) && inputNim.equalsIgnoreCase(nim);
    }

    public void displayInfo(){
        System.out.println("Login Mahasiswa Berhasil.");
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
    }
}
