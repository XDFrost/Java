// A map is a object that stores the asscoiation between keys and values
// Given a key you can find the value
// Keys and values both are objects
// Keys are unique
// Values can be duplicate
// Some maps can contain null keys and null values
// Maps do not implements iterable interface i.e. we can't cycle through elements using for each and iterators 
// We can obtain a collection view of the map which allows the use of either for loop or iterator



// 1. Map Interface
// Maps unique keys to values

// 2. Map entry Interface
// Represents a key-value pair stored in a map
// Inner class of maps

// 3. Navigation map interface
// implements sorted map interface
// extends map interface
// Used to get the closest matches to the given key

// 4. Sortedmap interface
// extends map interface
// extends navigable map interface
// keys are stored in ascending order


// Syntax: iterface Ma<X, Y>        Where X is key ; Y is value
// Exceptions:
    // 1. ClassCastException : Object is incomptible with the map
    // 2. NullPointerException : Map does not allow null keys or values
    // 3. IllegalArgumentException : Some aspect of the element prevents it from being added to the map
    // 4. UnsupportedOperationException : The put operation is not supported by the map


// Basic Operations:
    // 1. get() - Obtains the value of the key
    // 2. put() - Adds a key-value pair to the map


// COLLECTION VIEW : It means by which maps can be interated in large collection frameworks


// Important Functions: 
    // 1. EntrySet() - Returns a set/collection view of elements contained in the map ; USED FOR ITERATIONS
    // 2. KeySet() - Returns a set/collection view of keys contained in the map
    // 3. Values() - Returns a collection view of values contained in the map



// Types of Maps:

    // 1. SortedMap:
        // Ascending order
        // Syntax : iterface SortedMap<K, V> 
        // Exceptions:
            // 1. ClassCastException
            // 2. NullPointerException
            // 3. IllegalArgumentException
            // 4. NoSuchElementException 


// To get the submap:
    // 1. headMap() - Returns a view of the portion of the map whose keys are strictly less than the given key
    // 2. tailMap() - Returns a view of the portion of the map whose keys are greater than or equal to the given key
    // 3. subMap() - Returns a view of the portion of the map whose keys range from the given key to the second key

    
// To get the first and last key:
    // 1. firstKey() - Returns the first key in the map
    // 2. lastKey() - Returns the last key in the map



// Navigable Iterface
    // Extends SortedMap
    // Supports the retrieval of the closest matches to the given key
    // Syntax: interface NavigableMap<K, V>
    // Exceptions:
            // 1. ClassCastException
            // 2. NullPointerException
            // 3. IllegalArgumentException



//  Classes
    // 1. Hashmap extends AbstractMap class and implements Map interface 
        // Structure: Hash table
        // Exection time for get and put is same
        // Syntax: class HashMap<K, V>
        // Constructors: loadfactor/fillratio is the capacity of the hashmap that should be filled before increasing the capacity
            // 1. HashMap() - Creates an empty hashmap with default initial capacity 16 and load factor 0.75
            // 2. HashMap(int capacity) - Creates an empty hashmap with the specified initial capacity and default load factor 0.75
            // 3. HashMap(int capacity, float loadFactor) - Creates an empty hashmap with the specified initial capacity and load factor
            // 4. HashMap(Map<? extends K, ? extends V> m) - Creates a hashmap with the same mappings as the specified map
