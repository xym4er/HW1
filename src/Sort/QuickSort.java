package Sort;

/**
 * Created by ChornyiUA on 22.09.2015.
 */
public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public QuickSort() {

    }

    public void sort(){
        doSort(0,array.length-1);
    }

    public void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start;
        int j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur + 1, end);
    }

    public void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }


}
