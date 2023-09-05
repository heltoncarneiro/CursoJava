package arvoreBst;

public class ArvoreBST {
	private Integer raiz;
	private ArvoreBST esquerda;
	private ArvoreBST direita;
	public Integer getRaiz() {
		return raiz;
	}
	public void setRaiz(Integer raiz) {
		this.raiz = raiz;
	}
	public ArvoreBST getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(ArvoreBST esquerda) {
		this.esquerda = esquerda;
	}
	public ArvoreBST getDireita() {
		return direita;
	}
	public void setDireita(ArvoreBST direita) {
		this.direita = direita;
	}
	public ArvoreBST(Integer raiz) {
		super();
		this.raiz = raiz;
		this.esquerda = null;
		this.direita = null;
	}
	public ArvoreBST() {
		this.raiz = (Integer) null;
		this.esquerda = null;
		this.direita = null;
	}
	public boolean vazia(){
		if(raiz == null) {
			return true;
		}else {
			return false;
		}
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
			return getRaiz().toString()+",";
		}else if(esquerda == null && direita !=null) {
			return ","+direita.posOrder()+getRaiz()+",";
		}else if(esquerda != null && direita == null) {
			return ","+esquerda.posOrder()+getRaiz()+",";
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
		if((Math.pow(2, altura()+1)-1) == countNo()) {
			return true;
		}else {
			return false;
		}
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
	public boolean degenerada(int altura) {
		if(completa(altura) == false) {
			return true;
		}else {
			return false;
		}
	}
	public void inserir(Integer val) {
		if(vazia() == true) {
			raiz = val;
		}else {
			if(val<raiz && esquerda == null) {
				esquerda = new ArvoreBST(val);
			}else if(val>=raiz && direita == null) {
				direita = new ArvoreBST(val);
			}else if(val<raiz) {
				esquerda.inserir(val);
			}else if(val>=raiz) {
				direita.inserir(val);
			}
		}
	}
	public int buscarMin() {
		if(esquerda == null) {
			return raiz;
		}else {
			return esquerda.buscarMin();
		}
	}
	public int buscarMax() {
		if(direita == null) {
			return raiz;
		}else{
			return direita.buscarMax();
		}
	}
	public boolean buscar(Integer val) {
		if(raiz == val) {
			return true;
		}else if(val > raiz && direita != null) {
			return direita.buscar(val);
		}else if(val < raiz && esquerda != null) {
			return esquerda.buscar(val);
		}else {
			return false;
		}
	}
	public Integer Sucessor(Integer num) {
		if(esquerda != null &&(esquerda.raiz > num || (esquerda.raiz>= num && esquerda.direita != null))) {
			return esquerda.Sucessor(num);
		}else if(direita != null &&(direita.raiz < num || (direita.raiz<= num && direita.direita != null))) {
			return direita.Sucessor(num);
		}else if(raiz > num) {
			return raiz;
		}else if(direita.raiz > num) {
			return direita.Sucessor(num);
		}else {
			return null;
		}
	}
}
