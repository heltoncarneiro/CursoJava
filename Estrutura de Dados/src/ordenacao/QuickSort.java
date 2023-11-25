package ordenacao;

public class QuickSort {

	public static float Quicksort30(int[] array) {
		float tempo = 0;
		for (int i = 0; i < 30; i++) {
			int[] arraycopia = new int[array.length];
			for (int val = 0; val < array.length; val++) {
				arraycopia[val] = array[val];
			}
			long start = System.currentTimeMillis();
			Quicksort(arraycopia, 0, arraycopia.length - 1);
			long end = System.currentTimeMillis();
			tempo += end - start;
		}
		return tempo / 30;
	}

	private static void Quicksort(int[] array, int lb, int ub) {
		if (lb < ub) {
			int pos = PosicionaPivo(array, lb, ub);
			Quicksort(array, lb, pos - 1);
			Quicksort(array, pos + 1, ub);
		}
	}

	private static int PosicionaPivo(int[] array, int lb, int ub) {
		int pivo = lb++;
		int fim = ub;
		while (true) {
			if (lb > ub) {
				int val = array[ub];
				array[ub] = array[pivo];
				array[pivo] = val;
				return ub;
			}
			if (array[lb] <= array[pivo]) {
				lb++;
				continue;
			} else if (array[ub] > array[pivo]) {
				ub--;
				continue;
			} else {
				int trocar = array[ub];
				array[ub] = array[lb];
				array[lb] = trocar;
			}
		}
	}
}
