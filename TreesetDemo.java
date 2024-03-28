import java.util.*;

// Sorted order
// Fast execution
// Stores large amount of data

public class TreesetDemo {
    public static void main(String[] args) {
        // TreeSet<String> ts = new TreeSet<String>();
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(30);
        ts.add(10);
        ts.add(0);
        ts.add(20);
        ts.add(50);
        ts.add(40);
        System.out.println(ts);
        System.out.println();
        
        // Ceiling
        System.out.println("CEILING OUTPUT: " + ts.ceiling(20));
        System.out.println("CEILING OUTPUT: " + ts.ceiling(25));

        // Floor
        System.out.println("FLOOR OUTPUT: " + ts.floor(30));
        System.out.println("FLOOR OUTPUT: " + ts.floor(25));

        // Lower
        System.out.println("LOWER OUTPUT: " + ts.lower(20));
        
        // Higher
        System.out.println("HIGHER OUTPUT: " + ts.higher(20));
        
        // First
        System.out.println("FIRST OUTPUT: " + ts.first());

        // Last
        System.out.println("LAST OUTPUT: " + ts.last());

        // PollFirst
        System.out.println("POLL FIRST OUTPUT: " + ts.pollFirst());
        
        // PollLast
        System.out.println("POLL LAST OUTPUT: " + ts.pollLast());
        
        System.out.println();
        System.out.println(ts);
    }
}


/*
Function of tree set:

1. ceiling(E e) - Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
2. floor(E e) - Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
3. lower(E e) - Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
4. higher(E e) - Returns the least element in this set strictly greater than the given element, or null if there is no such element.
5. first() - Returns the first (lowest) element currently in this set.
6. last() - Returns the last (highest) element currently in this set.
7. pollFirst() - Retrieves and removes the first (lowest) element, or returns null if this set is empty.
8. pollLast() - Retrieves and removes the last (highest) element, or returns null if this set is empty.

*/
