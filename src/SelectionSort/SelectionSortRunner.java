package SelectionSort;

import java.util.Arrays;

public class SelectionSortRunner {

    public static void main(String[] args) {
        int[] arr = {7,3,5,2,6,17,12,9};
        System.out.println("Before Sorting : "+Arrays.toString(arr));
        SelectionSort.selectionSort(arr);
        System.out.println("After Sorting : "+Arrays.toString(arr));

    }
}
