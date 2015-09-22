package Sort;

/**
 * Created by ChornyiUA on 22.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[80];
        BubbleSort bubbleSort;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
        System.out.println();
        System.out.println("BubbleSort:");
        bubbleSort.showArray();
    }
}
