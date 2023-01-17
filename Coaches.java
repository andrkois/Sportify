import java.io.Serializable;
public class Coaches extends Users implements Serializable {
	private int years_of_experience;
	private String team;
	public Coaches(String usern, String p, String c){
		super(usern, p, c);

	}
	public void setYears(int y) {
		years_of_experience = y;
	}
	public int getYears() {
		return years_of_experience;
	}
	public void setTeam(String t) {
		team = t;
	}
	public String getTeam() {
		return team;
	}
	// 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team
	public void edit( int number, int integ ) {
		if (number == 2) {
			setAge(integ);
		} else if (number == 5){
			setYears(integ);
		}

	}
	public void edit( int number, String t ) {
		if (number == 1){
			setName(t);
		} else if (number == 3){
		setSport(t);
		}
		else if (number == 4){
		setBio(t);
		}
		else if (number == 6){
		setTeam(t);
		}
	}
}