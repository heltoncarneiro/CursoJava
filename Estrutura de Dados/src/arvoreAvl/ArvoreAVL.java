package arvoreAvl;


public class ArvoreAVL extends ArvoreBST{

	public ArvoreAVL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArvoreAVL(Integer root) {
		super(root);
		// TODO Auto-generated constructor stub
	}
	private void rotSimplesDireita(ArvoreBinaria critico){
		ArvoreBinaria pai = buscarPai(critico.getRaiz());
		if(critico.equals(getTree())) {
			setTree(critico.getEsquerda());
			critico.setEsquerda(null);
			getTree().setDireita(critico);

		}else {
			ArvoreBinaria EsquerdaDeElementoCritico = critico.getEsquerda();
			ArvoreBinaria direitaDoFilhoEsquerdaDeElementoCritico = EsquerdaDeElementoCritico.getDireita();
			pai.setEsquerda(EsquerdaDeElementoCritico);
			critico.setEsquerda(direitaDoFilhoEsquerdaDeElementoCritico);
			EsquerdaDeElementoCritico.setDireita(critico);
		}
		atualizarFatoresDeBalanceamentos(critico);
	}
	private void rotSimplesEsquerda(ArvoreBinaria critico){
		ArvoreBinaria pai = buscarPai(critico.getRaiz());
		if(critico.equals(getTree())) {
			setTree(critico.getDireita());
			critico.setDireita(null);
			getTree().setEsquerda(critico);
		}else {
			ArvoreBinaria direitaDeElementoCritico = critico.getDireita();
			ArvoreBinaria esquerdaDoFilhodireitaDeElementoCritico = direitaDeElementoCritico.getEsquerda();
			pai.setDireita(direitaDeElementoCritico);
			critico.setDireita(esquerdaDoFilhodireitaDeElementoCritico);
			direitaDeElementoCritico.setEsquerda(critico);
		}
		atualizarFatoresDeBalanceamentos(critico);
	}
	private void rotDuplaDireita(ArvoreBinaria critico){
		ArvoreBinaria pai = buscarPai(critico.getRaiz());
		rotSimplesEsquerda(critico.getEsquerda());
		ArvoreBinaria esquerdaDeCritico = critico.getEsquerda();
		ArvoreBinaria direitaDeEsquerdaDeCritico = esquerdaDeCritico.getDireita();
		pai.setEsquerda(esquerdaDeCritico);
		critico.setEsquerda(direitaDeEsquerdaDeCritico);
		esquerdaDeCritico.setDireita(critico);
	}
	private void rotDuplaEsquerda(ArvoreBinaria critico){
		ArvoreBinaria pai = buscarPai(critico.getRaiz());
		rotSimplesDireita(critico.getEsquerda());
		ArvoreBinaria direitaDeCritico = critico.getDireita();
		ArvoreBinaria esquerdaDeDireitaDeCritico = direitaDeCritico.getEsquerda();
		pai.setEsquerda(direitaDeCritico);
		critico.setEsquerda(esquerdaDeDireitaDeCritico);
		direitaDeCritico.setDireita(critico);
	}

	public void inserirAVL(Integer val) {
		// TODO Auto-generated method stub
		ArvoreBinaria arvorePaidoInserido =  super.inserir(val);
		while(true) {
			if(arvorePaidoInserido == null) {
				break;
			}
			if(arvorePaidoInserido.getFatorBalanceamento() >= 2 ) {
				if(arvorePaidoInserido.getEsquerda().getFatorBalanceamento() >= 0) {
					rotSimplesDireita(arvorePaidoInserido);
					break;
				}
				else {
					rotDuplaDireita(arvorePaidoInserido);
				}
			}else if(arvorePaidoInserido.getFatorBalanceamento() <= -2 && arvorePaidoInserido.getDireita().getFatorBalanceamento() <= 0) {
				rotSimplesEsquerda(arvorePaidoInserido);
				break;
			}
			arvorePaidoInserido = buscarPai(arvorePaidoInserido.getRaiz());
		}
			
		
	}

	public void removerAVL(Integer val) {
		// TODO Auto-generated method stub
		super.remover(val);
	}
	
	
}
