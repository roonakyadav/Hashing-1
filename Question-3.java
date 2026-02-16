import java.util.*;

public class Question3 {

    public static void main(String[] args) {

        /*
         Problem:
         Find minimum distance between two equal elements.

         A special pair (i, j):
         - i != j
         - A[i] == A[j]
         - distance = |i - j|

         If no such pair exists, return -1.
        */


        int[] arr = {1, 2, 3, 1, 2};


        // Map: Number -> Last seen index
        HashMap<Integer, Integer> map = new HashMap<>();


        int minDist = Integer.MAX_VALUE;


        /*
         Loop through array
        */
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];


            // If number appeared before
            if (map.containsKey(num)) {

                int prevIndex = map.get(num);

                int dist = i - prevIndex;

                // Update minimum distance
                minDist = Math.min(minDist, dist);
            }


            // Update latest index of this number
            map.put(num, i);
        }


        // If no pair found
        if (minDist == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(minDist);
        }
    }
}