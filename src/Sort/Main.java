package Sort;

/**
 * Created by ChornyiUA on 22.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[80];
        BubbleSort bubbleSort;
        QuickSort quickSort;
        SelectionSort selectionSort;
        MergeSort mergeSort;

        init(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
        System.out.println();
        System.out.println("BubbleSort:");
        bubbleSort.showArray();

        init(array);

        quickSort = new QuickSort(array);
        quickSort.sort();
        System.out.println();
        System.out.println("QuickSort:");
        quickSort.showArray();

        init(array);

        selectionSort = new SelectionSort(array);
        selectionSort.sort();
        System.out.println();
        System.out.println("SelectionSort");
        selectionSort.showArray();

        init(array);

        mergeSort = new MergeSort(array);
        mergeSort.sort();
        System.out.println();
        System.out.println("MergeSort");
        mergeSort.showArray();

    }

    static void init(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}
