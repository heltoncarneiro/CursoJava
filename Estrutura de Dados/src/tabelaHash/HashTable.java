package tabelaHash;

import listaEncadeada.Lista;

public class HashTable {
	private int m;
	private Lista[] hashtable;
	public HashTable(int m) {
		this.hashtable = new Lista[m];
		for(int i= 0; i < m; i++) {
			hashtable[i] = new Lista();
		}
		this.m = m;
	}
	private int key(String palavra) {
		return (value(palavra)) % m; 
		
	}
	public void insere(String str) {
		int key = key(str);
		Lista lista = hashtable[key];
		lista.Inserir(str);
	}
	public boolean busca(String str) {
		int key = key(str);
		Lista lista = hashtable[key];
		return lista.procurar(str);
	}
	public void remove(String str) {
		int key = key(str);
		Lista lista = hashtable[key];
		lista.deletar(str);
	}
	private int value(String palavra){
		int val = 0;
		for (int i = 0;i < palavra.length();i++) {
			val += palavra.charAt(i)*(i+1); 
		}
		return val;
	}
	public void imprimirHashTable() {
		for(Lista i : hashtable) {
			i.Imprimir();
		}
	}
}
