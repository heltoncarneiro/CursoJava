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
	public void inserir(Arvore tree, Integer val) {
		if(tree.vazia() == true) {
			tree.setRaiz(val);
		}else {
			if(val<tree.getRaiz() && tree.getEsquerda() == null) {
				tree.setEsquerda(new Arvore(val));
			}else if(val>=tree.getRaiz() && tree.getDireita() == null) {
				tree.setDireita(new Arvore(val));
			}else if(val<tree.getRaiz()) {
				inserir(tree.getEsquerda(), val);
			}else if(val>=tree.getRaiz()) {
				inserir(tree.getDireita(), val);
			}
		}
	}
	public Arvore buscarMin(Arvore tree) {
		if(tree.getEsquerda() == null) {
			return tree;
		}else {
			return buscarMin(tree.getEsquerda());
		}
	}
	public Arvore buscarMax(Arvore tree) {
		if(tree.getDireita() == null) {
			return tree;
		}else{
			return buscarMax(tree.getDireita());
		}
	}
	public Arvore buscar(Arvore tree , Integer val) {
		if(tree.getRaiz() == val) {
			return tree;
		}else if(val > tree.getRaiz() && tree.getDireita() != null) {
			return buscar(tree.getDireita(),val);
		}else if(val < tree.getRaiz() && tree.getEsquerda() != null) {
			return buscar(tree.getEsquerda(),val);
		}else {
			return null;
		}
	}
	public Arvore buscarPai(Arvore tree , Integer val) {
		if(tree.getDireita() != null && tree.getDireita().getRaiz() == val) {
			return tree;
		}else if(tree.getEsquerda() != null && tree.getEsquerda().getRaiz() == val) {
			return tree;
		}else if(val > tree.getRaiz() && tree.getDireita() != null) {
			return buscarPai(tree.getDireita(),val);
		}else if(val < tree.getRaiz() && tree.getEsquerda() != null) {
			return buscarPai(tree.getEsquerda(),val);
		}else {
			return null;
		}
	}
	public Arvore Sucessor(Arvore tree , Integer num) {
		Arvore elemento = buscar(tree, num);
		if(elemento.getDireita() != null) {
			return buscarMin(elemento.getDireita());
		}else if(tree.getDireita() != null) {
			return buscarPai(tree, num);
		}else {
			return null;
		}
	}
	public void remover(Arvore tree,Integer val) {
		Arvore elemento = buscar(tree, val);
		if(elemento == null) {
			return;
		}
		Arvore pai = buscarPai(tree,val);
		if (elemento.getDireita() != null && elemento.getEsquerda() != null) {
			Arvore y = Sucessor(tree, val);
			Arvore paiy = buscarPai(tree,y.getRaiz());
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
