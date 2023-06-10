package abstractExercicio;

public class Company extends taxPlayer {
	private int numberOfEmployees;

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if(numberOfEmployees > 10) {
			return getAnualIncome()*0.14;
		}
		return getAnualIncome()*0.16;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + ": $ " + String.format("%.2f", tax());
	}
}
