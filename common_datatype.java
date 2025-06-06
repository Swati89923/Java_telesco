// ✅ ArrayList in Java — Complete Explanation
//ArrayList is a resizable array implementation of the List interface in Java. It allows dynamic growth, unlike regular arrays which have a fixed size.
//🔸 Key Features of ArrayList
//Ordered (maintains insertion order)
//Allows duplicates
//Allows null values
//Resizable (grows automatically)
//Not synchronized (use Collections.synchronizedList() if needed)
// | Method                | Description                    |
// | --------------------- | ------------------------------ |
// | `add(E e)`            | Adds element to the list       |
// | `add(int index, E e)` | Adds element at specific index |
// | `get(int index)`      | Returns element at index       |
// | `set(int index, E e)` | Replaces element at index      |
// | `remove(int index)`   | Removes element at index       |
// | `size()`              | Returns number of elements     |
// | `contains(Object o)`  | Checks if element exists       |
// | `clear()`             | Removes all elements           |
// | `isEmpty()`           | Checks if list is empty        |

// 🧠 When to Use ArrayList
// When you need fast random access (via index)
// When frequent insertions/removals happen at the end
// Not ideal for frequent insertion/removal in the middle

// package basic_java_codes;
// import java.util.ArrayList;
// import java.util.Collection;
// public class common_datatype {
//     public static void main(String[] args) {
//         Collection  nums = new ArrayList();
//         nums.add(6);
//         nums.add(9);
//         nums.add(3);
//         nums.add(4);
        

//         System.out.println(nums);
//     }
// }


// package basic_java_codes;
// import java.util.ArrayList;
// import java.util.Collection;
// public class common_datatype {
//     public static void main(String[] args) {
//         Collection<Integer>  nums = new ArrayList<Integer>();
//         nums.add(6);
//         nums.add(9);
//         nums.add(3);
//         nums.add(4);
        
//         for (Object n: nums)
//         {
//             int num =(Integer)n;
//             System.out.println(num*2);
//         }

        
//     }
// }

// package basic_java_codes;

// import java.util.ArrayList;
// import java.util.List; // Use List instead of Collection

// public class common_datatype {
//     public static void main(String[] args) {
//         List<Integer> nums = new ArrayList<Integer>(); // List has get() and indexOf()
//         nums.add(6);
//         nums.add(9);
//         nums.add(3);
//         nums.add(4);

//         System.out.println(nums.indexOf(5)); // returns -1 (not found)
//         System.out.println(nums.get(2));     // returns 3
    

//         // for (Object n: nums)
//         // {
//         //     int num =(Integer)n;
//         //     System.out.println(num*2);
//         // }
//     }
// }




// Set in java
//In Java, a Set is a collection that contains no duplicate elements. It models the mathematical set abstraction.
// Set<Type> setName = new HashSet<>();
// 🔸 Set is part of the java.util package and extends the Collection interface.
//| Feature           | Description                                                               |
// | ----------------- | ------------------------------------------------------------------------- |
// | Unordered         | Elements are not stored in insertion order (unless using `LinkedHashSet`) |
// | No Duplicates     | Automatically removes duplicates                                          |
// | Allows null?      | Yes, only one `null` allowed in `HashSet`                                 |
// | Grows dynamically | Like other collection types                                               |

// | Class           | Ordering                           | Duplicate Handling | Performance                  |
// | --------------- | ---------------------------------- | ------------------ | ---------------------------- |
// | `HashSet`       | ❌ No order                         | ✅ No duplicates    | Fast (uses hashing)          |
// | `LinkedHashSet` | ✅ Maintains insertion order        | ✅ No duplicates    | Slightly slower than HashSet |
// | `TreeSet`       | ✅ Sorted (natural or custom order) | ✅ No duplicates    | Slowest, uses Red-Black Tree |

// package basic_java_codes;
// import java.util.*;
// public class common_datatype{
//     public static void main(String[] args) {
//         HashSet<String> fruits = new HashSet<>();

//         fruits.add("Apple");
//         fruits.add("Mango");
//         fruits.add("bananana");
//         fruits.add("litchi");

