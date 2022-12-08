public class Coach extends Users {
	private int years_of_experience;
	private String team;
	public Coach(String n){
		super(n);

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
	public void edit( int number, int years ) {
		setYears(years);
	}
	public void edit( int number, String t ) {
		setTeam(t);
	}
}
