package arvoreBst;

public class ArvoreBST {
	private Arvore tree;
	
	public Arvore getTree() {
		return tree;
	}
	public void setTree(Arvore tree) {
		this.tree = tree;
	}
	public ArvoreBST(Integer root) {
		super();
		this.tree =  new Arvore(root);
	}
	public ArvoreBST() {
		super();
		this.tree = null;
	}
	public void inserir(Integer val) {
		inserirArvore(getTree(), val);
	}
	public String preOrder() {
		return tree.preOrder();
	}
	public String posOrder() {
		return tree.posOrder();
	}
	public String emOrder() {
		return tree.emOrder();
	}
	private void inserirArvore(Arvore tree, Integer val) {
		if(tree.vazia() == true) {
			tree.setRaiz(val);
		}else {
			if(val<tree.getRaiz() && tree.getEsquerda() == null) {
				tree.setEsquerda(new Arvore(val));
			}else if(val>=tree.getRaiz() && tree.getDireita() == null) {
				tree.setDireita(new Arvore(val));
			}else if(val<tree.getRaiz()) {
				inserirArvore(tree.getEsquerda(), val);
			}else if(val>=tree.getRaiz()) {
				inserirArvore(tree.getDireita(), val);
			}
		}
	}
	public Integer buscarMin() {
		return buscarMinArvore(getTree()).getRaiz();
	}
	private Arvore buscarMinArvore(Arvore tree) {
		if(tree.getEsquerda() == null) {
			return tree;
		}else {
			return buscarMinArvore(tree.getEsquerda());
		}
	}
	public Integer buscarMax() {
		return buscarMaxArvore(getTree()).getRaiz();
	}
	private Arvore buscarMaxArvore(Arvore tree) {
		if(tree.getDireita() == null) {
			return tree;
		}else{
			return buscarMaxArvore(tree.getDireita());
		}
	}
	public Arvore buscar(Integer val){
		return buscarArvore(getTree(), val);
	}
	private Arvore buscarArvore(Arvore tree , Integer val) {
		if(tree.getRaiz() == val) {
			return tree;
		}else if(val > tree.getRaiz() && tree.getDireita() != null) {
			return buscarArvore(tree.getDireita(),val);
		}else if(val < tree.getRaiz() && tree.getEsquerda() != null) {
			return buscarArvore(tree.getEsquerda(),val);
		}else {
			return null;
		}
	}
	public Arvore buscarPai(Integer val) {
		return buscarPaiArvore(getTree(), val);
	}
	private Arvore buscarPaiArvore(Arvore tree , Integer val) {
		if(tree.getDireita() != null && tree.getDireita().getRaiz() == val) {
			return tree;
		}else if(tree.getEsquerda() != null && tree.getEsquerda().getRaiz() == val) {
			return tree;
		}else if(val > tree.getRaiz() && tree.getDireita() != null) {
			return buscarPaiArvore(tree.getDireita(),val);
		}else if(val < tree.getRaiz() && tree.getEsquerda() != null) {
			return buscarPaiArvore(tree.getEsquerda(),val);
		}else {
			return null;
		}
	}
	public Integer sucessor(Integer num){
		try {
			return sucessorArvore(tree, num).getRaiz();
		} catch (NullPointerException e) {
			return null;
		}
	}
	private Arvore sucessorArvore(Arvore tree , Integer num) {
		Arvore elemento = buscarArvore(tree, num);
		if(elemento.getDireita() != null) {
			return buscarMinArvore(elemento.getDireita());	
		}else if(elemento.getDireita() == null && elemento.getEsquerda() == null) {
			Arvore pai = buscarPaiArvore(tree, num);
			if(buscarMax() <= num) {
				return null;
			}else if(pai.getRaiz() > num) {
				return pai;
			}else{
				return buscarPaiArvore(tree, pai.getRaiz());
			}
		}else if(elemento.getDireita() != null || elemento.getEsquerda() != null) {
			return buscarPaiArvore(tree, num);
		}
		return null;
	}
	public void remover(Integer val) {
		removerArvore(getTree(), val);
	}
	private void removerArvore(Arvore tree,Integer val) {
		Arvore elemento = buscarArvore(tree, val);
		if(elemento == null) {
			return;
		}
		Arvore pai = buscarPaiArvore(tree,val);
		if (elemento.getDireita() != null && elemento.getEsquerda() != null) {
			Arvore y = sucessorArvore(tree, val);
			Arvore paiy = buscarPaiArvore(tree,y.getRaiz());
			elemento.setRaiz(y.getRaiz());
			if(paiy.getDireita() == y) {
				paiy.setDireita(y.getDireita());
			}else {
				paiy.setEsquerda(y.getDireita());
			}
		}else if (pai == null){
			if(tree.getDireita() != null) {
				tree.setRaiz(tree.getDireita().getRaiz());
				tree.setDireita(null);
			}else if(tree.getEsquerda() != null) {
				tree.setRaiz(tree.getEsquerda().getRaiz());
				tree.setEsquerda(null);
			}else {
				tree.setRaiz(null);
			}
		}else if(elemento.getDireita() == null && elemento.getEsquerda() == null) {
			
			if(pai.getDireita() ==  elemento) {
				pai.setDireita(null);
			}else {
				pai.setEsquerda(null);
			}
		}else if(elemento.getDireita() != null && elemento.getEsquerda() == null) {
			if(pai.getDireita() ==  elemento) {
				pai.setDireita(elemento.getDireita());
			}else {
				pai.setEsquerda(elemento.getDireita());
			}
		}else if(elemento.getDireita() == null && elemento.getEsquerda() != null) {
			if(pai.getDireita() ==  elemento) {
				pai.setDireita(elemento.getEsquerda());
			}else {
				pai.setEsquerda(elemento.getEsquerda());
			}
		}
	}
	
	
}
