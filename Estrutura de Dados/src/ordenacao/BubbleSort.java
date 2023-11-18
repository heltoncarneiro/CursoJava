package ordenacao;

public class BubbleSort {
	public static void Bubblesort(int[] array) {
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
