package enumExercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String name;
	private String email;
	private Date dateOfBirthday;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirthday() {
		return dateOfBirthday;
	}
	public void setDateOfBirthday(Date dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
	public Cliente(String name, String email, Date dateOfBirthday) {
		this.name = name;
		this.email = email;
		this.dateOfBirthday = dateOfBirthday;
	}
	@Override
	public String toString() {
		return "Cliente: " + name +" " + sdf.format(getDateOfBirthday()) +  " " + email;
	}
	
}
