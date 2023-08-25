package arvoreBinaria;

public class No {
	private No esquerda;
	private No direita;
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	public No() {
		this.esquerda = null;
		this.direita = null;
	}
	
}
