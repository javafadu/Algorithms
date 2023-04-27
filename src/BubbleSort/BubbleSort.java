package BubbleSort;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        boolean swapped = false; // check if there is a swap in the loop

        do {

            swapped = false;  // prevent infinitive loop

            for (int i = 1; i <arr.length ; i++) {
                if(arr[i-1]>arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped=true;
                }
            }
        } while(swapped);

    }

}
