package Fila;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila fila = new Fila(4);
		fila.enqueue(0); // 0
		fila.enqueue(1); // 0 1 
		fila.enqueue(2); // 0 1 2 
		fila.enqueue(3); // 0 1 2 3
		fila.imprimir();
		fila.dequeue(); // 1 2 3
		fila.imprimir(); 
		fila.enqueue(4); // 1 2 3 4
		fila.imprimir(); 
		fila.dequeue(); // 2 3 4
		fila.dequeue(); // 3 4
		fila.imprimir(); 
		fila.enqueue(5); // 3 4 5 
		fila.enqueue(6); // 3 4 5 6
		fila.imprimir();
		fila.enqueue(0); // Não é possivel adicionar 0 a fila está cheia, preencheu todo o array
		fila.imprimir(); //A fila está cheia, preencheu todo o array
		fila.dequeue();	// 4 5 6
		fila.dequeue();	//	5 6
		fila.dequeue();	// 6
		fila.dequeue();  //fila está vazia
		fila.imprimir();
		fila.dequeue();
		fila.enqueue(1); // 1
		fila.enqueue(2); // 1 2
		fila.enqueue(3); // 1 2 3
		fila.enqueue(4); // 1 2 3 4
		fila.enqueue(5); // Não é possivel adicionar 5 a fila está cheia, preencheu todo o array
		fila.imprimir();
		fila.dequeue();
		fila.enqueue(6);
		fila.imprimir();
		fila.dequeue();
		fila.enqueue(7);
		fila.imprimir();
		fila.dequeue();
		fila.enqueue(8);
		fila.imprimir();
		fila.dequeue();
		fila.enqueue(9);
		fila.imprimir();
		fila.dequeue();
		fila.enqueue(10);
		fila.imprimir();
		fila.dequeue(); 
		fila.enqueue(11);
		fila.imprimir();
		fila.dequeue(); 
	}

}
