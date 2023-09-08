package arvoreAvl;

public class No {
	private Integer raiz;
	private No esquerda;
	private No direita;
	
	public Integer getRaiz() {
		return raiz;
	}
	public void setRaiz(Integer raiz) {
		this.raiz = raiz;
	}
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
	public No(Integer raiz) {
		super();
		this.raiz = raiz;
		this.direita = null;
		this.esquerda = null;
	}
	public No() {
		super();
		this.raiz = null;
		this.direita = null;
		this.esquerda = null;
	}
	public String preOrder() {
		if(esquerda == null && direita == null){
			return getRaiz().toString();
		}else if(esquerda == null && direita !=null) {
			return getRaiz()+","+direita.preOrder();
		}else if(esquerda != null && direita == null) {
			return getRaiz()+","+esquerda.preOrder();
		}else {
			return	getRaiz()+","+esquerda.preOrder()+","+direita.preOrder();
		}
	}
	public String emOrder() {
		if(esquerda == null && direita == null){
			return getRaiz().toString();
		}else if(esquerda == null && direita !=null) {
			return getRaiz()+","+direita.emOrder();
		}else if(esquerda != null && direita == null) {
			return esquerda.emOrder()+","+getRaiz();
		}else {
			return	esquerda.emOrder()+","+getRaiz()+","+direita.emOrder();
		}
	}
	public String posOrder() {
		if(esquerda == null && direita == null){
			return ","+ getRaiz().toString()+",";
		}else if(esquerda == null && direita !=null) {
			return direita.posOrder()+getRaiz()+",";
		}else if(esquerda != null && direita == null) {
			return esquerda.posOrder()+getRaiz()+",";
		}else {
			return	esquerda.posOrder()+direita.posOrder()+getRaiz();
		}
	}
}
