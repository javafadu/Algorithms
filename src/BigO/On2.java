package BigO;

public class On2 { // O(n^2) --> Quadratic Complexity



    public static void main(String[] args) {

        int count = 0;
        // task: sum of each element with same and others
        int[] arr = {2,3,5};

        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i]+arr[j]);
                count++;
            }
        }
        System.out.println("Count: "+count);

    }

}
