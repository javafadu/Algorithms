package MergeSort;

public class MergeSort {


    public static void merge(int[] arr, int left, int middle, int right) {

        int low = middle -left + 1; // size of the left sub-array
        int high = right - middle; // size of the right sub-array

        int[] L = new int[low];
        int[] R = new int[high];

        int i = 0, j=0; // define variable one time
        for (;  i<low ; i++) { // copy elements from arr to left sub-array
            L[i]=arr[left+i];
        }

        for(; j<high; j++) {
            R[j]= arr[middle+1+j]; // copy elements from arr to right sub-array
        }

        int k = left;
        i=0; j=0;

        // merge
        while(i<low && j<high) { // merge left and right sub-arrays
            if(L[i]<=R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<low) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<high) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }


    public static void mergeSort(int[] arr, int left, int right) {

        int middle;
        if(left<right) {
            middle = (left+right)/2;
            mergeSort(arr,left,middle);         // left sub-array
            mergeSort(arr,middle+1,right);  // right sub-array

            merge(arr,left,middle,right); // merge left and right sub-arrays
        }


    }

}
