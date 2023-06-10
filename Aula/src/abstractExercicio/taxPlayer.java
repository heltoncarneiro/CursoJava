package abstractExercicio;

public abstract class taxPlayer {
	private String name;
	private double anualIncome;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	public taxPlayer(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}
	public abstract double tax();
	public abstract String toString();
}
