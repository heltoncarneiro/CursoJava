package ordenacao;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = {25,48,37,12,57,92,86,33};
        int[] array2 = {10,8,7,6,5,4,3,2};
        BubbleSort.Bubblesort(array);
        BubbleSort.Bubblesort(array2);
        for (int i : array2){
            System.out.print(i+ " ");
        }
    }
}