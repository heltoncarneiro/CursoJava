package arvoreBst;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreBST arvore = new ArvoreBST(4);
		arvore.inserir(2);
		arvore.inserir(3);
		arvore.inserir(1);
		arvore.inserir(5);
		arvore.inserir(6);
		arvore.inserir(-1);
		System.out.println(arvore.preOrder());
		System.out.println(arvore.buscarMin());
		System.out.println(arvore.buscarMax());
		System.out.println(arvore.buscar(-2));
		System.out.println(arvore.buscar(-1));
		System.out.println(arvore.buscar(1));
		System.out.println(arvore.buscar(2));
		System.out.println(arvore.buscar(3));
		System.out.println(arvore.buscar(4));
		System.out.println(arvore.buscar(5));
		System.out.println(arvore.buscar(6));
		System.out.println(arvore.buscar(7));
		System.out.println(arvore.Sucessor());
		ArvoreBST arvore2 = new ArvoreBST(3);
		arvore2.inserir(2);
		arvore2.inserir(1);
		arvore2.inserir(0);
		System.out.println("\n\n");
		System.out.println(arvore2.preOrder());
		System.out.println(arvore2.emOrder());
		System.out.println(arvore2.buscarMin());
		System.out.println(arvore2.buscarMax());
		System.out.println(arvore2.buscar(-1));
		System.out.println(arvore2.buscar(0));
		System.out.println(arvore2.buscar(1));
		System.out.println(arvore2.buscar(2));
		System.out.println(arvore2.buscar(3));
		System.out.println(arvore2.buscar(4));
		System.out.println(arvore2.Sucessor());
	}

}
