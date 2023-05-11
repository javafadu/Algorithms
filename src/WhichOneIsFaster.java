import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;
import ShellSort.ShellSort;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {

    public static void main(String[] args) {
        int[] orderedArray = createOrderedArray(10000);
        int[] randomArray = createArray(10000);
        int[] copiedRandomArray2 = Arrays.copyOf(randomArray, randomArray.length);
        int[] copiedRandomArray3= Arrays.copyOf(randomArray, randomArray.length);
        int[] copiedRandomArray4= Arrays.copyOf(randomArray, randomArray.length);
        int[] copiedRandomArray5= Arrays.copyOf(randomArray, randomArray.length);
        int[] copiedRandomArray6= Arrays.copyOf(randomArray, randomArray.length);
        int[] copiedRandomArray7= Arrays.copyOf(randomArray, randomArray.length);

        long startTime;
        long endTime;
        double estimatedTime;

        // insertionSort
        startTime = System.currentTimeMillis();
        InsertionSort.insertionSort(randomArray);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime-startTime)/1000;
        System.out.println("Insertion Sort = "+estimatedTime);


        // insertionSort
        startTime = System.currentTimeMillis();
        SelectionSort.selectionSort(copiedRandomArray2);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime-startTime)/1000;
        System.out.println("Selection Sort = "+estimatedTime);

        // bubbleSort
        startTime = System.currentTimeMillis();
        BubbleSort.bubbleSort(copiedRandomArray3);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime-startTime)/1000;
        System.out.println("Selection Sort = "+estimatedTime);

        // mergeSort
        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(copiedRandomArray4,0,copiedRandomArray4.length-1);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime-startTime)/1000;
        System.out.println("Merge Sort = "+estimatedTime);

        // quickSort
        startTime = System.currentTimeMillis();
        QuickSort.quickSort(copiedRandomArray5,0,copiedRandomArray5.length-1);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime-startTime)/1000;
        System.out.println("Quick Sort = "+estimatedTime);

        // shellSort
        startTime = System.currentTimeMillis();
        ShellSort.shellSort(copiedRandomArray6);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime-startTime)/1000;
        System.out.println("Shell Sort = "+estimatedTime);

        // Arrays.sort
        startTime = System.currentTimeMillis();
        Arrays.sort(copiedRandomArray7);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime-startTime)/1000;
        System.out.println("Arrays Sort = "+estimatedTime);

        // Result Comment
        System.out.print("large number of elements: ");
        System.out.print("Insertion Sort, Selection Sort and Bubble Sort are slowest algorithms");

    }


    // create dynamic array
    public static int[] createArray(int numberOfElement) {
        int[] arr = new int[numberOfElement];

        Random rm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(10000);
        }
        return arr;
    }

    // create ordered array
    public static int[] createOrderedArray(int numberOfElement) {
        int[] arr = new int[numberOfElement];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }



}
