package tabelaHash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class teste {
	//m0 = 1000/20
	//m0 = 50 , numero primo mais proximo de 50 é 53
	//m0 = 53
	@Test
	void test() {
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
		assertEquals("[Pedro, Clara, Adilma, Ana, Helton]\n"
				+ "[Isabela, Lucas, Mariana, Gabriel, Sophia]\n"
				+ "[Laura, Matheus, João, Rafael, Hilton, Samara]\n", hash.imprimirHashTable());
	}
	
	@Test
	void test2() {
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
		//buscar um elemento existente que seja o primeiro da lista
		assertEquals(true, hash.busca("Pedro"));
		assertEquals(true, hash.busca("Isabela"));
		assertEquals(true, hash.busca("Laura"));
	}

	@Test
	void test3() {
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
		//buscar um elemento existente que seja o último da lista e não seja o primeiro
		assertEquals(true, hash.busca("Helton"));
		assertEquals(true, hash.busca("Sophia"));
		assertEquals(true, hash.busca("Samara"));
	}
	
	@Test
	void test4() {
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
		//buscar um elemento que nunca foi inserido
		assertEquals(false, hash.busca("Antonio"));
		assertEquals(false, hash.busca("Maria Clara"));
		assertEquals(false, hash.busca("Jose"));
	}
	
	@Test
	void test5() {
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
		//buscar um elemento que já foi inserido e removido
		hash.remove("Pedro");
		hash.remove("Lucas");
		hash.remove("Samara");
		assertEquals(false, hash.busca("Pedro"));
		assertEquals(false, hash.busca("Lucas"));
		assertEquals(false, hash.busca("Samara"));
	}
	
	@Test
	void test6() {
		HashTable hash = new HashTable(3);
		hash.insere("Ana");
		hash.insere("Adilma");
		hash.insere("Clara");
		hash.insere("Mariana");
		hash.insere("Isabela");
		hash.insere("Hilton");
		hash.insere("Rafael");
		hash.insere("Laura");
		//buscar um elemento que já foi inserido e removido
		assertEquals("[Clara, Adilma, Ana]\n"
				+ "[Isabela, Mariana]\n"
				+ "[Laura, Rafael, Hilton]\n", hash.imprimirHashTable());
		hash.remove("Clara");
		hash.remove("Adilma");
		hash.remove("Ana");
		assertEquals("[]\n"
				+ "[Isabela, Mariana]\n"
				+ "[Laura, Rafael, Hilton]\n", hash.imprimirHashTable());
		hash.insere("Julia");
		hash.insere("Diego");
		hash.insere("Camila");
		hash.insere("Felipe");
		hash.insere("Larissa");
		hash.insere("Ricardo");
		hash.insere("Fernanda");
		hash.insere("Gustavo");
		assertEquals("[Gustavo, Fernanda, Larissa, Camila, Diego]\n"
				+ "[Felipe, Julia, Isabela, Mariana]\n"
				+ "[Ricardo, Laura, Rafael, Hilton]\n", hash.imprimirHashTable());
	}
}
