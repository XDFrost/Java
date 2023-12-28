// Used to work with variable arguements
// Stores the provided arguements in an array

/* Ex:
        DataType MethodName(DataType ...ArrayName) {
            method body
        }
*/


public class VariableArguments {

    // static int sum(int a, int ...arr) {}            // Atleast one integer is required

    static int sum(int ...arr) {

        // Available as int[] arr

        int res = 0;
        for(int a:arr) {
            res+=a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Sum is: " + sum());
        System.out.println("Sum is: " + sum(1));
        System.out.println("Sum is: " + sum(1,2));
        System.out.println("Sum is: " + sum(1,2,3));
        System.out.println("Sum is: " + sum(1,2,3,4));
        System.out.println("Sum is: " + sum(1,2,3,4,5));
    }
}
