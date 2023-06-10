package herancaExercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public UsedProduct(String name, double price,Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String priceTag() {
		// TODO Auto-generated method stub
		return getName() + " (Used) $ " + String.format("%.2f", getPrice())+" (Manufacture date: " + sdf.format(manufactureDate)+ ")";
	}
	
	
}
