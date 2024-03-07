package Class_Notes;

public class StringConstructor {
    public static void main(String[] args) {
        // Creating object from string class
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String s = new String(chars, 1, 3);               // Output: abcde when offset and count is not given
        System.out.println(s);                                         // Output: bcd when offset = 1 and count = 3; offset: Starting index; Count: Ending index     

        System.out.println();

        int n = 10;
        System.out.println("n = " + n);
    }
}