//         System.out.println("fruits: " + fruits);
   
// }

// }


// package basic_java_codes;

// import java.util.*;

// public class common_datatype {
//     public static void main(String[] args) {
//         HashSet<String> fruits = new HashSet<>();

//         fruits.add("Apple");
//         fruits.add("Mango");
//         fruits.add("bananana");
//         fruits.add("litchi");
//         fruits.add("litchi");
//         // Iterate and print
//         for (String fruit : fruits) {
//             System.out.println(fruit);
//         }
//     }
// }


// | Method             | Description                  |
// | ------------------ | ---------------------------- |
// | `add(E e)`         | Adds an element              |
// | `remove(Object o)` | Removes an element           |
// | `contains(E e)`    | Checks if element exists     |
// | `isEmpty()`        | Returns true if set is empty |
// | `size()`           | Returns number of elements   |
// | `clear()`          | Removes all elements         |


// 🔍 When to Use Set
// When you want to eliminate duplicates
// When order is not important (or you choose specific order via LinkedHashSet or TreeSet)
// For fast lookups (HashSet is very fast for contains())
// Let me know if you want:
// Differences between Set and List
// How TreeSet sorts elements
// Or internal working of HashSet using hashing!



// Map
//  In Java, a Map is an object that maps keys to values. Each key can map to only one value, and keys must be unique.
// Map<KeyType, ValueType> map = new HashMap<>();
//🔸 Example
// Map<Integer, String> students = new HashMap<>();
// students.put(101, "Aman");
// students.put(102, "Neha");
// students.put(103, "Ravi");
// 🔹 Key Features of Map

// | Feature                          | Description                                              |
// | -------------------------------- | -------------------------------------------------------- |
// | Stores key-value pairs           | Like a dictionary                                        |
// | Unique keys                      | No duplicate keys allowed                                |
// | Allows null                      | One `null` key and multiple `null` values (in `HashMap`) |
// | Not part of Collection hierarchy | But in `java.util` package                               |

//🔹 Common Implementations of Map

// | Class           | Ordering             | Nulls           | Use Case                       |
// | --------------- | -------------------- | --------------- | ------------------------------ |
// | `HashMap`       | No order             | ✅               | Fastest, commonly used         |
// | `LinkedHashMap` | Insertion order      | ✅               | Maintains order                |
// | `TreeMap`       | Sorted by keys       | ❌ (no null key) | When sorted keys needed        |
// | `Hashtable`     | Legacy, synchronized | ❌               | Thread-safe version of HashMap |

//🔹 Common Methods

// | Method                      | Description                      |
// | --------------------------- | -------------------------------- |
// | `put(K key, V value)`       | Adds a key-value pair            |
// | `get(Object key)`           | Gets the value for given key     |
// | `remove(Object key)`        | Removes entry with key           |
// | `containsKey(Object key)`   | Checks if key exists             |
// | `containsValue(Object val)` | Checks if value exists           |
// | `keySet()`                  | Returns set of all keys          |
// | `values()`                  | Returns collection of all values |
// | `entrySet()`                | Returns set of key-value pairs   |

// 🧠 When to Use Map
//When you need to store key-value pairs
//When you need fast access by key
//When the key must be unique


// | Interface / Class | Stores          | Allows Null? | Ordered?                  |
// | ----------------- | --------------- | ------------ | ------------------------- |
// | `Map` (interface) | Key-Value       | Varies       | Depends on implementation |
// | `HashMap`         | Unordered       | ✅            | ❌                         |
// | `LinkedHashMap`   | Insertion order | ✅            | ✅                         |
// | `TreeMap`         | Sorted by key   | ❌ (key)      | ✅                         |



// package basic_java_codes;

// import java.util.HashMap;
// import java.util.Map;

// public class common_datatype {
//     public static void main(String[] args) {
//         Map<String, Integer> student = new HashMap<>();
        
//         student.put("Ram", 98);
//         student.put("Shyam", 85);
//         student.put("Sita", 92);
//         student.put("Ram",99);
//         // Printing all entries
//         for (Map.Entry<String, Integer> entry : student.entrySet()) {
//             System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
//         }
//     }
// }
