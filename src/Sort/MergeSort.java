package Sort;

import java.util.Arrays;

/**
 * Created by ChornyiUA on 22.09.2015.
 */
public class MergeSort {
    private int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    public MergeSort() {
    }

    public void sort (){
        array = sortMerge(array);

    }

    private static int[] sortMerge(int[] arr) {
        int len = arr.length;
        if (len < 2) return arr;
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }

    private static int[] merge(int[] arr_1, int[] arr_2) {
        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                else result[i] = arr_1[a++];
            } else if (b < len_2) {
                result[i] = arr_2[b++];
            } else {
                result[i] = arr_1[a++];
            }
        }
        return result;
    }

    public void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }


}
