public class Hewan {
    String Nama;
    String Jenis;
    String Suara;

    public Hewan(String Nama,String Jenis, String Suara){
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Suara = Suara;
    }
    public void tampilkaninfo(){
        System.out.println("Nama: "+Nama);
        System.out.println("Jenis: "+Jenis);
        System.out.println("Suara: "+Suara);
        System.out.println();
    }
}
