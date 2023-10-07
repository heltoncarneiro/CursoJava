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
		System.out.println("sucessor de 2: "+arvore.sucessor(2));
		System.out.println("sucessor de 1: "+arvore.sucessor(1));
		System.out.println("sucessor de -1: "+arvore.sucessor(-1));
		System.out.println("sucessor de 3: "+arvore.sucessor(3));
		System.out.println("sucessor de 4: "+arvore.sucessor(4));
		System.out.println("sucessor de 5: "+arvore.sucessor(5));
		System.out.println("sucessor de 6: "+arvore.sucessor(6));
		*/
		/*
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
		*/
		/*
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
		/*
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
		System.out.println(arvore.returnDireita(5));
		System.out.println(arvore.returnDireita(9));
		System.out.println(arvore.returnDireita(10).getRaiz());
		System.out.println(arvore.returnDireita(11));
		System.out.println(arvore.returnDireita(15));
		System.out.println(arvore.returnDireita(19));
		System.out.println(arvore.returnDireita(20).getRaiz());
		System.out.println(arvore.returnDireita(21));
		System.out.println(arvore.returnDireita(22).getRaiz());
		System.out.println(arvore.returnDireita(26).getRaiz());
		*/
		/*
		ArvoreBST A = new ArvoreBST(15);
		A.inserir(6);
		A.inserir(1);
		A.inserir(9);
		A.inserir(7);
		A.inserir(8);
		A.inserir(14);
		A.inserir(18);
		A.inserir(16);
		A.inserir(17);
		A.inserir(22);
		System.out.println(A.preOrder());
		A.remover(1);
		A.remover(9);
		A.remover(6);
		System.out.println(A.emOrder());
		*/
		
		
		ArvoreBST arvore = new ArvoreBST(15);
		arvore.inserir(6);
		arvore.inserir(1);
		arvore.inserir(9);
		arvore.inserir(7);
		arvore.inserir(8);
		arvore.inserir(14);
		arvore.inserir(18);
		arvore.inserir(16);
		arvore.inserir(17);
		arvore.inserir(22);
		System.out.println(arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 1\nantes: "+arvore.getTree().preOrder());
		arvore.remover(1);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 14\nantes: "+arvore.getTree().preOrder());
		arvore.remover(14);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 18\nantes: "+arvore.getTree().preOrder());
		arvore.remover(18);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 22\nantes: "+arvore.getTree().preOrder());
		arvore.remover(22);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 6\nantes: "+arvore.getTree().preOrder());
		arvore.remover(6);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 8\nantes: "+arvore.getTree().preOrder());
		arvore.remover(8);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 7\nantes: "+arvore.getTree().preOrder());
		arvore.remover(7);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 16\nantes: "+arvore.getTree().preOrder());
		arvore.remover(16);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 15\nantes: "+arvore.getTree().preOrder());
		arvore.remover(15);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 17\nantes: "+arvore.getTree().preOrder());
		arvore.remover(17);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		System.out.println("\n\n\nRemovendo o valor 9\nantes: "+arvore.getTree().preOrder());
		arvore.remover(9);
		System.out.println("Depois: "+arvore.getTree().preOrder());
		arvore.inserir(50);
		System.out.println("\n\nInserindo o valor 50:"+arvore.getTree().preOrder());
		
	}

}
