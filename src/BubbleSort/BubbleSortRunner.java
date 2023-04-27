package BubbleSort;

import InsertionSort.InsertionSort;

import java.util.Arrays;

public class BubbleSortRunner {

    public static void main(String[] args) {

        int[] arr = {3, 1, 4,5,8,6,2};

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));

    }

}
