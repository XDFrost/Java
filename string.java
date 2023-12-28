// In java String is a class but can be used as primitive data type
import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        // user input

        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        System.out.println(s);

        System.out.println(s.equals("abc"));


        // String methods

        // String name = new String("This is a string");
        String name = "This is also a string";
        System.out.println(name);

        inp.close();
    }
}
