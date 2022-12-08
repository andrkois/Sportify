public class Athlete extends Users{
    private String position;
    private String current_team;
    private double height;
    private double weight;
    public Athlete(String n) {
		super(n);
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
			setPosition(s);
		} else if (number == 2) {
			setCurrent_team(s);
		}
	}
	public void edit(int number, double d) {
		if (number == 3) {
			setHeight(d);
		} else if (number == 4) {
			setWeight(d);
		}
	}
	}
}

