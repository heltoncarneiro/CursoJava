package ordenacao;

public class BubbleSort {
	
	public static float Bubblesort30(int[] array) {
		float tempo = 0;
		for(int i= 0; i<30;i++) {
			int[] arraycopia = new int[array.length];
			for(int val = 0; val < array.length;val++) {
				arraycopia[val] = array[val];
			}
			long start = System.currentTimeMillis();
	        Bubblesort(arraycopia);
	        long end = System.currentTimeMillis();  
	        tempo += end-start;
		}
		return tempo/30;
	}
	
	private static void Bubblesort(int[] array) {
		int fim = array.length;
		boolean trocou = false;
		for (int i = 0; i < array.length-1; i++) { // for 1
			trocou = false;
			for (int j = 0; j < fim - 1; j++) { // for 2
				if (array[j] > array[j + 1]) {
					int menor = array[j + 1];
					array[j + 1] = array[j];
					array[j] = menor;
					trocou = true;
				}
			}
			fim--;
			if (!trocou) {
				break;
			}
		}
	}
}
