import java.io.Serializable;



public class Users implements Serializable {
    String username;
    String password;
    String name;
    public Users(String username, String password, String name){
        this.username=username;
        this.password=password;
        this.name=name;
    }
}
