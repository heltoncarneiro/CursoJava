package listaEncadeada;

public class No {
	private String info;
	private No prox;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	public No(String info, No prox) {
		super();
		this.info = info;
		this.prox = prox;
	}
	public String Imprimir() {
		if(prox != null) {
			return info +", "+ prox.Imprimir();
		}else {
			return info;
		}
		
	}
}
