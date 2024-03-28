import java.util.*;

// Dynamic
// Uses queue, dequeue and linked list methods

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arr = new ArrayDeque<>();
        ArrayDeque<String> arr2 = new ArrayDeque<>();
        arr.add("A");
        arr.push("B");
        arr.add("C");
        arr.push("D");
        arr.add("E");

        System.out.println("Contents of array deque :- " + arr);
        System.out.println(arr2.containsAll(arr));
        
        while(arr.peek() != null) {
            System.out.println(arr.pop());
            System.out.println("Contents of array deque :- " + arr);
        }
    }
}
