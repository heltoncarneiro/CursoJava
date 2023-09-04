package arvoreBinaria;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreBinaria arvore = new ArvoreBinaria("A", new ArvoreBinaria("B", new ArvoreBinaria("C"), new ArvoreBinaria("D")), new ArvoreBinaria("E", null, new ArvoreBinaria("F")));
		ArvoreBinaria arvore2 = new ArvoreBinaria("1",new ArvoreBinaria("2"),new ArvoreBinaria("3"));
		ArvoreBinaria arvore3 = new ArvoreBinaria("I",new ArvoreBinaria("II", new ArvoreBinaria("III"),null), null);
		/* 
			arvore = 
						  A4
					     / \
					    /   \
					   B2     E5
 					  / \	  \
					 /   \	   \	
					C1     D3     F6
			
			
			arvore 2 = 
						  1
					     / \
					    /   \
					   2     3
			
			
			arvore 3 = 
						  I
					     / 
					    /   
					  II     
 					  / 	  
					 /   	   	
				   III         

		*/
		System.out.println("Arvore 1 pr�-ordem: "+arvore.preOrder());
		System.out.println("Arvore 1 em-ordem: "+arvore.emOrder());
		System.out.println("Arvore 1 p�s-ordem: "+arvore.posOrder());
		System.out.println("\"A\" est� na Arvore 1: "+arvore.pertence("A"));
		System.out.println("\"H\" est� na Arvore 1: "+arvore.pertence("H"));
		System.out.println("Altura da arvore 1: "+arvore.altura());
		System.out.println("\n");
		System.out.println("Arvore 1 est� cheia: "+arvore.cheia());
		System.out.println("Arvore 2 est� cheia: "+arvore2.cheia());
		System.out.println("Arvore 3 est� cheia: "+arvore3.cheia());
		System.out.println();
		System.out.println("Arvore 1 est� completa: "+arvore.completa(arvore.altura()));
		System.out.println("Arvore 2 est� cheia: "+arvore2.completa(arvore2.altura()));
		System.out.println("Arvore 3 est� cheia: "+arvore3.completa(arvore3.altura()));
		System.out.println();
		System.out.println("Arvore 1 � degenerada: "+arvore.degenerada(arvore.altura()));
		System.out.println("Arvore 2 � degenerada: "+arvore2.degenerada(arvore2.altura()));
		System.out.println("Arvore 3 � degenerada: "+arvore3.degenerada(arvore3.altura()));
	}

}
