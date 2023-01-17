import java.io.Serializable;
import java.util.ArrayList;
public class Users implements Serializable{
	private String username;
	private String password;
    private String choice;
	private String name;
	private int age;
	private String sport;
	private String bio;
	private ArrayList<ArrayList<ArrayList<String>>> messages = new ArrayList<ArrayList<ArrayList<String>>>();
	public Users(String username, String password, String choice){
		this.username=username;
		this.password=password;
	    this.choice=choice;
    }
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void setSport(String s) {
		sport = s;
	}
	public String getSport() {
		return sport;
	}
	public void setBio(String b) {
		bio = b;
	}
	public String getBio() {
		return bio;
	}
    public void setUsername(String usern) {
        username = usern;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String p) {
        password = p;
    }

    public String getPassword() {
        return password;
    }
	public ArrayList<ArrayList<ArrayList<String>>> getMessages(){
		return messages;
	}

}