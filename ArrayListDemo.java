import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        System.out.println("Size: " + a1.size());
        
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        a1.add("E");
        
        a1.add(1, "A2");
        
        System.out.println("Size: " + a1.size());
        System.out.println("Contents: " + a1);
        
        a1.remove("D");         // Removing using element
        a1.remove(1);           // Removing using index
        
        System.out.println("Size: " + a1.size());
        System.out.println("Contents: " + a1);

        System.out.println(a1.hashCode());

        System.out.println(a1.get(0));
        System.out.println("C".equals(a1.get(2)));

        System.out.println(a1.indexOf("C"));
        System.out.println(a1.indexOf("Z"));        // Returns -1 if not found

        a1.set(0, "A1");        // Replace element at index 0 with "A1"
        System.out.println("Contents: " + a1);

        
    }
}
