// What is HashMap in Java?

// HashMap is a part of Java's collection framework and is used to store data in key-value pairs. 
// It is a hash table based implementation of the Map interface. 
// HashMap allows null values and null keys, and it does not maintain any order of the elements. 
// It provides constant-time performance for basic operations like get and put, making it efficient for storing and retrieving data. 
// HashMap is not synchronized, which means it is not thread-safe, but it can be synchronized externally if needed.

import java.util.HashMap;
import java.util.Map;

public class Introduction {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        // Key is always unique, but values can be duplicated
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Retrieving a value using a key
        int value = map.get("Apple");
        System.out.println("Value for key 'Apple': " + value);

        // Checking if a key exists
        boolean containsKey = map.containsKey("Banana");
        System.out.println("Does the key 'Banana' exist? " + containsKey);

        // Removing a key-value pair
        map.remove("Orange");

        // Iterating through the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // All the functions and methods of HashMap are defined below:
    // put(K key, V value): Associates the specified value with the specified key in this map.
    // get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
    // containsKey(Object key): Returns true if this map contains a mapping for the specified key.
    // remove(Object key): Removes the mapping for the specified key from this map if present.
    // entrySet(): Returns a Set view of the mappings contained in this map.

}

// What is HashSet in Java?

// HashSet is a part of Java's collection framework and is used to store unique elements.
// It is a hash table based implementation of the Set interface.
// HashSet does not allow duplicate elements and does not maintain any order of the elements.
// It provides constant-time performance for basic operations like add, remove, and contains.
// HashSet is not synchronized, which means it is not thread-safe, but it can be synchronized externally if needed.

import java.util.HashSet;
import java.util.Set;
public class Introduction {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element, will not be added

        // Checking if an element exists
        boolean containsElement = set.contains("Banana");
        System.out.println("Does the element 'Banana' exist? " + containsElement);

        // Removing an element
        set.remove("Orange");

        // Iterating through the HashSet
        for (String element : set) {
            System.out.println("Element: " + element);
        }
    }
    // All the functions and methods of HashSet are defined below:
    // add(E e): Adds the specified element to this set if it is not already present.
    // contains(Object o): Returns true if this set contains the specified element.
    // remove(Object o): Removes the specified element from this set if it is present.
    // size(): Returns the number of elements in this set.  
}