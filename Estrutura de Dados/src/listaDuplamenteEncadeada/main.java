package listaDuplamenteEncadeada;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criando a lista duplamente encadeada
		System.out.println("Criando a lista duplamente encadeada");
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		
		//inserindo elementos na lista
		System.out.println("\n\n\ninserindo elementos na lista: (inserindo 0,1,2,3,4,5,6,7,8 e 9) ");
		System.out.println("Antes:");
		lista.imprimir();
		lista.inserir(0);
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		lista.inserir(6);
		lista.inserir(7);
		lista.inserir(8);
		lista.inserir(9);
		System.out.println("Depois:");
		lista.imprimir();
		
		//remoção do inicio
		System.out.println("\n\n\nremoção do valor 0 no inicio:");
		System.out.println("Antes:");
		lista.imprimir();
		lista.deletar(0);
		System.out.println("Depois:");
		lista.imprimir();
		
		//remoção do final
		System.out.println("\n\n\nremoção do valor 9 no final:");
		System.out.println("Antes:");
		lista.imprimir();
		lista.deletar(9);
		System.out.println("Depois:");
		lista.imprimir();
		
		//remoção do meio
		System.out.println("\n\n\nremoção do valor 5 no meio:");
		System.out.println("Antes:");
		lista.imprimir();
		lista.deletar(5);
		System.out.println("Depois:");
		lista.imprimir();
		
		//inserindo elementos duplicados
		System.out.println("\n\n\ninserindo elementos duplicados: (inserindo 1,1,1,4,4,4,8,8,8 e 8)");
		System.out.println("Antes:");
		lista.imprimir();
		lista.inserir(1);
		lista.inserir(1);
		lista.inserir(1);
		lista.inserir(4);
		lista.inserir(4);
		lista.inserir(4);
		lista.inserir(8);
		lista.inserir(8);
		lista.inserir(8);
		lista.inserir(8);
		System.out.println("Depois:");
		lista.imprimir();
		
		//removendo elementos duplicados
		System.out.println("\n\n\nremoção do valor 1 repetido 4 vezes no inicio:");
		System.out.println("Antes:");
		lista.imprimir();
		lista.deletar(1);
		System.out.println("Depois:");
		lista.imprimir();
		
		System.out.println("\n\n\nremoção do valor 4 repetido 4 vezes no meio:");
		System.out.println("Antes:");
		lista.imprimir();
		lista.deletar(4);
		System.out.println("Depois:");
		lista.imprimir();
		
		System.out.println("\n\n\nremoção do valor 8 repetido 5 vezes no final:");
		System.out.println("Antes:");
		lista.imprimir();
		lista.deletar(8);
		System.out.println("Depois:");
		lista.imprimir();
		
		System.out.println("\n\n\nremoção do valor 15 que é inexistente:");
		System.out.println("Antes:");
		lista.imprimir();
		lista.deletar(15);
		System.out.println("Depois:");
		lista.imprimir();
		
		//removendo todos os elementos da lista
		System.out.println("\n\n\nVerificando se a lista é vazia com o metodo listaVazia: "+ lista.listaVazia());
		System.out.println("Removendo todos os elementos da lista: (2,3,6 e 7)");
		System.out.println("Antes:");
		lista.imprimir();
		lista.deletar(2);
		lista.deletar(3);
		lista.deletar(6);
		lista.deletar(7);
		System.out.println("Depois:");
		lista.imprimir();
		System.out.println("Verificando se a lista é vazia com o metodo listaVazia: "+ lista.listaVazia());
		
		lista.deletar(0);
		lista.deletar(1);
		lista.imprimir();
		
		//voltando a preencher a lista
		System.out.println("\n\n\nVoltando a inserir elementos na lista que agora estávazia: (Inserindo so valores 0,1,2,3,4,5,0,1 e 6)");
		System.out.println("antes:");
		lista.imprimir();
		lista.inserir(0);
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		lista.inserir(0);
		lista.inserir(1);
		lista.inserir(6);
		System.out.println("Depois:");
		lista.imprimir();
		
	}

}
