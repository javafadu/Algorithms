package InsertionSort;

import SelectionSort.SelectionSort;

import java.util.Arrays;

public class InsertionSortRunner {
    public static void main(String[] args) {

        int[] arr = {7,4,5,9,8,2,1};
        System.out.println("Before Sorting : "+ Arrays.toString(arr));
        InsertionSort.insertionSort(arr);
        System.out.println("After Sorting : "+Arrays.toString(arr));


    }
}
