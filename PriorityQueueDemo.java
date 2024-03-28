import java.util.*;

// Strores in ascending order by default

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // By default the capacity of Queue is 11
        // PriorityQueue<String> q=new PriorityQueue<>();
        // PriorityQueue<String> q=new PriorityQueue<String>();
        
     //   Reverse Order
        Comparator<? super String> reverseOrder = new Comparator<String>() {
            public int compare(String str1, String str2) {
                return str2.compareTo(str1);                    // 0 -> EQUAL ; 1 -> str2 > str1 ; -1 -> str2 < str1
            }
        };

        PriorityQueue<String> q = new PriorityQueue<>(reverseOrder);

        // q.add("java");
        q.add("DBMS");
        q.offer("JAVA");
        q.add("ML");
        q.add("B");
        q.add("A");
        q.add("C");
        // System.out.println("Content of element :- "+q.element());
        // System.out.println("Content of peek :- "+q.peek());
        System.out.println("Content of Queue :- "+q);
        System.out.println("Content of remove :- "+q.remove());
        System.out.println("Content of Queue :- "+q);
        System.out.println("Content of poll :- "+q.poll());
        System.out.println("Content of Queue :- "+q);
    }
}



// removes throws exception if queue is empty
// poll returns null if queue is empty
