package ExceptionExercicios;

public class AccountException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public AccountException(String stringErro) {
		super(stringErro);
	}
}
