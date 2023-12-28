// Method is like a function 
// A method is a function written inside a class.
// Types:   
        // 1. Static  =>  Used if calling is done without object creation
        // 2. Non-static  =>  Used of calling is done with object creation; Creates individual entities for each object


/* Ex:
        dataType name(parameters) {                  datatype is of returning value
            method body
        }

        int sum(int a, int b) {
            int c = a+b;
            return c;
        }
*/

public class methods {

    static int staticlogic(int a, int b) {                    // if calling is done without object creation, only static method can be called
       if(a>b) {
            return a+b;
        }
        
        else {
            return (a+b)*5;
        }
    }

    int Nonstaticlogic(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {
        // Using Static Method
        System.out.println("Static Method");
        int a = 6;
        int b = 2;
        int ans = staticlogic(a, b);
        System.out.println(ans);
        
        int a1 = 6;
        int b1 = 8;
        int ans1 = staticlogic(a1, b1);
        System.out.println(ans1);   
        
        
        // Using Non-static Method
        System.out.println("Non Static method");
        methods obj = new methods();                 // Object creation; Syntax: classname object = new classname()
        int x = 5;
        int y = 3;
        int z = obj.Nonstaticlogic(x, y);
        System.out.println(z);
    }
}
