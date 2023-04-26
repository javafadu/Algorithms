package BigO;

public class O1 { // O(1) --> Constant Complexity

    public static void main(String[] args) {

        // task1: the last element of the array ?
        int[] arr = {10,4,2,6,4,33};
        System.out.println(arr[arr.length - 1]); // O(1)

        // task2: check the number is even or not ?
        int x = 24;
        if(x%2==0) System.out.println("Even"); // O(1)



    }
}
