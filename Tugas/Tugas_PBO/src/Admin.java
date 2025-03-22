public class Admin {
    private String username;
    private  String password;

    public Admin(){
        this.username = "Admin123";
        this.password = "Password123";
    }

    public boolean login (String inputUsername,String inputPassword){
        return  inputUsername.equals(username)&&inputPassword.equals(password);
    }
}
