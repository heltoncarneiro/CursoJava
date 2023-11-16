package avaliaçãoJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class teste {

	@Test
	void test11() throws Exception {
		Pessoa pessoa = new Pessoa("Helton Jose", 22);
		assertEquals("Helton Jose", pessoa.getNome());
		assertEquals(22, pessoa.getIdade());
	}
	
	@Test
	void test12() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> new Pessoa("Helton", 22));
		assertEquals("Deve ser informado o sobrenome", exception.getMessage());
	}
	
	
	
	@Test
	void test21() throws Exception {
		Pessoa pessoa = new Pessoa("Maria Jose", 40);
		assertEquals("Maria Jose", pessoa.getNome());
		assertEquals(40, pessoa.getIdade());
	}
	
	@Test
	void test22() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> new Pessoa("ana", 22));
		assertEquals("Nome e sobrenome devem possuir mais do que 5 caracteres", exception.getMessage());
	}
	
	
	
	@Test
	void test31() throws Exception {
		Pessoa pessoa = new Pessoa("Carlos Andre Jose", 60);
		assertEquals("Carlos Andre Jose", pessoa.getNome());
		assertEquals(60, pessoa.getIdade());
	}
	
	@Test
	void test32() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> new Pessoa("Ana# Maria", 22));
		assertEquals("Caracter inválido encontrado!", exception.getMessage());
	}
	
	
	
	@Test
	void test41() throws Exception {
		Pessoa pessoa = new Pessoa("Ana Maria", 0);
		assertEquals("Ana Maria", pessoa.getNome());
		assertEquals(0, pessoa.getIdade());
	}
	
	@Test
	void test42() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> new Pessoa("Ana Maria", 	-1));
		assertEquals("Idade não pode ser negativa", exception.getMessage());
	}
	@Test
	void test43() throws Exception {
		Pessoa pessoa = new Pessoa("Ana Maria", 100);
		assertEquals("Ana Maria", pessoa.getNome());
		assertEquals(100, pessoa.getIdade());
	}
	
	@Test
	void test44() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> new Pessoa("Ana Maria", 101));
		assertEquals("Idade não pode ser maior que 100", exception.getMessage());
	}
	
	
	
	
	@Test
	void erro1() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> new Pessoa("Ana Maria%", 22));
		assertEquals("Caracter inválido encontrado!", exception.getMessage());
	}
	@Test
	void erro2() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> new Pessoa("Antonio ", 22));
		assertEquals("Deve ser informado o sobrenome", exception.getMessage());
	}

}
