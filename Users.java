import java.io.Serializable;
public class Users implements Serializable{
	private String username;
	private String password;
    private int choice;
	private String name;
	private int age;
	private String sport;
	private String bio;
	public Users(String username, String password, int choice){
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

}