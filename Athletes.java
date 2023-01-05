import java.io.Serializable;
public class Athletes extends Users implements Serializable{
    private String position;
    private String current_team;
    private double height;
    private double weight;
    private int likes;
    public Athletes(String usern, String p, String c) {
		super(usern,p,c);
	}
    public void setPosition(String p) {
        position = p;
    }
    public String getPosition() {
        return position;
    }
    public void setCurrent_team(String ct) {
        current_team = ct;
    }
    public String getCurrent_team() {
        return current_team;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double w) {
        weight = w;
    }
    public double getWeight() {
        return weight;
    }
	public void edit(int number, String s) {
        if (number == 1) { 
			setName(s);
		} else if (number == 3) {
			setSport(s);
		} else if (number == 4) {
            setBio(s);
        } else if (number == 5){
            setPosition(s);
        } else if (number == 6){
            setCurrent_team(s);
        }
	}
	public void edit(int number, double d) {
		if (number == 7) {
			setHeight(d);
		} else if (number == 8) {
			setWeight(d);
		}
	}
    public void edit(int number, int i) {
		if (number == 2) {
			setAge(i);
		} 
	}
	public int getLikes() {
		return likes;
	}

	public void addLike() {
		likes++;
	}
    
}
