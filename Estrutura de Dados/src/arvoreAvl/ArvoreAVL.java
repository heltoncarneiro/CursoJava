package arvoreAvl;

public class ArvoreAVL {
	private No tree;

	public No getTree() {
		return tree;
	}

	public void setTree(No tree) {
		this.tree = tree;
	}
	public boolean vazia(){
		if(tree.getRaiz() == null) {
			return true;
		}else {
			return false;
		}
	}
	/*
	public int altura(){
		if(vazia() == false) {
			if(tree.getEsquerda() == null && tree.getDireita() == null){
				return 0;
			}else if (tree.getEsquerda() == null && direita !=null){
				return 1 + tree.getEsquerda().altura();
			}else if (tree.getEsquerda() != null && direita ==null){
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
	*/	
}
