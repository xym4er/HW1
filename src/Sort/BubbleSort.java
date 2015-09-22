package Sort;

/**
 * Created by ChornyiUA on 22.09.2015.
 */
public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public BubbleSort() {
    }

    public void sort() {
        int buf;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                }
    }

    public void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }


}
