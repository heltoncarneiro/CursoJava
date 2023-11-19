package ordenacao;

public class MergeSort {
	
	public static float Mergesort30(int[] array) {
		float tempo = 0;
		for(int i= 0; i<30;i++) {
			int[] arraycopia = new int[array.length];
			int[] arrayaux = new int[array.length];
			for(int val = 0; val < array.length;val++) {
				arraycopia[val] = array[val];
			}
			long start = System.currentTimeMillis();
	        sort(arraycopia, arrayaux, 0, arraycopia.length-1);
	        long end = System.currentTimeMillis();  
	        tempo += end-start;
		}
		return tempo/30;
	}
	static void sort(int vetor[], int aux[], int low, int high)

	{

	if (low >= high)

	return;

	int mid = (low + high) / 2;

	sort(vetor, aux, low, mid);

	sort(vetor, aux, mid + 1, high);

	merge(vetor, aux, low, mid, high);

	}
	static void merge(int vetor[], int aux[], int low, int mid, int high){
		
		int i = low;
		int j = mid + 1;
		for (int k = low; k <= high; k++) 
				aux[k] = vetor[k];
			for (int k = low; k <= high; k++){
			if (i > mid)
				vetor[k] = aux[j++];
			else if (j > high)
				vetor[k] = aux[i++];
			else if (aux[j] < aux[i])

				vetor[k] = aux[j++];

			else

				vetor[k] = aux[i++];

		}

	}

}
