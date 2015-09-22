package Sort;

/**
 * Created by ChornyiUA on 22.09.2015.
 */
public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public SelectionSort() {
    }

    public void sort() {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }

    public void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }


}
