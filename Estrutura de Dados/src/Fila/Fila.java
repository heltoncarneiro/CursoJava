package Fila;

public class Fila {
	private int[] array;
	private int inicio;
	private int numElementos;
	public int[] getArray() {
		return array;
	}
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getNumElementos() {
		return numElementos;
	}
	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}
	public Fila(int tamanhoArray) {
		inicio = 0;
		numElementos = 0;
		array = new int[tamanhoArray];
	}
	public void enqueue(int value) {
	if(numElementos < array.length) {
		int posicao = inicio+numElementos;
		if(posicao < array.length) {
			array[posicao]= value;
			numElementos++;
		}else {
			array[posicao-array.length]= value;
			numElementos++;
		}
	}else{
		System.out.printf("Não é possivel adicionar %d a fila está cheia, preencheu todo o array\n", value);
	}
	}
	public void dequeue() {
		if(numElementos>1) {
			if(inicio == array.length) {
				inicio = 0;
			}else {
				inicio++;
			}
			numElementos--;
		}else {
			inicio=0;
			numElementos =0;
		}
	}
	public void imprimir() {
		if(numElementos == 0) {
			System.out.println("A fila está vazia");
		}else{
			System.out.println("Fila:");
			for(int i= inicio; i != inicio+numElementos;i++) {
				if(i<array.length) {
					System.out.print(array[i]+" ");
				}else {
					System.out.print(array[i-array.length]+" ");
				}
			}
		System.out.println();
		}
	}
}
