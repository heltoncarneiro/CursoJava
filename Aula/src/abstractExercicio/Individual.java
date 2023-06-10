package abstractExercicio;

public class Individual extends taxPlayer{
	private double healthExpenditures;

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if(getAnualIncome() < 20000) {
			return (getAnualIncome()*0.15)-healthExpenditures*0.5;
		}else {
			return (getAnualIncome()*0.25)-healthExpenditures*0.5;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + ": $ " + String.format("%.2f", tax()) ;
	}
	
}
