// Lets talk about iteration over HashMap in Java.

// So there are basically 3 ways to iterate over a HashMap in Java:
// 1. Using entrySet() method
// 2. Using keySet() method
// 3. Using values() method

// 1. Using entrySet() method
// The entrySet() method returns a Set view of the mappings contained in this map.
// We can use this method to iterate over the HashMap and get both key and value at the same time.
public class IterationOverHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Iterating using entrySet() method
        System.out.println("Iterating using entrySet() method:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

// 2. Using keySet() method
// The keySet() method returns a Set view of the keys contained in this map.
// We can use this method to iterate over the HashMap and get only the keys, and then use the keys to get the corresponding values.
public class IterationOverHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); 
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        // Iterating using keySet() method
        System.out.println("Iterating using keySet() method:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}   

// 3. Using values() method
// The values() method returns a Collection view of the values contained in this map.       
// We can use this method to iterate over the HashMap and get only the values, but we won't have access to the keys in this case.
public class IterationOverHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);        
        map.put("Banana", 2);
        map.put("Orange", 3);
        // Iterating using values() method
        System.out.println("Iterating using values() method:");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}   

