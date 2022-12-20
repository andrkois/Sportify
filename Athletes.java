import java.io.Serializable;



public class Athletes implements Serializable {
    String username;
    String password;
    String name;
    public Athletes(String username){
        this.username=username;
    }
}
