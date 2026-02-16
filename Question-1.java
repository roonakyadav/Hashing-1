import java.util.*;

public class Question1 {

    public static void main(String[] args) {

        /*
         Problem:
         We are given N elements and Q queries.

         First, we have to count how many times each element appears
         in the array (frequency counting).

         Then, for every query, we print how many times that element
         occurs in the array.

         This is solved using a HashMap (frequency map).

         Key   = Number (Element)
         Value = Frequency (How many times it appears)

         This technique is called "Preprocessing + Fast Queries".
        */


        /*
         Given Array (N elements)
         Example from lecture:
         2 6 3 8 2 8 2 3 8 10 6
        */
        int[] arr = {2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6};


        /*
         Queries (Q elements)
         We have to find frequency of these numbers
         Example:
         2 8 3 5
        */
        int[] queries = {2, 8, 3, 5};


        // Create a HashMap to store frequency
        // Example after processing:
        // {2=3, 6=2, 3=2, 8=3, 10=1}
        HashMap<Integer, Integer> freqMap = new HashMap<>();


        /*
         Step 1: Build Frequency Map
         Loop through the array and count occurrences
        */
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            // If number already exists, increase count
            if (freqMap.containsKey(num)) {

                int oldCount = freqMap.get(num);
                freqMap.put(num, oldCount + 1);

            }
            // If number appears first time, put count = 1
            else {

                freqMap.put(num, 1);

            }
        }


        /*
         After this loop,
         freqMap contains frequency of all elements
        */
        System.out.println("Frequency Map: " + freqMap);


        /*
         Step 2: Answer Queries
         For each query, check its frequency in map
        */
        System.out.println("Query Answers:");

        for (int i = 0; i < queries.length; i++) {

            int q = queries[i];

            // If query exists in map, print its frequency
            if (freqMap.containsKey(q)) {

                System.out.print(freqMap.get(q) + " ");

            }
            // If query does not exist, frequency is 0
            else {

                System.out.print(0 + " ");

            }
        }
    }
}