package arvoreBinaria;

public class ArvoreBinaria {
	private String raiz;
	private ArvoreBinaria esquerda;
	private ArvoreBinaria direita;
	
	public String getRaiz() {
		return raiz;
	}

	public void setRaiz(String raiz) {
		this.raiz = raiz;
	}

	public ArvoreBinaria getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(ArvoreBinaria esquerda) {
		this.esquerda = esquerda;
	}

	public ArvoreBinaria getDireita() {
		return direita;
	}

	public void setDireita(ArvoreBinaria direita) {
		this.direita = direita;
	}
	
	public ArvoreBinaria(String raiz, ArvoreBinaria esquerda, ArvoreBinaria direita) {
		super();
		this.raiz = raiz;
		this.esquerda = esquerda;
		this.direita = direita;
	}
	public ArvoreBinaria(String raiz) {
		super();
		this.raiz = raiz;
		this.esquerda = null;
		this.direita = null;
	}
	public String preOrder() {
		if(esquerda == null && direita == null){
			return getRaiz()+",";
		}else if(esquerda == null && direita !=null) {
			return getRaiz()+","+direita.preOrder();
		}else if(esquerda != null && direita == null) {
			return getRaiz()+","+esquerda.preOrder();
		}else {
			return	getRaiz()+","+esquerda.preOrder()+direita.preOrder();
		}
	}
	public String emOrder() {
		if(esquerda == null && direita == null){
			return getRaiz()+",";
		}else if(esquerda == null && direita !=null) {
			return getRaiz()+","+direita.emOrder();
		}else if(esquerda != null && direita == null) {
			return esquerda.emOrder()+","+getRaiz();
		}else {
			return	esquerda.emOrder()+getRaiz()+","+direita.emOrder();
		}
	}
	public String posOrder() {
		if(esquerda == null && direita == null){
			return getRaiz()+",";
		}else if(esquerda == null && direita !=null) {
			return ","+direita.posOrder()+getRaiz()+",";
		}else if(esquerda != null && direita == null) {
			return ","+esquerda.posOrder()+getRaiz()+",";
		}else {
			return	esquerda.posOrder()+direita.posOrder()+getRaiz();
		}
	}
	
}
