package arvoreAvl;


public class ArvoreBinaria {
	private Integer raiz;
	private ArvoreBinaria esquerda;
	private ArvoreBinaria direita;
	private int fatorBalanceamento;
	public int getFatorBalanceamento() {
		return fatorBalanceamento;
	}
	public Integer getRaiz() {
		return raiz;
	}
	public void setRaiz(Integer raiz) {
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
	public ArvoreBinaria(Integer raiz) {
		super();
		this.raiz = raiz;
		this.esquerda = null;
		this.direita = null;
		this.fatorBalanceamento = 0;
	}
	
	public ArvoreBinaria() {
		super();
		this.raiz = null;
		this.esquerda = null;
		this.direita = null;
		this.fatorBalanceamento = 0;
	}
	public boolean vazia(){
		return raiz == null;
	}
	public void atualizarFatorBalanceamento(){
		if(direita != null && esquerda != null) {
			fatorBalanceamento = esquerda.altura() - direita.altura();
		}else if(direita == null && esquerda != null) {
			fatorBalanceamento = esquerda.altura();
		}else if(direita != null && esquerda == null) {
			fatorBalanceamento = -direita.altura();
		}else {
			fatorBalanceamento = 0;
		}
	}
	public String preOrder() {
		if(vazia()) {
			return "Arvore vazia";
		}
		if(esquerda == null && direita == null){
			return getRaiz().toString()+"("+fatorBalanceamento+")";
		}else if(esquerda == null && direita !=null) {
			return getRaiz().toString()+"("+fatorBalanceamento+")"+" "+direita.preOrder();
		}else if(esquerda != null && direita == null) {
			return getRaiz().toString()+"("+fatorBalanceamento+")"+" "+esquerda.preOrder();
		}else {
			return	getRaiz().toString()+"("+fatorBalanceamento+")"+" "+esquerda.preOrder()+" "+direita.preOrder();
		}
	}
	public String emOrder() {
		if(vazia()) {
			return "Arvore vazia";
		}
		if(esquerda == null && direita == null){
			return getRaiz().toString();
		}else if(esquerda == null && direita !=null) {
			return getRaiz()+" "+direita.emOrder();
		}else if(esquerda != null && direita == null) {
			return esquerda.emOrder()+" "+getRaiz();
		}else {
			return	esquerda.emOrder()+" "+getRaiz()+" "+direita.emOrder();
		}
	}
	public String posOrder() {
		if(vazia()) {
			return "Arvore vazia";
		}
		if(esquerda == null && direita == null){
			return " "+ getRaiz().toString()+" ";
		}else if(esquerda == null && direita !=null) {
			return direita.posOrder()+getRaiz()+" ";
		}else if(esquerda != null && direita == null) {
			return esquerda.posOrder()+getRaiz()+" ";
		}else {
			return	esquerda.posOrder()+direita.posOrder()+getRaiz();
		}
	}
	public int altura(){
		if(vazia() == false) {
			if(esquerda == null && direita == null){
				return 1;
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
}
