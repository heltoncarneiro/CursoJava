package pilha;

import listaCircular.No;

public class Pilha {
	private No topo;

	public No getTopo() {
		return topo;
	}

	public void setTopo(No topo) {
		this.topo = topo;
	}

	public Pilha() {
		this.topo = null;
	}
	public void inserir(int info) {
		topo = new No(info, topo);
	}
	public void deletar() {
		if(topo != null) {
			topo = topo.getProx();
		}
	}
	public void imprimir() {
		if(topo != null) {
			System.out.println("\n");
			for(No no = topo; no!= null; no= no.getProx()) {
				System.out.println(no.getInfo());
			}
			System.out.println("\n");
		}else {
			System.out.println("pilha vazia");
		}
	}
}
