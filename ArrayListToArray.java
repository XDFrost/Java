import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        System.out.println("Size: " + a1.size());

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);

        System.out.println("Size: " + a1.size());
        System.out.println("Contents: " + a1);

        Integer[] arr = new Integer[a1.size()];
        arr = a1.toArray(arr);

        System.out.println("Array: " + arr);
        int sum = 0;
        for(int i:arr) {
            sum+=i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum is: " + sum);
    }
}
