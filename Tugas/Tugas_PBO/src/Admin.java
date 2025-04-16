public class Admin extends User {
    private String username;
    private  String password;

    public Admin(){
        super("Admin","000");
        this.username = "Admin123";
        this.password = "Password123";
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
