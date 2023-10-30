package arvoreAvl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class teste {

	@Test
	@DisplayName("1) inserções simples que não requeiram balanceamento (0,5)")
	void test1() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserir(5);
		tree.inserir(3);
		tree.inserir(7);
		tree.inserir(1);
		tree.inserir(4);
		tree.inserir(9);
		assertEquals("5(0) 3(0) 1(0) 4(0) 7(-1) 9(0)", tree.preOrder());
	}
	
	@Test
	@DisplayName("2) remoção de nó sem filhos (0,5)")
	void test2() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserir(5);
		tree.inserir(3);
		tree.inserir(7);
		tree.inserir(1);
		tree.inserir(4);
		tree.inserir(9);
		
		tree.remover(4);
		assertEquals("5(0) 3(1) 1(0) 7(-1) 9(0)", tree.preOrder());
	}
	
	@Test
	@DisplayName("3) remoção de nó com 1 filho à direita (0,5)")
	void test3() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserir(5);
		tree.inserir(3);
		tree.inserir(7);
		tree.inserir(1);
		tree.inserir(4);
		tree.inserir(9);
		
		tree.remover(7);
		assertEquals("5(1) 3(0) 1(0) 4(0) 9(0)", tree.preOrder());
	}
	
	@Test
	@DisplayName("4) remoção de nó com 1 filho à esquerda (0,5)")
	void test4() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserir(5);
		tree.inserir(3);
		tree.inserir(7);
		tree.inserir(1);
		
		tree.remover(3);
		assertEquals("5(0) 1(0) 7(0)", tree.preOrder());
	}
	
	@Test
	@DisplayName("5) remoção de nó com 2 filhos, e que seja um filho à direita (0,5)")
	void test5() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserir(15);
		tree.inserir(6);
		tree.inserir(18);
		tree.inserir(1);
		tree.inserir(9);
		tree.inserir(16);
		tree.inserir(22);
		tree.inserir(24);
		
		tree.remover(18);
		assertEquals("15(0) 6(0) 1(0) 9(0) 22(0) 16(0) 24(0)", tree.preOrder());
		
	}
	
	@Test
	@DisplayName("6) remoção de nó com 2 filhos, e que seja um filho à esquerda (0,5)")
	void test6() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserir(15);
		tree.inserir(6);
		tree.inserir(18);
		tree.inserir(1);
		tree.inserir(9);
		tree.inserir(16);
		tree.inserir(22);
		tree.inserir(7);
		tree.inserir(14);
		tree.inserir(17);
		tree.inserir(8);
		
		tree.remover(6);
		assertEquals("15(0) 7(-1) 1(0) 9(0) 8(0) 14(0) 18(1) 16(-1) 17(0) 22(0)", tree.preOrder());
		
	}
	
	@Test
	@DisplayName("7) inserção que requer rotação simples à direita (0,5)")
	void test7() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserirAVL(15);
		tree.inserirAVL(14);
		tree.inserirAVL(13);
		assertEquals("14(0) 13(0) 15(0)", tree.preOrder());
		
	}
	
	@Test
	@DisplayName("8) inserção que requer rotação simples à direita (0,5)")
	void test8() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserirAVL(5);
		tree.inserirAVL(4);
		tree.inserirAVL(6);
		tree.inserirAVL(3);
		tree.inserirAVL(7);
		tree.inserirAVL(2);
		assertEquals("5(0) 3(0) 2(0) 4(0) 6(-1) 7(0)", tree.preOrder());
		
	}
	
	@Test
	@DisplayName("9) inserção que requer rotação simples à esquerda (0,5)")
	void test9() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserirAVL(15);
		tree.inserirAVL(16);
		tree.inserirAVL(17);
		assertEquals("16(0) 15(0) 17(0)", tree.preOrder());
		
	}
	
	@Test
	@DisplayName("10) inserção que requer rotação simples à esquerda (0,5)")
	void test10() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserirAVL(5);
		tree.inserirAVL(3);
		tree.inserirAVL(6);
		tree.inserirAVL(2);
		tree.inserirAVL(7);
		tree.inserirAVL(8);
		assertEquals("5(0) 3(1) 2(0) 7(0) 6(0) 8(0)", tree.preOrder());
		
	}
	
	@Test
	@DisplayName("11) inserção que requer rotação dupla à direita (0,5)")
	void test11() {
		ArvoreAVL tree = new ArvoreAVL();
		tree.inserirAVL(8);
		tree.inserirAVL(6);
		tree.inserirAVL(20);
		tree.inserirAVL(3);
		tree.inserirAVL(7);
		tree.inserirAVL(18);
		tree.inserirAVL(30);
		tree.inserirAVL(2);
		tree.inserirAVL(5);
		tree.inserirAVL(10);
		tree.inserirAVL(19);
		tree.inserirAVL(25);
		tree.inserirAVL(35);
		tree.inserirAVL(4);
		
		assertEquals("8(0) 5(0) 3(0) 2(0) 4(0) 6(-1) 7(0) 20(0) 18(0) 10(0) 19(0) 30(0) 25(0) 35(0)", tree.preOrder());
		
	}
	

}
