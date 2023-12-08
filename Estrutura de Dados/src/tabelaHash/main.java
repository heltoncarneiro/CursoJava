package tabelaHash;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable hash = new HashTable(3);

		hash.insere("Helton");
		hash.insere("Ana");
		hash.insere("Samara");
		hash.insere("Hilton");
		hash.insere("Adilma");
		hash.insere("Rafael");
		hash.insere("Clara");
		hash.insere("João");
		hash.insere("Sophia");
		hash.insere("Gabriel");
		hash.insere("Mariana");
		hash.insere("Lucas");
		hash.insere("Isabela");
		hash.insere("Matheus");
		hash.insere("Laura");
		hash.insere("Pedro");
		hash.imprimirHashTable();
		System.out.println("\nbuscar um elemento existente que seja o primeiro da lista");
		System.out.println(hash.busca("Pedro"));
		System.out.println(hash.busca("Isabela"));
		System.out.println(hash.busca("Laura"));
		
		System.out.println("\nbuscar um elemento existente que seja o último da lista e não seja o primeiro");
		System.out.println(hash.busca("Helton"));
		System.out.println(hash.busca("Sophia"));
		System.out.println(hash.busca("Samara"));
		
		System.out.println("\nbuscar no meio da lista");
		System.out.println(hash.busca("Adilma"));
		System.out.println(hash.busca("Mariana"));
		System.out.println(hash.busca("João"));
		
		System.out.println("\nbuscar um elemento que nunca foi inserido");
		System.out.println(hash.busca("Antonio"));
		System.out.println(hash.busca("Maria Clara"));
		System.out.println(hash.busca("Jose"));
		
		
		System.out.println("\nbuscar um elemento que já foi inserido e removido");
		hash.imprimirHashTable();
		hash.remove("Pedro");
		hash.remove("Lucas");
		hash.remove("Samara");
		System.out.println();
		hash.imprimirHashTable();
		System.out.println(hash.busca("Pedro"));
		System.out.println(hash.busca("Lucas"));
		System.out.println(hash.busca("Samara"));
		
		System.out.println("\nremover todos os elementos de uma posição da tabela e voltar a inserir elementos novamente");
		hash.imprimirHashTable();
		hash.remove("Clara");
		hash.remove("Adilma");
		hash.remove("Ana");
		hash.remove("Helton");
		System.out.println();
		hash.imprimirHashTable();
		hash.insere("Julia");
		hash.insere("Diego");
		hash.insere("Camila");
		hash.insere("Felipe");
		hash.insere("Larissa");
		hash.insere("Ricardo");
		hash.insere("Fernanda");
		hash.insere("Gustavo");
		System.out.println();
		hash.imprimirHashTable();

		
	}
}
