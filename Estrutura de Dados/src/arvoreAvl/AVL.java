package arvoreAvl;


public class AVL extends ArvoreBST{

	public AVL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AVL(Integer root) {
		super(root);
		// TODO Auto-generated constructor stub
	}
	private void rotSimplesDireita(ArvoreBinaria critico){
		ArvoreBinaria pai = buscarPai(critico.getRaiz());
		if(critico.equals(getTree())) {
			ArvoreBinaria direitaDoFilhoDecritico = critico.getEsquerda().getDireita();
			setTree(critico.getEsquerda());
			critico.setEsquerda(direitaDoFilhoDecritico);
			getTree().setDireita(critico);

		}else {
			ArvoreBinaria EsquerdaDeElementoCritico = critico.getEsquerda();
			ArvoreBinaria direitaDoFilhoEsquerdaDeElementoCritico = EsquerdaDeElementoCritico.getDireita();
			if(pai.getRaiz().intValue() <= critico.getRaiz().intValue()) {
				pai.setDireita(EsquerdaDeElementoCritico);
			}else {
				pai.setEsquerda(EsquerdaDeElementoCritico);
			}
			critico.setEsquerda(direitaDoFilhoEsquerdaDeElementoCritico);
			EsquerdaDeElementoCritico.setDireita(critico);
			critico.atualizarFatorBalanceamento();
			EsquerdaDeElementoCritico.atualizarFatorBalanceamento();
		}
		atualizarFatoresDeBalanceamentos(critico);
	}
	private void rotSimplesEsquerda(ArvoreBinaria critico){
		ArvoreBinaria pai = buscarPai(critico.getRaiz());
		if(critico == getTree()) {
			setTree(critico.getDireita());
			critico.setDireita(critico.getDireita().getEsquerda());
			getTree().setEsquerda(critico);
		}else {
			ArvoreBinaria direitaDeElementoCritico = critico.getDireita();
			ArvoreBinaria esquerdaDoFilhodireitaDeElementoCritico = direitaDeElementoCritico.getEsquerda();
			if(pai.getRaiz().intValue() <= critico.getRaiz().intValue()) {
				pai.setDireita(direitaDeElementoCritico);
			}else {
				pai.setEsquerda(direitaDeElementoCritico);
			}
			critico.setDireita(esquerdaDoFilhodireitaDeElementoCritico);
			direitaDeElementoCritico.setEsquerda(critico);
			critico.atualizarFatorBalanceamento();
			direitaDeElementoCritico.atualizarFatorBalanceamento();
		}
		atualizarFatoresDeBalanceamentos(critico);
	}
	private void rotDuplaDireita(ArvoreBinaria critico){
		ArvoreBinaria pai = buscarPai(critico.getRaiz());
		rotSimplesEsquerda(critico.getEsquerda());
		ArvoreBinaria esquerdaDeCritico = critico.getEsquerda();
		ArvoreBinaria direitaDeEsquerdaDeCritico = esquerdaDeCritico.getDireita();
		if(critico == getTree()) {
			setTree(esquerdaDeCritico);
			critico.setEsquerda(direitaDeEsquerdaDeCritico);
			getTree().setDireita(critico);
		}else {
			if(pai.getRaiz().intValue() <= critico.getRaiz().intValue()) {
				pai.setDireita(esquerdaDeCritico);
			}else {
				pai.setEsquerda(esquerdaDeCritico);
			}
			critico.setEsquerda(direitaDeEsquerdaDeCritico);
			esquerdaDeCritico.setDireita(critico);
			atualizarFatoresDeBalanceamentos(critico);
		}
	}
	private void rotDuplaEsquerda(ArvoreBinaria critico){
		ArvoreBinaria pai = buscarPai(critico.getRaiz());
		rotSimplesDireita(critico.getDireita());
		ArvoreBinaria direitaDeCritico = critico.getDireita();
		ArvoreBinaria esquerdaDeDireitaDeCritico = direitaDeCritico.getEsquerda();
		if(critico == getTree()) {
			setTree(direitaDeCritico);
			critico.setDireita(esquerdaDeDireitaDeCritico);
			getTree().setEsquerda(critico);
			getTree().atualizarFatorBalanceamento();
			critico.atualizarFatorBalanceamento();
		}else {
			if(pai.getRaiz().intValue() <= critico.getRaiz().intValue()) {
				pai.setDireita(direitaDeCritico);
			}else {
				pai.setEsquerda(direitaDeCritico);
			}
			critico.setEsquerda(esquerdaDeDireitaDeCritico);
			direitaDeCritico.setDireita(critico);
			atualizarFatoresDeBalanceamentos(critico);
		}
	}

	public void insere(Integer val) {
		// TODO Auto-generated method stub
		ArvoreBinaria arvorePaidoInserido =  super.inserir(val);
		while(true) {
			if(arvorePaidoInserido == null) {
				break;
			}
			if(arvorePaidoInserido.getFatorBalanceamento() >= 2 ) {
				if(arvorePaidoInserido.getEsquerda().getFatorBalanceamento() >= 0) {
					rotSimplesDireita(arvorePaidoInserido);
				}
				else {
					rotDuplaDireita(arvorePaidoInserido);
					
				}
				break;
			}else if(arvorePaidoInserido.getFatorBalanceamento() <= -2) {
				if(arvorePaidoInserido.getDireita().getFatorBalanceamento() <= 0) {
					rotSimplesEsquerda(arvorePaidoInserido);
				}
				else {
					rotDuplaEsquerda(arvorePaidoInserido);
				}
				break;
			}
			if(arvorePaidoInserido.getRaiz() == val) {
				break;
			}
				
			arvorePaidoInserido = buscarPai(arvorePaidoInserido.getRaiz());
		}
			
		
	}

	public void remove(Integer val) {
		// TODO Auto-generated method stub
		ArvoreBinaria arvorePaidoRemovido = super.remover(val);
		while(true) {
			if(arvorePaidoRemovido == null) {
				break;
			}
			if(arvorePaidoRemovido.getFatorBalanceamento() >= 2 ) {
				if(arvorePaidoRemovido.getEsquerda().getFatorBalanceamento() >= 0) {
					rotSimplesDireita(arvorePaidoRemovido);
					break;
				}
				else {
					rotDuplaDireita(arvorePaidoRemovido);
					break;
				}
			}else if(arvorePaidoRemovido.getFatorBalanceamento() <= -2) {
				if(arvorePaidoRemovido.getDireita().getFatorBalanceamento() <= 0) {
					rotSimplesEsquerda(arvorePaidoRemovido);
				}
				else {
					rotDuplaEsquerda(arvorePaidoRemovido);
				}
				break;
			}
			if(arvorePaidoRemovido.getRaiz() == val) {
				break;
			}
			arvorePaidoRemovido = buscarPai(arvorePaidoRemovido.getRaiz());
		}
			
	}
	
	public String preOrdem() {
		return getTree().preOrder();
	}
	
	
}
