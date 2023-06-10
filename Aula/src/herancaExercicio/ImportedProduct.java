package herancaExercicio;

public class ImportedProduct extends Product {
	private double customsFee;

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		// TODO Auto-generated method stub
		return this.name + " $ " + String.format("%.2f", getPrice()+this.customsFee) +" (Customs fee: $ "+String.format("%.2f", this.customsFee)+")";
	}
	
}
