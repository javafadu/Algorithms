package MergeSort;

import java.util.Arrays;

public class MergeSortRunner {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4,5,8,6,2};

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        MergeSort.mergeSort(arr,0,arr.length-1);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }
}
