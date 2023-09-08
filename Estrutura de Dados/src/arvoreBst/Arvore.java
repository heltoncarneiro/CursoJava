package arvoreBst;

public class Arvore {
	private Integer raiz;
	private Arvore esquerda;
	private Arvore direita;
	public Integer getRaiz() {
		return raiz;
	}
	public void setRaiz(Integer raiz) {
		this.raiz = raiz;
	}
	public Arvore getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(Arvore esquerda) {
		this.esquerda = esquerda;
	}
	public Arvore getDireita() {
		return direita;
	}
	public void setDireita(Arvore direita) {
		this.direita = direita;
	}
	public Arvore(Integer raiz) {
		super();
		this.raiz = raiz;
		this.esquerda = null;
		this.direita = null;
	}
	public Arvore() {
		super();
		this.raiz = null;
		this.esquerda = null;
		this.direita = null;
	}
	public boolean vazia(){
		return raiz == null;
	}
	public String preOrder() {
		if(vazia()) {
			return "Arvore vazia";
		}
		if(esquerda == null && direita == null){
			return getRaiz().toString();
		}else if(esquerda == null && direita !=null) {
			return getRaiz().toString()+","+direita.preOrder();
		}else if(esquerda != null && direita == null) {
			return getRaiz().toString()+","+esquerda.preOrder();
		}else {
			return	getRaiz().toString()+","+esquerda.preOrder()+","+direita.preOrder();
		}
	}
	public String emOrder() {
		if(vazia()) {
			return "Arvore vazia";
		}
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
		if(vazia()) {
			return "Arvore vazia";
		}
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
	public boolean pertence(int info) {
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
		return (Math.pow(2, altura()+1)-1) == countNo();
	}
	@SuppressWarnings("unused")
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
				return (true || esquerda.completa(altura-1));
			}else {
				return false;
			}
		}else {
			return (raiz != null) && esquerda.completa(altura-1) && direita.completa(altura-1);
		}
	}
	public boolean degenerada() {
		if((esquerda != null && direita != null)|| vazia() == true) {
			return false;
		}else if(esquerda != null && direita == null) {
			return esquerda.degenerada();
		}else if(esquerda == null && direita != null) {
			return direita.degenerada();
		}else {
			return true;
		}
	}
}
