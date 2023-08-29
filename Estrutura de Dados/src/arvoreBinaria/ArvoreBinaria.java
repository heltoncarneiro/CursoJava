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
	public ArvoreBinaria() {
		super();
		this.raiz = null;
		this.esquerda = null;
		this.direita = null;
	}
	public boolean vazia() {
		if(this.raiz == null)
			return true;
		else
			return false;
	}
	public String preOrder() {
		if(esquerda == null && direita == null){
			return getRaiz();
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
			return getRaiz();
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
			return getRaiz()+",";
		}else if(esquerda == null && direita !=null) {
			return ","+direita.posOrder()+getRaiz()+",";
		}else if(esquerda != null && direita == null) {
			return ","+esquerda.posOrder()+getRaiz()+",";
		}else {
			return	esquerda.posOrder()+direita.posOrder()+getRaiz();
		}
	}
	public boolean pertence(String info) {
		if(esquerda == null && direita == null){
			return raiz.equals(info);
		}else if (esquerda == null && direita !=null){
			return (raiz.equals(info))||direita.pertence(info);
		}else if (esquerda != null && direita ==null){
			return (raiz.equals(info))||esquerda.pertence(info);
		}else {
			return ((raiz.equals(info)) || esquerda.pertence(info) || direita.pertence(info)) ;
		}
	}
	public int altura(){
		if(vazia() == false) {
			if(esquerda == null && direita == null){
				return 0;
			}else if (esquerda == null && direita !=null){
				return 1 + direita.altura();
			}else if (esquerda != null && direita ==null){
				return 1 + esquerda.altura();
			}else {
				if(esquerda.altura()>direita.altura()) {
					return 1+esquerda.altura();
				}else {
					return 1+direita.altura();
				}
			}
		}else
			return -1;
	}
	public int countNo(){
		if(esquerda == null && direita == null) {
			return 1;
		}else if (esquerda == null && direita != null) {
			return direita.countNo();
		}else if (esquerda != null && direita == null) {
			return esquerda.countNo();
		}else if(raiz != null){
			return 1+esquerda.countNo()+direita.countNo();
		}else {
			return 0;
		}
	}
	public boolean cheia(){
		if((Math.pow(2, altura()+1)-1) == countNo()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean completa(int altura){
		if(esquerda == null && direita == null) {
			return (raiz != null);
		}else if (esquerda == null && direita != null) {
			if (altura <= 1) {
				return true || direita.completa(altura-1);
			}else {
				return false;
			}
		}else if (esquerda != null && direita == null) {
			if (altura <= 1) {
				return true || esquerda.completa(altura-1);
			}else {
				return false;
			}
		}else {
			return (raiz != null) && esquerda.completa(altura-1) && direita.completa(altura-1);
		}
	}
	public boolean degenerada(int altura) {
		if(completa(altura) == false) {
			return true;
		}else {
			return false;
		}
	}
}
