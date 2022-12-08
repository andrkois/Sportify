public class Users {
	private String name;
	private int age;
	private String sport;
	private String bio;
	public Users(String n) {
		name = n;

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