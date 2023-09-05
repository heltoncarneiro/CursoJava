package arvoreBst;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
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
		System.out.println("sucessor de 2: "+arvore.Sucessor(2));
		System.out.println("sucessor de 1: "+arvore.Sucessor(1));
		System.out.println("sucessor de -1: "+arvore.Sucessor(-1));
		System.out.println("sucessor de 3: "+arvore.Sucessor(3));
		System.out.println("sucessor de 4: "+arvore.Sucessor(4));
		System.out.println("sucessor de 5: "+arvore.Sucessor(5));
		/*ArvoreBST arvore2 = new ArvoreBST(3);
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
		System.out.println(arvore2.buscar(4));*/
		
		
		ArvoreBST arvore = new ArvoreBST(20);
		arvore.inserir(19);
		arvore.inserir(10);
		arvore.inserir(11);
		arvore.inserir(22);
		arvore.inserir(9);
		arvore.inserir(21);
		arvore.inserir(26);
		arvore.inserir(30);
		System.out.println(arvore.preOrder());
		System.out.println("sucessor de 5: "+arvore.Sucessor(5));
		System.out.println("sucessor de 9: "+arvore.Sucessor(9));
		System.out.println("sucessor de 10: "+arvore.Sucessor(10));
		System.out.println("sucessor de 11: "+arvore.Sucessor(11));
		System.out.println("sucessor de 15: "+arvore.Sucessor(15));
		System.out.println("sucessor de 19: "+arvore.Sucessor(19));
		System.out.println("sucessor de 20: "+arvore.Sucessor(20));
		System.out.println("sucessor de 21: "+arvore.Sucessor(21));
		System.out.println("sucessor de 22: "+arvore.Sucessor(22));
		System.out.println("sucessor de 26: "+arvore.Sucessor(26));
	}

}
