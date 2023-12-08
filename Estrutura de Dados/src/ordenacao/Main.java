package ordenacao;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array50000 = new int[50000];
		int[] array100000 = new int[100000]; // 50000 primeiro elementos iguais o primeiro array
		int[] array200000 = new int[200000]; // 100000 primeiro elementos iguais o segundo array
		for (int i = 0; i < 50000; i++) {
			array50000[i] = random.nextInt(10001);
			array100000[i] = random.nextInt(10001);
			array200000[i] = random.nextInt(10001);
		}
		for (int i = 50000; i < 100000; i++) {
			array100000[i] = random.nextInt(10001);
			array200000[i] = random.nextInt(10001);
		}
		for (int i = 100000; i < 200000; i++) {
			array200000[i] = random.nextInt(10001);
		}
		
		System.out.printf("\n\n\nQuickSort com array de 50000,media de tempo das 30 execuções: %.2f ms",QuickSort.Quicksort30(array50000));
		System.out.printf("\nBubbleSort com array de 50000,media de tempo das 30 execuções: %.2f ms",BubbleSort.Bubblesort30(array50000));
		System.out.printf("\nMergeSort com array de 50000,media de tempo das 30 execuções: %.2f ms",MergeSort.Mergesort30(array50000));
		System.out.printf("\n\n\nQuickSort com array de 100000,media de tempo das 30 execuções: %.2f ms",QuickSort.Quicksort30(array100000));
		System.out.printf("\nBubbleSort com array de 100000,media de tempo das 30 execuções: %.2f ms",BubbleSort.Bubblesort30(array100000));
		System.out.printf("\nMergeSort com array de 100000,media de tempo das 30 execuções: %.2f ms",MergeSort.Mergesort30(array100000));
		System.out.printf("\n\n\nQuickSort com array de 200000,media de tempo das 30 execuções: %.2f ms",QuickSort.Quicksort30(array200000));
		System.out.printf("\nBubbleSort com array de 200000,media de tempo das 30 execuções: %.2f ms",BubbleSort.Bubblesort30(array200000));
		System.out.printf("\nMergeSort com array de 200000,media de tempo das 30 execuções: %.2f ms",MergeSort.Mergesort30(array200000));

	}

}