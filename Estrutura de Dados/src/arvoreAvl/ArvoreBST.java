package arvoreAvl;


public class ArvoreBST {
	private ArvoreBinaria tree;
	
	public ArvoreBinaria getTree() {
		return tree;
	}
	public void setTree(ArvoreBinaria tree) {
		this.tree = tree;
	}
	public ArvoreBST(Integer root) {
		super();
		this.tree =  new ArvoreBinaria(root);
	}
	public ArvoreBST() {
		super();
		this.tree = null;
	}
	public ArvoreBinaria inserir(Integer val) {
		if(tree == null) {
			tree = new ArvoreBinaria(val);
			return tree;
		}else {
			return inserirArvore(getTree(), val);
		}
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
	private ArvoreBinaria inserirArvore(ArvoreBinaria tree, Integer val) {
		if(val<tree.getRaiz() && tree.getEsquerda() == null) {
			tree.setEsquerda(new ArvoreBinaria(val));
			atualizarFatoresDeBalanceamentos(tree);
			return tree;
		}else if(val>=tree.getRaiz() && tree.getDireita() == null) {
			tree.setDireita(new ArvoreBinaria(val));
			atualizarFatoresDeBalanceamentos(tree);
			return tree;
		}else if(val<tree.getRaiz()) {
			 return inserirArvore(tree.getEsquerda(), val);
		}else if(val>=tree.getRaiz()) {
			 return inserirArvore(tree.getDireita(), val);
		}
		return null;
	}
	public void atualizarFatoresDeBalanceamentos(ArvoreBinaria tree){
		tree.atualizarFatorBalanceamento();
		for(ArvoreBinaria i = tree; i != null; i = buscarPai(i.getRaiz())){
			i.atualizarFatorBalanceamento();
		}
	}
	public Integer buscarMin() {
		return buscarMinArvore(getTree()).getRaiz();
	}
	private ArvoreBinaria buscarMinArvore(ArvoreBinaria tree) {
		if(tree.getEsquerda() == null) {
			return tree;
		}else {
			return buscarMinArvore(tree.getEsquerda());
		}
	}
	public Integer buscarMax() {
		return buscarMaxArvore(getTree()).getRaiz();
	}
	private ArvoreBinaria buscarMaxArvore(ArvoreBinaria tree) {
		if(tree.getDireita() == null) {
			return tree;
		}else{
			return buscarMaxArvore(tree.getDireita());
		}
	}
	public ArvoreBinaria buscar(Integer val){
		return buscarArvore(getTree(), val);
	}
	private ArvoreBinaria buscarArvore(ArvoreBinaria tree , Integer val) {
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
	public ArvoreBinaria buscarPai(Integer val) {
		return buscarPaiArvore(getTree(), val);
	}
	private ArvoreBinaria buscarPaiArvore(ArvoreBinaria tree , Integer val) {
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
	private ArvoreBinaria sucessorArvore(ArvoreBinaria tree , Integer num) {
		ArvoreBinaria elemento = buscarArvore(tree, num);
		if(elemento.getDireita() != null) {
			return buscarMinArvore(elemento.getDireita());	
		}else if(elemento.getDireita() == null && elemento.getEsquerda() == null) {
			ArvoreBinaria pai = buscarPaiArvore(tree, num);
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
	public ArvoreBinaria remover(Integer val) {
		 return removerArvore(getTree(), val);
	}
	private ArvoreBinaria removerArvore(ArvoreBinaria tree,Integer val) {
		ArvoreBinaria elemento = buscarArvore(tree, val);
		if(elemento == null) {
			System.out.println("elemento "+val+" não existe");
			return null;
		}
		ArvoreBinaria pai = buscarPaiArvore(tree,val);
		if (elemento.getDireita() != null && elemento.getEsquerda() != null) {
			ArvoreBinaria y = sucessorArvore(tree, val);
			ArvoreBinaria paiy = buscarPaiArvore(tree,y.getRaiz());
			elemento.setRaiz(y.getRaiz());
			if(paiy.getDireita() == y) {
				paiy.setDireita(y.getDireita());
			}else {
				paiy.setEsquerda(y.getDireita());
			}
			atualizarFatoresDeBalanceamentos(paiy);
			return paiy;
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
		atualizarFatoresDeBalanceamentos(pai);
		return pai;
	}
}
