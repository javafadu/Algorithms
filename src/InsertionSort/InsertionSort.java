package InsertionSort;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i <arr.length ; i++) { // start with second index

            int temp = arr[i];
            int j = i-1; // comparison with previous element
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j=j-1;

            }
            arr[j+1] = temp;
        }
        
        
    }

}
