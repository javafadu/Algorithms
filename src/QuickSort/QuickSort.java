package QuickSort;

public class QuickSort {

    // first: first element index
    // last: last element index
    public static void quickSort(int[] arr, int first, int last) {
        if(first<last) {
            int pivot = partition(arr, first, last);
            quickSort(arr,first,last-1); // recursive for left side
            quickSort(arr,pivot+1,last);
        }
    }

    public static int partition(int[] arr, int first, int last ) {
        // set pivot element (we choose the last element as pivot)
        int pivot = arr[last];
        int i = first-1; // start with index of first element

        // relocation in the first iteration
        for (int j = first; j < last ; j++) {
            if(arr[j]<=pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;


        return i+1;

    }


}
