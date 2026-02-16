import java.util.*;

public class Question2 {

    public static void main(String[] args) {

        /*
         Problem:
         Given an array of N elements,
         find how many distinct (unique) elements are present.

         Distinct means:
         No duplicates are counted more than once.

         Example:
         Input:  {3, 5, 6, 5, 4}
         Output: 4

         We use HashSet because:
         It stores only unique values.
        */


        // Given array
        int[] arr = {3, 5, 6, 5, 4};


        // Create HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();


        /*
         Step 1: Add all elements to HashSet
         Duplicates will be ignored automatically
        */
        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);

        }


        /*
         Step 2: Size of HashSet = Number of distinct elements
        */
        int ans = set.size();


        // Print answer
        System.out.println("Distinct count = " + ans);
    }
}