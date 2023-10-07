package arvoreAvl;

import arvoreBst.Arvore;
import arvoreBst.ArvoreBST;

public class ArvoreAVL extends ArvoreBST{

	public ArvoreAVL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArvoreAVL(Integer root) {
		super(root);
		// TODO Auto-generated constructor stub
	}
	private void rotSimplesDireita(int num){
		Arvore critico = buscar(num);
		Arvore pai = buscarPai(num);
		Arvore EsquerdaDeElementoCritico = critico.getEsquerda();
		Arvore direitaDoFilhoEsquerdaDeElementoCritico = EsquerdaDeElementoCritico.getDireita();
		pai.setEsquerda(EsquerdaDeElementoCritico);
		critico.setEsquerda(direitaDoFilhoEsquerdaDeElementoCritico);
		EsquerdaDeElementoCritico.setDireita(critico);
	}
	private void rotSimplesEsquerda(int num){
		Arvore critico = buscar(num);
		Arvore pai = buscarPai(num);
		Arvore direitaDeElementoCritico = critico.getDireita();
		Arvore esquerdaDoFilhodireitaDeElementoCritico = direitaDeElementoCritico.getEsquerda();
		pai.setDireita(direitaDeElementoCritico);
		critico.setDireita(esquerdaDoFilhodireitaDeElementoCritico);
		direitaDeElementoCritico.setEsquerda(critico);
	}
	private void rotDuplaDireita(int num){
		Arvore critico = buscar(num);
		Arvore pai = buscarPai(num);
		rotSimplesEsquerda(critico.getEsquerda().getRaiz());
		Arvore esquerdaDeCritico = critico.getEsquerda();
		Arvore direitaDeEsquerdaDeCritico = esquerdaDeCritico.getDireita();
		pai.setEsquerda(esquerdaDeCritico);
		critico.setEsquerda(direitaDeEsquerdaDeCritico);
		esquerdaDeCritico.setDireita(critico);
	}
	private void rotDuplaEsquerda(int num){
		Arvore critico = buscar(num);
		Arvore pai = buscarPai(num);
		rotSimplesDireita(critico.getEsquerda().getRaiz());
		Arvore direitaDeCritico = critico.getDireita();
		Arvore esquerdaDeDireitaDeCritico = direitaDeCritico.getEsquerda();
		pai.setEsquerda(direitaDeCritico);
		critico.setEsquerda(esquerdaDeDireitaDeCritico);
		direitaDeCritico.setDireita(critico);
	}
}
