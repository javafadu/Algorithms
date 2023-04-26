package BigO;

public class On { // O(n) --> Linear Complexity

    public static void main(String[] args) {

        // task3: print all elements
        int[] arr = {10,4,2,6,4,33};
        for (int item:arr
             ) {
            System.out.println(item+", "); // O(n) n->6
        }
    }
}
