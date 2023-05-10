package ShellSort;

import java.util.Arrays;

public class ShellSortRunner {

    public static void main(String[] args) {
        int[] arr = {5,3,4,2};

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        ShellSort.shellSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }
}
